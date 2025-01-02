package Backend;

import Daos.IWaffentypDao;
import Dtos.WaffentypDto;
import java.util.List;

public class WaffenTypService {

    private final IWaffentypDao iWaffentypDao;

    public WaffenTypService(IWaffentypDao iWaffentypDao) {
        this.iWaffentypDao = iWaffentypDao;
    }

    public List<WaffentypDto> getAllWaffentypAndWaffe() {
        return iWaffentypDao.readAllGetMaxDPSWeapon();
    }
}
