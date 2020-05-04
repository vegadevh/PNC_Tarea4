package com.uca.capas.products.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.products.domain.Product;

@Controller
public class ProductController {
	
	@RequestMapping("/productos")
	public ModelAndView productos() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("index");
		mav.addObject("product", new Product());
		
		return mav;
	}
	
	@RequestMapping("/validar")
	public ModelAndView procesar(@Valid @ModelAttribute Product product, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
			mav.setViewName("index");
		}else {
			product.getStock();
			mav.setViewName("validar");
			mav.addObject("nameProduct", "Producto " + product.getName() + " guardado con éxito");
		}
		
		return mav;
	}

}
