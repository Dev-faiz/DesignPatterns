package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.model.Product;

@Controller
public class MyController {
	
	@GetMapping("/")
	public String getMain(Model model) {
		
		Product p = new Product();
		
		model.addAttribute( "name" , p.getName());
		
		return "main.html" ;
	}

}
