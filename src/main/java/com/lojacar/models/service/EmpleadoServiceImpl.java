package com.lojacar.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lojacar.models.dao.EmpleadoDao;
import com.lojacar.models.entity.Empleados;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	private EmpleadoDao empleadoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Empleados> findAll() {
		// TODO Auto-generated method stub
		return (List<Empleados>) empleadoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Empleados findById(Long id) {
		// TODO Auto-generated method stub
		return empleadoDao.findById(id).orElse(null);
	}

	@Override
	public Empleados save(Empleados empleado) {
		// TODO Auto-generated method stub
		return empleadoDao.save(empleado);
	}

}
