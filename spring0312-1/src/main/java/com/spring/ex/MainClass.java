package com.spring.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
public class MainClass {
	// xml : extensible markup language
	// �±׸� ���� ��� ����, html Ȯ���ѹ���
	public static void main(String[] args) {
		String configLoc = "classpath:applicationCTX.XML"; //bean�� ����ִ� xml
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);//ctx�� bean���� ���� �ִ� *�����̳�
		StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);
		studentInfo.getStudentInfo();
		
		Student student2 = ctx.getBean("student2", Student.class);
		studentInfo.setStudent(student2);
		studentInfo.getStudentInfo();
		
		ctx.close();
	}	

}
