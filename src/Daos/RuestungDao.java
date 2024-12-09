package Daos;

import Dtos.RuestungDto;
import Utils.ConnectionValues;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RuestungDao implements IRuestungDao{

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(ConnectionValues.URL, ConnectionValues.USER, ConnectionValues.PASSWORD);
    }

    private void closeConnection(Connection connection) throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    @Override
    public void create(RuestungDto dto) {
        //TODO
    }

    @Override
    public RuestungDto read() {
        //TODO
        return null;
    }

    @Override
    public List<RuestungDto> readAll() {
        List<RuestungDto> ruestungDtoListe = new ArrayList<>();
        String sql = "SELECT * FROM ruestung";
        try(Connection con = getConnection();
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                RuestungDto dto = new RuestungDto();
                dto.setRuestungsId(resultSet.getInt("mock"));;
                dto.setAusruestungsTyp(resultSet.getString("mock"));
                dto.setRuestungsTypId(resultSet.getInt("mock"));
                dto.setItemLevel(resultSet.getInt("mock"));
                dto.setMindestLevel(resultSet.getInt("mock"));
                dto.setRuestungsPunkte(resultSet.getInt("mock"));
            }
        } catch (SQLException e) {
            System.out.println("Fehler beim Laden der Ruestung (RuestungsDao/readAll): " + e.getMessage());
        }
        return ruestungDtoListe;
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
