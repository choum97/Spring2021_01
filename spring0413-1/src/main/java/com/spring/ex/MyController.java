package com.spring.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {	
	
	@RequestMapping("/studentConfirm")
	public String studentView(HttpServletRequest httpServletRequest, Model model) {
		String id = httpServletRequest.getParameter("id");
		
		if(id.equals("asd")) return "redirect:studentOk";
	
		return "redirect:studentNg"; //스프링에서는 redirect 이렇게 사용
		
	}
	// http://localhost:8081/ex/studentConfirm?id=asd
	//http://localhost:8081/ex/studentOk?id=asd
	
	@RequestMapping("/studentOk")
	public String studentOk(Model model) {
		return "student/studentOk";
	}
	
	
	@RequestMapping("/studentNg")
	public String studentNg(Model model) {
		return "student/studentNg";
	}
	//redirect url로 하면 web-inf안에만 있으면 어디에 있든 찾아갈 수 있다.
	//강제로 보내는거라 권장하지는 않음
	//return "redirect:http://localhost:8081/ex/studentURL1.jsp"; URL로 사용가능
	//return "redirect:student/studentURL1";   ->uri도 가능
	
	
	//validator 비밀번호 같은거 입력할 때 인증처리 - 짧다던가 등
}
