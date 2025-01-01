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
            System.out.println("Fehler beim Laden der Ruestung (RuestungsDao/readAll): " + e.getMessage());
        }
        return volkDtoList;
    }
}
