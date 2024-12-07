package Daos;

import Dtos.RuestungDto;
import java.util.List;

public interface IRuestungDao {

    void create(RuestungDto dto);
    RuestungDto read();
    List<RuestungDto> readAll();
    void update();
    void delete();
}
