package Backend;

import Daos.IVolkDao;
import Dtos.VolkDto;

import java.util.List;

public class VolkService {

    private final IVolkDao iVolkDao;

    public VolkService(IVolkDao iVolkDao) {
        this.iVolkDao = iVolkDao;
    }

    public List<VolkDto> getAllVolk() {
        return iVolkDao.readAll();
    }

    public List<VolkDto> getAllVolkByZugehoerigkeitWithHauptsitz(String zugehoerigkeit) {
        return iVolkDao.readAllByZugehoerigkeitWithHauptsitz(zugehoerigkeit);
    }
}
