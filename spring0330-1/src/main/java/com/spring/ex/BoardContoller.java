package com.spring.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardContoller {
	
	@RequestMapping("/write")
	public String write(Model model) {
		model.addAttribute("uni", "��δ�");
		model.addAttribute("name", "�����");
		model.addAttribute("age", 22);
		model.addAttribute("star", "����");
		
		
		return "board/write"; //first�� �ϸ� �� ���ȿ� ������
	}
}
