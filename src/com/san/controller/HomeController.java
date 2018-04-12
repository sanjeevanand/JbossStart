package com.san.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model model){
		System.out.println("/static");
		/*Product product = productDao.getProductById(1);
		if(model != null)
		model.addAttribute(product);*/
		return "home";
	}
	static{
		System.out.println("static");
	}

}
