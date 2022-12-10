package com.spring.ex;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String config = null;

		System.out.println("���ڿ� �Է� (dev / run) : ");

		while (true) {
			Scanner sc = new Scanner(System.in);
			String str = sc.next();

			if (str.equals("dev")) {
				config = "dev";
				break;
			} else if (str.equals("run")) {
				config = "run";
				break;
			} else {
				System.out.println("�߸��� �Է�!");
				System.out.println("�ٽ��Է�! (dev / run) : ");
				continue;
			}

		}
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config); //�����̳� ȯ������
		ctx.load("applicationCTX_dev.xml", "applicationCTX_run.xml");
		ServerInfo info = ctx.getBean("serverInfo", ServerInfo.class);
		
		System.out.println("ip :" + info.getIpNum());
		System.out.println("port :" + info.getPortNum());
		
		ctx.close();
	}
}
