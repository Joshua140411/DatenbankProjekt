package Backend;

import Daos.INpcDao;
import Dtos.NpcDto;

import java.util.List;

public class NpcService {

    private final INpcDao iNpcDao;

    public NpcService(INpcDao iNpcDao) {
        this.iNpcDao = iNpcDao;
    }

    public List<NpcDto> getAllNpcByVolkId(int volkId) {
        return iNpcDao.readNpcWithVolkId(volkId);
    }
}
