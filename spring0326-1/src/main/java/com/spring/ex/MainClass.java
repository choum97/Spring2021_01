package com.spring.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		/*
		OOP - object oriented programming - ��ü ����
		AOP - Aspect-oriented programming - ���� ���� - �ٽɱ��(��, ���� ��)�� ������(Ŀ�ǳ�����)�� ����� ����!
		Alt �� �Ʒ� , ctrl + D ����
		
		Aspect : ����κ�, ����
		Advice : ����, ����κ� ��ü�� �����̽��� ��
		Jointpoint : ����, Ŀ�Ǹ� ���� �� ��� (����?)�κп� ���� �ϴ��� - ���� �޼ҵ�, ��� �޼ҵ尡 ����� �� ���� �ǳ�
		Pointcut : ����� ���� �ϴ���
		Weaving :
		*/
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("applicationCTX.xml");
		Student student = ctx.getBean("student", Student.class);
		student.getStudentInfo();
		
		Worker worker = ctx.getBean("worker", Worker.class);
		worker.getWorkerInfo();
		
		ctx.close();
	}
}
