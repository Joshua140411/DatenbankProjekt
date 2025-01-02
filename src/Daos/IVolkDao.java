package Daos;

import Dtos.VolkDto;

import java.util.List;

public interface IVolkDao {

    List<VolkDto> readAll();
    List<VolkDto> readAllByZugehoerigkeitWithHauptsitz(String zugehoerigkeit);

}
