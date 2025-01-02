package Daos;

import Dtos.WaffeDto;

import java.util.List;

public interface IWaffeDao {

    List<WaffeDto> readAll();
}
