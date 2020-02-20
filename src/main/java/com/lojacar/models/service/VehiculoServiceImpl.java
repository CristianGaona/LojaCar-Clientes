package com.lojacar.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lojacar.models.dao.VehiculoDao;
import com.lojacar.models.entity.Vehiculos;

@Service
public class VehiculoServiceImpl implements IVehiculoService {
	
	@Autowired
	private VehiculoDao vehiculoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Vehiculos> findAll() {
		// TODO Auto-generated method stub
		return (List<Vehiculos>) vehiculoDao.findAll();
		
	}

	@Override
	@Transactional(readOnly = true)
	public Vehiculos findById(Long id) {
		// TODO Auto-generated method stub
		return vehiculoDao.findById(id).orElse(null);
	}

}
