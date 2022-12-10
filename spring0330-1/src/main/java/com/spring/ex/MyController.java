package com.spring.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	//src > main > webapp > web-inf > views > ����
	//������������ model�� �޼ҵ��� �Ķ���ͷ� �����
	//MVC - Model ���� ��Ƽ� �ϴ°�
	
	@RequestMapping("/first")
	public String first() {
		
		
		return "first"; //�̰ſ� ���λ� ���̻� �پ ex/first�ϸ� ������ ��
	}
	
	@RequestMapping("content/second")
	public String second(Model model) {
		model.addAttribute("name", "�����");
		
		return "content/second"; //����� �̸�
	}
	
	
	//http://localhost:8081/ex/content/third
	@RequestMapping("content/third")
	public ModelAndView second() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("star", "�����");
		mv.setViewName("content/third");
		
		return mv; //����� �̸�
	}
}
