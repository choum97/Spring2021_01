package com.spring.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {	
	@RequestMapping("/confirmId")
	public String confirmId(HttpServletRequest httpServletRequest, Model model) {
		String id = httpServletRequest.getParameter("id");
		String pw = httpServletRequest.getParameter("pw");
		
		// url에 
		// http://localhost:8081/ex/confirmId?id=asd&pw=1234
		// 하면 아이디랑 비밀번호 나옴
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "/confirmId"; //뷰어의 이름
	}
	
	@RequestMapping("/checkId")
	public String checkId(@RequestParam("id") String id, @RequestParam("pw") int pw, Model model) {
		
		// http://localhost:8081/ex/checkId?id=asd&pw=1234해야 오류 안남
		// 그냥하면 400오류남 -> 어노테이션 때문에
		model.addAttribute("identify", id);
		model.addAttribute("password", pw);
		return "/checkId"; //뷰어의 이름
	}
	

}
