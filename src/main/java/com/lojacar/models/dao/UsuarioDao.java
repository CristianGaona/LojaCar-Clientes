package com.lojacar.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.lojacar.models.entity.Usuarios;

public interface UsuarioDao extends CrudRepository<Usuarios, Long> {

}
