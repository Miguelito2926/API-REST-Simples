package com.edsuperior.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edsuperior.demo.entities.Department;
import com.edsuperior.demo.entities.Product;

@RestController //define o controlador
@RequestMapping(value = "/products") // Mapea o endpoint
public class ProductController {
	
	@GetMapping // Configuração para responder na Api Rest
	public List <Product> getObjetos() { // Criando uma lista do tipo produtos
		Department d1 = new Department(1L,"Tech");
		Department d2 = new Department(2L,"Pet");
		
		Product p1 = new Product(1L, "MacBook", 2500.0, d1);
		Product p2 = new Product(1L, "PC Gamer", 2500.0, d1);
		Product p3 = new Product(1L, "PetHouse", 2500.0, d2);
		
		List<Product> list = Arrays.asList(p1, p2, p3); // instancia uma lista usando função Arrays.asList 
		
		return list; // retornando a lista
	}
	

}
