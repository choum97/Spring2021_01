package com.spring.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	//�������� ���� bean�� ������ �̹����� �ܺο� �ִ°� �����
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");

		AdminConnection connection = ctx.getBean("adminConnection", AdminConnection.class);
		System.out.println("adminId : " + connection.getAdminId());
		System.out.println("adminPw : " + connection.getAdminPw());
		System.out.println("sub_adminId : " + connection.getSubAdminId());
		System.out.println("sub_adminPw : " + connection.getSubAdminPw());
		
		ctx.close();
	}
}
