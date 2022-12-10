package com.spring.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	//
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX1.xml");

		Student student1 = ctx.getBean("student", Student.class);
		System.out.println("이름 : " + student1.getName());
		System.out.println("나이 : " + student1.getAge());
		System.out.println("=========================");

		Student student2 = ctx.getBean("student", Student.class);
		student2.setName("둘리");
		student2.setAge(21);

		System.out.println("이름 : " + student2.getName());
		System.out.println("나이 : " + student2.getAge());
		System.out.println("=========================");
		
		//주소 값 똑같음
		if (student1.equals(student2)) {
			System.out.println("st1 == st2"); // 같은 값 참조
		} else {
			System.out.println("st1 != st2"); //prototype일땐 여기   47page에있음
		}

		ctx.close();

	}

}
