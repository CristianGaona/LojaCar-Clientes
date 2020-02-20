package com.lojacar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lojacar.models.entity.Empleados;
import com.lojacar.models.service.IEmpleadoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/lojacar/v1")
public class EmpleadoController {

	@Autowired
	IEmpleadoService empleadoService;
	
	@GetMapping("/empleados")
	@ResponseStatus(HttpStatus.OK)
	public List<Empleados> getAll(){
		return empleadoService.findAll();
	}
	
	@GetMapping("/empleado/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Empleados getById(@PathVariable Long id) {
		return empleadoService.findById(id);
	}
	
	@PostMapping("/empleado")
	@ResponseStatus(HttpStatus.CREATED)
	public Empleados save(@RequestBody Empleados empleado) {
		return empleadoService.save(empleado);
	}
	
	/*@DeleteMapping("/empleado/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar (@PathVariable Long id) {
		return 0;
	}*/
	
}
