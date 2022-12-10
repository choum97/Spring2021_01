package com.spring.ex;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String config = null;

		System.out.println("문자열 입력 (4B / HB / 4BWithEraser) : ");

		while (true) {
			Scanner sc = new Scanner(System.in);
			String str = sc.next();

			if (str.equals("4B")) {
				config = "4B";
				break;
			} else if (str.equals("HB")) {
				config = "HB";
				break;
			} else if (str.equals("4BWithEraser")) {
				config = "HB";
				break;
			} else {
				System.out.println("잘못된 입력!");
				System.out.println("다시입력! (4B / HB / 4BWithEraser) : ");
				continue;
			}

		}

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config); // 컨테이너 환경조성
		ctx.load("applicationCTX_4B.xml", "applicationCTX_HB.xml", "applicationCTX_4Bwe.xml");
		// ServerInfo info = ctx.getBean("serverInfo", ServerInfo.class);
		Pencil pen = ctx.getBean("pencil", Pencil.class);

		System.out.println("펜! :" + pen.getPen());

		ctx.close();
	}
}
