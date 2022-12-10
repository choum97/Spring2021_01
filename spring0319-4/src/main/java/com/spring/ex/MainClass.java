package com.spring.ex;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String config = null;

		System.out.println("문자열 입력 (dev / run) : ");

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
				System.out.println("잘못된 입력!");
				System.out.println("다시입력! (dev / run) : ");
				continue;
			}

		}
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config); //컨테이너 환경조성
		ctx.load("applicationCTX_dev.xml", "applicationCTX_run.xml");
		ServerInfo info = ctx.getBean("serverInfo", ServerInfo.class);
		
		System.out.println("ip :" + info.getIpNum());
		System.out.println("port :" + info.getPortNum());
		
		ctx.close();
	}
}
