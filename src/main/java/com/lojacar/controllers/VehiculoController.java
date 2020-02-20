package com.lojacar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lojacar.models.entity.Vehiculos;
import com.lojacar.models.service.IVehiculoService;

@RestController
@RequestMapping("/lojacar/v1")
public class VehiculoController {

	@Autowired
	IVehiculoService vehiculoService;
	
	@GetMapping("/vehiculos")
	@ResponseStatus(HttpStatus.OK)
	public List<Vehiculos> getAll(){
		return vehiculoService.findAll();
	}
	
	@GetMapping("/vehiculo/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Vehiculos getById(@PathVariable Long id) {
		return vehiculoService.findById(id);
	}
	
	
}
