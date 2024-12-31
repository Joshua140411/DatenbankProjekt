package Daos;

import Dtos.RuestungDto;
import java.util.List;

public interface IRuestungDao {

    void create(RuestungDto dto);
    RuestungDto read(int id);
    List<RuestungDto> readAll();
    void update(RuestungDto dto);
    void delete(int id);
}
