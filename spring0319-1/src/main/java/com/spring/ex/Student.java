package com.spring.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("종료, 소멸");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("시작");
	}
	
}
