package com.spring.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {	
	
	/*
	 * @RequestMapping("/studentView") public String studentView(StudnetInformation
	 * studentInformation) { return "studentView"; }
	 */
	
	@RequestMapping("/studentView")
	public String studentView(@ModelAttribute("stdInfo") StudnetInformation studentInformation) {
		return "studentView";
	}
//마무리못함
	
}
