package Daos;

import Dtos.RuestungDto;
import java.util.List;

public interface IRuestungDao {

    void create(RuestungDto dto);
    RuestungDto read(int position);
    List<RuestungDto> readAll();
    void update(int position, RuestungDto dto);
    void delete(int position);
}
