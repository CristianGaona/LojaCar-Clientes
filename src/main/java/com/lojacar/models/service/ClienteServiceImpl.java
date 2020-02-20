package com.lojacar.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lojacar.models.dao.ClienteDao;
import com.lojacar.models.entity.Clientes;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private ClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Clientes> findAll() {
		// TODO Auto-generated method stub
		return (List<Clientes>) clienteDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Clientes findByiD(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	public Clientes save(Clientes cliente) {
		// TODO Auto-generated method stub
		return clienteDao.save(cliente);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		clienteDao.deleteById(id);
	}

}
