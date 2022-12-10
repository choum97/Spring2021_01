package com.spring.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
public class MainClass {
	// xml : extensible markup language
	// �±׸� ���� ��� ����, html Ȯ���ѹ���
	public static void main(String[] args) {
		String configLoc = "classpath:applicationCTX.XML"; //bean�� ����ִ� xml
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);//ctx�� bean���� ���� �ִ� *�����̳�
		Pencil pencil = ctx.getBean("pencil", Pencil.class);
		pencil.use();
		
		ctx.close();
	}	
}
