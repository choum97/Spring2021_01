package com.spring.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	// xml : extensible markup language
	// �±׸� ���� ��� ����, html Ȯ���ѹ���
	public static void main(String[] args) {
		String configLoc="classpath:applicationCTX.xml"; //bean�� ����ִ� xml
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);//ctx�� bean���� ���� �ִ� *�����̳�
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class); //(�����̳ʿ��� bean ������ �����س��� �̸� , Ŭ����Ÿ��)

		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();
	}

}
