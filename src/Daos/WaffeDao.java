package Daos;

import Dtos.VolkDto;
import Dtos.WaffeDto;
import Utils.ConnectionValues;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WaffeDao implements IWaffeDao {

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(ConnectionValues.URL, ConnectionValues.USER, ConnectionValues.PASSWORD);
    }

    private void closeConnection(Connection connection) throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    @Override
    public List<WaffeDto> readAll() {
        List<WaffeDto> waffeDtoList = new ArrayList<>();
        String query = "SELECT * FROM Waffe";

        try(Connection con = getConnection();
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                WaffeDto waffeDto = new WaffeDto();
                waffeDto.setWaffenId(resultSet.getInt("WaffenID"));
                waffeDto.setBezeichnung(resultSet.getString("Bezeichnung"));
                waffeDto.setTempo(resultSet.getDouble("Tempo"));
                waffeDto.setDps(resultSet.getDouble("DPS"));
                waffeDtoList.add(waffeDto);
            }
            closeConnection(con);
        } catch (SQLException e) {
            System.out.println("Fehler beim Laden der Waffe (WaffeDao/readAll): " + e.getMessage());
        }
        return waffeDtoList;
    }
}
