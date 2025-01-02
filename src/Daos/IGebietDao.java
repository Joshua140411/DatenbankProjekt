package Daos;

import Dtos.GebietDto;

import java.util.List;

public interface IGebietDao {

    List<GebietDto> readAllWithContinent(String continent);

}
