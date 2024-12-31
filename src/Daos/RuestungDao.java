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
        String query = "INSERT INTO ruestung VALUES (?, ?, ?, ?, ?, ?)";

        try(Connection con = getConnection();
            PreparedStatement statement = con.prepareStatement(query)) {

            statement.setInt(1, dto.getRuestungsId());
            statement.setString(2, dto.getAusruestungsTyp());
            statement.setInt(3, dto.getRuestungsTypId());
            statement.setInt(4, dto.getItemLevel());
            statement.setInt(5, dto.getMindestLevel());
            statement.setInt(6, dto.getRuestungsPunkte());
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Fehler beim Laden der Ruestung (RuestungsDao/create): " + e.getMessage());
        }
    }

    @Override
    public RuestungDto read(int id) {
        RuestungDto ruestungDto = new RuestungDto();
        String query = "SELECT * FROM RUESTUNG WHERE AusruestungsID = ?";

        try(Connection con = getConnection();
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery()) {

            statement.setInt(1, id);

            while(resultSet.next()) {
                ruestungDto.setRuestungsId(resultSet.getInt("AusruestungsID"));;
                ruestungDto.setAusruestungsTyp(resultSet.getString("Ausruestungstyp"));
                ruestungDto.setRuestungsTypId(resultSet.getInt("RuestungstypID"));
                ruestungDto.setItemLevel(resultSet.getInt("ItemLevel"));
                ruestungDto.setMindestLevel(resultSet.getInt("MindestLevel"));
                ruestungDto.setRuestungsPunkte(resultSet.getInt("RuestungsPunkte"));
            }
            closeConnection(con);
        } catch (SQLException e) {
            System.out.println("Fehler beim Laden der Ruestung (RuestungsDao/read): " + e.getMessage());
        }
        return ruestungDto;
    }

    @Override
    public List<RuestungDto> readAll() {
        List<RuestungDto> ruestungDtoListe = new ArrayList<>();
        String query = "SELECT * FROM ruestung";

        try(Connection con = getConnection();
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                RuestungDto ruestungDto = new RuestungDto();
                ruestungDto.setRuestungsId(resultSet.getInt("AusruestungsID"));;
                ruestungDto.setAusruestungsTyp(resultSet.getString("Ausruestungstyp"));
                ruestungDto.setRuestungsTypId(resultSet.getInt("RuestungstypID"));
                ruestungDto.setItemLevel(resultSet.getInt("ItemLevel"));
                ruestungDto.setMindestLevel(resultSet.getInt("MindestLevel"));
                ruestungDto.setRuestungsPunkte(resultSet.getInt("RuestungsPunkte"));
                ruestungDtoListe.add(ruestungDto);
            }
            closeConnection(con);
        } catch (SQLException e) {
            System.out.println("Fehler beim Laden der Ruestung (RuestungsDao/readAll): " + e.getMessage());
        }
        return ruestungDtoListe;
    }

    @Override
    public void update(RuestungDto ruestungDto) {
        String query = "UPDATE ruestung SET ausruestungsTyp = ?, ruestungsTypId = ?, itemLevel = ?, mindestLevel = ?, ruestungsPunkte = ? WHERE ausruestungsID = ?";

        try (Connection con = getConnection();
             PreparedStatement statement = con.prepareStatement(query)) {

            statement.setString(1, ruestungDto.getAusruestungsTyp());
            statement.setInt(2, ruestungDto.getRuestungsTypId());
            statement.setInt(3, ruestungDto.getItemLevel());
            statement.setInt(4, ruestungDto.getMindestLevel());
            statement.setInt(5, ruestungDto.getRuestungsPunkte());
            statement.setInt(6, ruestungDto.getRuestungsId());
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Fehler beim Aktualisieren der Ruestung (RuestungsDao/update): " + e.getMessage());
        }
    }

    @Override
    public void delete(int id) {
        String query = "DELETE FROM ruestung WHERE ausruestungsId = ?";

        try (Connection con = getConnection();
             PreparedStatement statement = con.prepareStatement(query)) {

            statement.setInt(1, id);
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Fehler beim Löschen der Ruestung (RuestungsDao/delete): " + e.getMessage());
        }
    }
}
