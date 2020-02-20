package com.lojacar.models.service;

import java.util.List;

import com.lojacar.models.entity.Clientes;


public interface IClienteService {

	public List<Clientes> findAll();
	public Clientes findByiD(Long id);
	public Clientes save(Clientes cliente);
	public void deleteById(Long id);
	
}
