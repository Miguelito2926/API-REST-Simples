package com.edsuperior.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edsuperior.demo.entities.Department;

@RestController //define o controlador
@RequestMapping(value = "/products") // Mapea o endpoint
public class ProductController {
	
	@GetMapping // Configuração para responder na Api Rest
	public Department getObjetos() {
		Department d1 = new Department();
		d1.setId(1L);
		d1.setName("Tech");
		
		return d1;
	}
	

}
