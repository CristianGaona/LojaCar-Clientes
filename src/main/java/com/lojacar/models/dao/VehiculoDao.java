package com.lojacar.models.dao;

import org.springframework.data.repository.CrudRepository;


import com.lojacar.models.entity.Vehiculos;

public interface VehiculoDao extends CrudRepository<Vehiculos, Long>{

}
