package com.spring.ex;

import org.springframework.context.support.GenericXmlApplicationContext;
public class MainClass {
	//
	public static void main(String[] args) {
	      GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
	      
	      ctx.load("classpath:applicationCTX1.xml");
	      ctx.refresh();
	      
	      Student student1 = ctx.getBean("student", Student.class);
	      System.out.println("�̸� : " + student1.getName());
	      System.out.println("���� : " + student1.getAge());
	      System.out.println("�̸� : " + student1.getName());
	      System.out.println("���� : " + student1.getAge());
	      System.out.println("�̸� : " + student1.getName());
	      System.out.println("���� : " + student1.getAge());
	      System.out.println("�̸� : " + student1.getName());
	      System.out.println("���� : " + student1.getAge());
	      System.out.println("�̸� : " + student1.getName());
	      System.out.println("���� : " + student1.getAge());
	      System.out.println("�̸� : " + student1.getName());
	      System.out.println("���� : " + student1.getAge());
	      
	      ctx.close();

	}	

}
