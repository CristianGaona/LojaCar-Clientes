package com.lojacar.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.lojacar.models.entity.Empleados;


public interface EmpleadoDao extends CrudRepository<Empleados, Long>{

}
