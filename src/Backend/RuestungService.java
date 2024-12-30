package Backend;

import Daos.IRuestungDao;
import Dtos.RuestungDto;
import java.util.List;

public class RuestungService {

    private final IRuestungDao iRuestungDao;

    public RuestungService(IRuestungDao iRuestungDao) {
        this.iRuestungDao = iRuestungDao;
    }

   public void addRuestung(RuestungDto ruestungDto) {
        iRuestungDao.create(ruestungDto);
   }

   public RuestungDto getRuestungById(int id) {
        return iRuestungDao.read(id);
   }

   public List<RuestungDto> getAllRuestung() {
        return iRuestungDao.readAll();
   }

   public void updateRuestung(int position, RuestungDto ruestungDto) {
        iRuestungDao.update(position, ruestungDto);
   }

   public void deleteRuestungById(int id) {
        iRuestungDao.delete(id);
   }
}