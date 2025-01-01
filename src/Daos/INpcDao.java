package Daos;

import Dtos.NpcDto;

import java.util.List;

public interface INpcDao {

    List<NpcDto> readNpcWithVolkId(int volkId);

}
