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
	
	//���� ���� ���� ���
	/*
	 * @RequestMapping("member/join1") public String joinData(@RequestParam("name")
	 * String name, @RequestParam("id") String id, @RequestParam("pw") String
	 * pw, @RequestParam("email") String email , Model model) { Member member = new
	 * Member(); member.setName(name); member.setId(id); member.setPw(pw);
	 * member.setEmail(email);
	 * 
	 * model.addAttribute("memberInfo", member); return "member/join"; //����� �̸� }
	 */
	
	
	//�̰� ���� ��� -> �Ķ���� �ϳ� �Ἥ ������ - ������ ���
	//http://localhost:8081/ex/member/join?name=as&id=sas&pw=asd&email=wea
	@RequestMapping("member/join")
	public String joinData(Member member) { //�̸� ���ƾ� ���� �ȳ�
		return "member/join";
	}
	
	
	//�ּҸ� �˼� ��� ����, ���������� ������?
	//http://localhost:8081/ex/student/aaa 
	@RequestMapping("student/{studentName}")
	public String getStudent(@PathVariable String studentName, Model model) {
		model.addAttribute("studentName", studentName);
		return "student/studentView";
	}
	
	
	// index���� id �Է��ϸ�  studentId�� ���� id���� ������
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
	
	//@RequestMapping(method=RequestMethod.POST, value="/student")//post�� post��
	
}
