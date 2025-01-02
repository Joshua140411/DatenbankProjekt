package Daos;

import Dtos.RuestungDto;
import Dtos.VolkDto;
import Utils.ConnectionValues;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VolkDao implements IVolkDao{

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(ConnectionValues.URL, ConnectionValues.USER, ConnectionValues.PASSWORD);
    }

    private void closeConnection(Connection connection) throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    @Override
    public List<VolkDto> readAll() {
        List<VolkDto> volkDtoList = new ArrayList<>();
        String query = "SELECT * FROM Volk";

        try(Connection con = getConnection();
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                VolkDto volkDto = new VolkDto();
                volkDto.setVolkID(resultSet.getInt("VolkID"));
                volkDto.setName(resultSet.getString("Name"));
                volkDto.setZugehoerigkeit(resultSet.getString("Zugehoerigkeit"));
                volkDto.setHauptsitz(resultSet.getInt("Hauptsitz"));
                volkDto.setReittier(resultSet.getString("Reittier"));
                volkDto.setAnfuehrer(resultSet.getInt("Anfuehrer"));
                volkDtoList.add(volkDto);
            }
            closeConnection(con);
        } catch (SQLException e) {
            System.out.println("Fehler beim Laden des Volkes (VolkDao/readAll): " + e.getMessage());
        }
        return volkDtoList;
    }

    @Override
    public List<VolkDto> readAllByZugehoerigkeitWithHauptsitz(String zugehoerigkeit) {
        List<VolkDto> volkDtoList = new ArrayList<>();
        String query = "SELECT v.volkId, v.name AS VolkName, g.bezeichnung AS HauptsitzBezeichnung " +
                "FROM Volk v " +
                "JOIN Gebiet g ON v.hauptsitz = g.gebietID " +
                "WHERE v.zugehoerigkeit = ?";

        try(Connection con = getConnection();
            PreparedStatement statement = con.prepareStatement(query)) {

            statement.setString(1, zugehoerigkeit);

            try (ResultSet resultSet = statement.executeQuery()){
                while (resultSet.next()) {
                    VolkDto volkDto = new VolkDto();
                    volkDto.setVolkID(resultSet.getInt("VolkID"));
                    volkDto.setName(resultSet.getString("VolkName"));
                    volkDto.setHauptsitzBezeichnung(resultSet.getString("HauptsitzBezeichnung"));
                    volkDtoList.add(volkDto);
                }
            } catch (SQLException e) {
                System.out.println("Fehler beim Laden des Volkes (VolkDao/readAllByZugehoerigkeitWithHauptsitz): " + e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println("Fehler beim Laden des Volkes (VolkDao/readAllByZugehoerigkeitWithHauptsitz): " + e.getMessage());
        }
        return volkDtoList;
    }
}
