package com.spring.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	// xml : extensible markup language
	// 태그를 만들어서 사용 가능, html 확장팩버전
	public static void main(String[] args) {
		String configLoc="classpath:applicationCTX.xml"; //bean이 들어있는 xml
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);//ctx는 bean들을 갖고 있는 *컨테이너
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class); //(컨테이너에서 bean 가져와 정의해놨던 이름 , 클래스타입)

		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();
	}

}
