package com.spring.ex;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String config = null;

		System.out.println("���ڿ� �Է� (4B / HB / 4BWithEraser) : ");

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
				System.out.println("�߸��� �Է�!");
				System.out.println("�ٽ��Է�! (4B / HB / 4BWithEraser) : ");
				continue;
			}

		}

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config); // �����̳� ȯ������
		ctx.load("applicationCTX_4B.xml", "applicationCTX_HB.xml", "applicationCTX_4Bwe.xml");
		// ServerInfo info = ctx.getBean("serverInfo", ServerInfo.class);
		Pencil pen = ctx.getBean("pencil", Pencil.class);

		System.out.println("��! :" + pen.getPen());

		ctx.close();
	}
}
