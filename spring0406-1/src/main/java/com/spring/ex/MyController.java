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
		
		// url�� 
		// http://localhost:8081/ex/confirmId?id=asd&pw=1234
		// �ϸ� ���̵�� ��й�ȣ ����
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "/confirmId"; //����� �̸�
	}
	
	@RequestMapping("/checkId")
	public String checkId(@RequestParam("id") String id, @RequestParam("pw") int pw, Model model) {
		
		// http://localhost:8081/ex/checkId?id=asd&pw=1234�ؾ� ���� �ȳ�
		// �׳��ϸ� 400������ -> ������̼� ������
		model.addAttribute("identify", id);
		model.addAttribute("password", pw);
		return "/checkId"; //����� �̸�
	}
	

}
