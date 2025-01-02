package Daos;

import Dtos.WaffentypDto;

import java.util.List;

public interface IWaffentypDao {

    List<WaffentypDto> readAllGetMaxDPSWeapon();
}
