package com.lojacar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lojacar")
public class VistaController {

	@GetMapping("")
	public String ver() {
		return "index";
	}
	
}
