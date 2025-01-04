package Daos;

import Dtos.WaffentypDto;
import Utils.ConnectionValues;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WaffentypDao implements IWaffentypDao {

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(ConnectionValues.URL, ConnectionValues.USER, ConnectionValues.PASSWORD);
    }

    private void closeConnection(Connection connection) throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    @Override
    public List<WaffentypDto> readAllGetMaxDPSWeapon() {
        List<WaffentypDto> waffentypDtoList = new ArrayList<>();
        String query = "WITH MaxDPSPerWaffentyp AS (\n" +
                "    SELECT w.WaffentypID, MAX(w.DPS) AS MaxDPS\n" +
                "    FROM \n" +
                "        Waffe w\n" +
                "    GROUP BY \n" +
                "        w.WaffentypID\n" +
                ")\n" +
                "SELECT wt.WaffentypID, wt.Bezeichnung AS Waffentyp, w.Bezeichnung AS WaffeName, m.MaxDPS\n" +
                "FROM \n" +
                "    MaxDPSPerWaffentyp m\n" +
                "JOIN \n" +
                "    Waffe w ON m.WaffentypID = w.WaffentypID AND m.MaxDPS = w.DPS\n" +
                "JOIN \n" +
                "    Waffentyp wt ON wt.WaffentypID = w.WaffentypID\n" +
                "ORDER BY \n" +
                "    m.MaxDPS DESC;";
        try (Connection con = getConnection();
             Statement statement = con.createStatement();
             ResultSet resultSet = statement.executeQuery(query)){

            while (resultSet.next()) {
                WaffentypDto waffentypDto = new WaffentypDto();
                waffentypDto.setWaffentypID(resultSet.getInt("waffentypID"));
                waffentypDto.setBezeichnung(resultSet.getString("Waffentyp"));
                waffentypDto.setWaffenBezeichnung(resultSet.getString("WaffeName"));
                waffentypDto.setWaffenDPS(resultSet.getDouble("MaxDPS"));
                waffentypDtoList.add(waffentypDto);
            }
            closeConnection(con);
        } catch (SQLException e) {
            System.out.println("Fehler beim Laden des Waffetyps (WaffeTypDao/readAllGetMaxDPSWeapon): " + e.getMessage());
        }
        return waffentypDtoList;
    }
}
