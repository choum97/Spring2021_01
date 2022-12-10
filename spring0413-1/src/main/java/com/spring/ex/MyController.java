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
	
		return "redirect:studentNg"; //������������ redirect �̷��� ���
		
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
	//redirect url�� �ϸ� web-inf�ȿ��� ������ ��� �ֵ� ã�ư� �� �ִ�.
	//������ �����°Ŷ� ���������� ����
	//return "redirect:http://localhost:8081/ex/studentURL1.jsp"; URL�� ��밡��
	//return "redirect:student/studentURL1";   ->uri�� ����
	
	
	//validator ��й�ȣ ������ �Է��� �� ����ó�� - ª�ٴ��� ��
}
