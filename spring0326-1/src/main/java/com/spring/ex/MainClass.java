package com.spring.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		/*
		OOP - object oriented programming - 객체 지향
		AOP - Aspect-oriented programming - 관점 지향 - 핵심기능(물, 우유 등)과 공통기능(커피내리기)과 나누어서 보자!
		Alt 위 아래 , ctrl + D 삭제
		
		Aspect : 공통부분, 관점
		Advice : 조언, 공통부분 자체를 어드바이스라 함
		Jointpoint : 접점, 커피를 만들 때 어느 (순간?)부분에 들어가야 하는지 - 들어가는 메소드, 어느 메소드가 실행될 때 들어가야 되나
		Pointcut : 어떤것이 들어가야 하는지
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
