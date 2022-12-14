package com.spring.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
public class MainClass {
	// xml : extensible markup language
	// 태그를 만들어서 사용 가능, html 확장팩버전
	public static void main(String[] args) {
		String configLoc = "classpath:applicationCTX.XML"; //bean이 들어있는 xml
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);//ctx는 bean들을 갖고 있는 *컨테이너
		MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class); //빈 가져와서 넣음
		myInfo.getinfo();
		ctx.close();
	}	

}
