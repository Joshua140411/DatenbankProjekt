package Backend;

import Daos.IRuestungsTypDao;
import Daos.RuestungsTypDao;
import Dtos.RuestungstypDto;

import java.util.List;

public class RuestungsTypService {

    private IRuestungsTypDao iRuestungsTypDao;

    public RuestungsTypService(IRuestungsTypDao iRuestungsTypDao) {
        iRuestungsTypDao = new RuestungsTypDao();
    }

    public List<RuestungstypDto> getAllRuestungsTyp() {
        return iRuestungsTypDao.readAll();
    }
}
