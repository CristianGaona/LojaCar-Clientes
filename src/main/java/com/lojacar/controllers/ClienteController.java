package com.lojacar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lojacar.models.entity.Clientes;
import com.lojacar.models.entity.Empleados;
import com.lojacar.models.service.IClienteService;
import com.lojacar.models.service.IEmpleadoService;
import com.lojacar.models.service.IVehiculoService;

@RestController
@RequestMapping("/lojacar/v1")
public class ClienteController {

	@Autowired
	IClienteService clienteService;
	
	@Autowired
	IEmpleadoService empleadoService;
	
	@Autowired
	IVehiculoService vehiculoSerice;
	
	@GetMapping("/clientes")
	@ResponseStatus(HttpStatus.OK)
	public List<Clientes> getAll(){
		return clienteService.findAll();
	}
	
	@GetMapping("/cliente/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Clientes getById(Long id) {
		return clienteService.findByiD(id);
	}
	
	@PostMapping("/empleado/{id}/cliente")
	public Clientes save(@RequestBody Clientes clientes, @PathVariable Long id) {
		Empleados empleado = empleadoService.findById(id);
		clientes.setEmpleados(empleado);
		return clienteService.save(clientes);
	}
	
	@PostMapping("/cliente")
	@ResponseStatus(HttpStatus.CREATED)
	public Clientes save(@RequestBody Clientes cliente) {
		return clienteService.save(cliente);
	}
}
