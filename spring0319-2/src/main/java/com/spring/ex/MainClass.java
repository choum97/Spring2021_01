package com.spring.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	//
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX1.xml");

		Student student1 = ctx.getBean("student", Student.class);
		System.out.println("�̸� : " + student1.getName());
		System.out.println("���� : " + student1.getAge());
		System.out.println("=========================");

		Student student2 = ctx.getBean("student", Student.class);
		student2.setName("�Ѹ�");
		student2.setAge(21);

		System.out.println("�̸� : " + student2.getName());
		System.out.println("���� : " + student2.getAge());
		System.out.println("=========================");
		
		//�ּ� �� �Ȱ���
		if (student1.equals(student2)) {
			System.out.println("st1 == st2"); // ���� �� ����
		} else {
			System.out.println("st1 != st2"); //prototype�϶� ����   47page������
		}

		ctx.close();

	}

}
