package com.lojacar.models.service;

import java.util.List;

import com.lojacar.models.entity.Vehiculos;

public interface IVehiculoService {
	
	public List<Vehiculos> findAll();
	public Vehiculos findById(Long id);

}
