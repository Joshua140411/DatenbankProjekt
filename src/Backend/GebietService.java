package Backend;

import Daos.IGebietDao;
import Dtos.GebietDto;

import java.util.List;

public class GebietService {

    private final IGebietDao iGebietDao;

    public GebietService(IGebietDao iGebietDao) {
        this.iGebietDao = iGebietDao;
    }

    public List<GebietDto> getAllGebietWithContinent(String continent) {
        return iGebietDao.readAllWithContinent(continent);
    }
}
