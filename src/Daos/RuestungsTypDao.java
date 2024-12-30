package Daos;

import Dtos.RuestungstypDto;
import Utils.ConnectionValues;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RuestungsTypDao implements IRuestungsTypDao{

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(ConnectionValues.URL, ConnectionValues.USER, ConnectionValues.PASSWORD);
    }

    private void closeConnection(Connection connection) throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    @Override
    public List<RuestungstypDto> readAll() {
        List<RuestungstypDto> ruestungsTypDtoListe = new ArrayList<>();
        String query = "SELECT * FROM ruestungstyp";

        try(Connection con = getConnection();
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                RuestungstypDto ruestungstypDto = new RuestungstypDto();
                ruestungstypDto.setRuestungstypID(resultSet.getInt("RuestungstypID"));
                ruestungstypDto.setBezeichnung(resultSet.getString("Bezeichnung"));
                ruestungsTypDtoListe.add(ruestungstypDto);
            }
            closeConnection(con);
        } catch (SQLException e) {
            System.out.println("Fehler beim Laden der Ruestung (RuestungsTypDao/readAll): " + e.getMessage());
        }
        return ruestungsTypDtoListe;
    }
}
