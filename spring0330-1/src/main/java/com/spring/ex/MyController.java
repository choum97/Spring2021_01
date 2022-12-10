package com.spring.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	//src > main > webapp > web-inf > views > 있음
	//스프링에서는 model을 메소드의 파라미터로 써버림
	//MVC - Model 정보 담아서 하는거
	
	@RequestMapping("/first")
	public String first() {
		
		
		return "first"; //이거에 접두사 접미사 붙어서 ex/first하면 나오는 것
	}
	
	@RequestMapping("content/second")
	public String second(Model model) {
		model.addAttribute("name", "김요한");
		
		return "content/second"; //뷰어의 이름
	}
	
	
	//http://localhost:8081/ex/content/third
	@RequestMapping("content/third")
	public ModelAndView second() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("star", "배수지");
		mv.setViewName("content/third");
		
		return mv; //뷰어의 이름
	}
}
