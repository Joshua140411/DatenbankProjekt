package Daos;

import Dtos.NpcDto;
import Utils.ConnectionValues;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NpcDao implements INpcDao {

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(ConnectionValues.URL, ConnectionValues.USER, ConnectionValues.PASSWORD);
    }

    private void closeConnection(Connection connection) throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    @Override
    public List<NpcDto> readNpcWithVolkId(int volkId) {
        List<NpcDto> npcDtoList = new ArrayList<>();
        String query = "SELECT n.npcID, n.name, n.ambitionen, v.name AS volkname FROM NPC n JOIN volk v ON n.volk = v.volkID WHERE n.volk = ?";

        try (Connection con = getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(query)){

            preparedStatement.setInt(1, volkId);

            try(ResultSet resultSet = preparedStatement.executeQuery()) {
                while(resultSet.next()) {
                    NpcDto npcDto = new NpcDto();
                    npcDto.setNpcID(resultSet.getInt("NpcId"));
                    npcDto.setName(resultSet.getString("Name"));
                    npcDto.setVolk(volkId);
                    npcDto.setAmbitionen(resultSet.getString("Ambitionen"));
                    npcDto.setVolkBezeichnug(resultSet.getString("Volkname"));
                    npcDtoList.add(npcDto);
                }
                closeConnection(con);
            } catch (SQLException e) {
                System.out.println("Fehler beim Laden der Ruestung (RuestungsDao/read): " + e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println("Fehler beim Laden des NPC (NpcDao/readNpcWithVolkId): " + e.getMessage());
        }
        if (npcDtoList.isEmpty()) {
            System.out.println("Dem Volk mit der ID: " + volkId + " gehoert kein NPC an!");
            System.out.println();
        }
        return npcDtoList;
    }
}
