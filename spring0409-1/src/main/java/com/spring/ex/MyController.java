package com.spring.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.ex.member.Member;

@Controller
public class MyController {	
	
	//별로 좋지 않은 방법
	/*
	 * @RequestMapping("member/join1") public String joinData(@RequestParam("name")
	 * String name, @RequestParam("id") String id, @RequestParam("pw") String
	 * pw, @RequestParam("email") String email , Model model) { Member member = new
	 * Member(); member.setName(name); member.setId(id); member.setPw(pw);
	 * member.setEmail(email);
	 * 
	 * model.addAttribute("memberInfo", member); return "member/join"; //뷰어의 이름 }
	 */
	
	
	//이게 좋은 방법 -> 파라미터 하나 써서 끝내자 - 스프링 방법
	//http://localhost:8081/ex/member/join?name=as&id=sas&pw=asd&email=wea
	@RequestMapping("member/join")
	public String joinData(Member member) { //이름 값아야 오류 안남
		return "member/join";
	}
	
	
	//주소를 알수 없어서 좋음, 변수명으로 들어가져서?
	//http://localhost:8081/ex/student/aaa 
	@RequestMapping("student/{studentName}")
	public String getStudent(@PathVariable String studentName, Model model) {
		model.addAttribute("studentName", studentName);
		return "student/studentView";
	}
	
	
	// index가서 id 입력하면  studentId로 가서 id값을 보여줌
	@RequestMapping("/index")
	public String goIndex() {
		return "index";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/student")
	public String goStudent(HttpServletRequest httpServletRequest, Model model) {
		System.out.println("RequestMethod.GET");
		
		String id = httpServletRequest.getParameter("id");
		System.out.println("ID : " + id);
		model.addAttribute("studentId", id);
		
		return "student/studentId";
	}
	
	//@RequestMapping(method=RequestMethod.POST, value="/student")//post면 post로
	
}
