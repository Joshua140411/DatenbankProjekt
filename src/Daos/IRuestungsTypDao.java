package Daos;

import Dtos.RuestungstypDto;
import java.util.List;

public interface IRuestungsTypDao {

    List<RuestungstypDto> readAll();
}
