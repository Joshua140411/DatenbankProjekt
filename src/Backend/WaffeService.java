package Backend;

import Daos.IWaffeDao;
import Dtos.WaffeDto;

import java.util.List;

public class WaffeService {

    private final IWaffeDao iWaffeDao;

    public WaffeService(IWaffeDao iWaffeDao) {
        this.iWaffeDao = iWaffeDao;
    }

    public List<WaffeDto> getAll() {
        return iWaffeDao.readAll();
    }
}
