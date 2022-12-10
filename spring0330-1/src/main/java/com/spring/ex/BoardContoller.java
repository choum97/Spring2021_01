package com.spring.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardContoller {
	
	@RequestMapping("/write")
	public String write(Model model) {
		model.addAttribute("uni", "경민대");
		model.addAttribute("name", "김요한");
		model.addAttribute("age", 22);
		model.addAttribute("star", "수지");
		
		
		return "board/write"; //first로 하면 더 보안에 좋다함
	}
}
