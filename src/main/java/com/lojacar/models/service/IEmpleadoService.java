package com.lojacar.models.service;

import java.util.List;

import com.lojacar.models.entity.Empleados;

public interface IEmpleadoService {
	
	public List<Empleados> findAll();
	public Empleados findById(Long id);
	public Empleados save(Empleados empleado);

}
