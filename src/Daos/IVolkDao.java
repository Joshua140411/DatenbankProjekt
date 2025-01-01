package Daos;

import Dtos.VolkDto;

import java.util.List;

public interface IVolkDao {

    List<VolkDto> readAll();

}
