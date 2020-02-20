package com.lojacar.models.service;

import java.util.List;

import com.lojacar.models.entity.Usuarios;

public interface IUsuarioService {
	public List<Usuarios> findAll();
	public Usuarios finById(Long id);
	public Usuarios save(Usuarios usuario);
	public void deleteById( Long id);
}
