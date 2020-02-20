package com.lojacar.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.lojacar.models.entity.Clientes;

public interface ClienteDao extends CrudRepository<Clientes, Long>{

}
