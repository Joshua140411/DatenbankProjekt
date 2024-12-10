package Backend;

import Daos.IRuestungDao;
import Dtos.RuestungDto;

import java.util.List;

public class RuestungService {

    private IRuestungDao iRuestungDao;

    public RuestungService(IRuestungDao iRuestungDao) {
        this.iRuestungDao = iRuestungDao;
    }

   public void addRuestung(RuestungDto ruestungDto) {
        iRuestungDao.create(ruestungDto);
   }

   public List<RuestungDto> getAllRuestung() {
        return iRuestungDao.readAll();
   }
}