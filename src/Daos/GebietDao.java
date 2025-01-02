package Daos;

import Dtos.GebietDto;
import Utils.ConnectionValues;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GebietDao implements IGebietDao {

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(ConnectionValues.URL, ConnectionValues.USER, ConnectionValues.PASSWORD);
    }

    private void closeConnection(Connection connection) throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    @Override
    public List<GebietDto> readAllWithContinent(String continent) {
        List<GebietDto> gebietDtoList = new ArrayList<>();
        String query = "WITH RECURSIVE GebietsHierarchie AS (\n" +
                "    SELECT GebietID, Bezeichnung, Kontinent, istHauptstadt, Obergebiet\n" +
                "    FROM Gebiet\n" +
                "    WHERE Kontinent = ? AND istHauptstadt = 0\n" +
                "\n" +
                "    UNION ALL\n" +
                "\n" +
                "    SELECT g.GebietID, g.Bezeichnung, g.Kontinent, g.istHauptstadt, g.Obergebiet\n" +
                "    FROM Gebiet g\n" +
                "    INNER JOIN GebietsHierarchie gh ON g.Obergebiet = gh.GebietID\n" +
                "    WHERE g.Kontinent = ? AND g.istHauptstadt = 0\n" +
                ")\n" +
                "SELECT DISTINCT Bezeichnung\n" +
                "FROM GebietsHierarchie\n" +
                "ORDER BY Bezeichnung ASC;";

        try (Connection con = getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(query)) {

            preparedStatement.setString(1, continent);
            preparedStatement.setString(2, continent);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    GebietDto gebietDto = new GebietDto();
                    gebietDto.setBezeichnung(resultSet.getString("Bezeichnung"));
                    gebietDtoList.add(gebietDto);
                }
                closeConnection(con);
            } catch (SQLException e) {
                System.out.println("Fehler beim Laden der Gebiete (GebietDao/readAllWithContinent): " + e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println("Fehler beim Laden der Gebiete (GebietDao/readAllWithContinent): " + e.getMessage());
        }
        return gebietDtoList;
    }
}
