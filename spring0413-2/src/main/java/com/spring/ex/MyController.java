package com.spring.ex;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {	
	@RequestMapping("/studentForm")
	public String studentForm() {
		return "createPage";
	}

	@RequestMapping("/create") 
	public String studentCreate(@ModelAttribute("student") Student student, BindingResult result) {
		//ModelAttribute ∫∞ƒ™¡‡º≠ ±Ê¿Ã ¡Ÿø©¡‹
		
		String page = "createDonePage";
		
		StudentValidator validator = new StudentValidator();
		validator.validate(student, result);
		if(result.hasErrors()) {
			page = "cratePage";
		}
		
		return page;
	}
}
