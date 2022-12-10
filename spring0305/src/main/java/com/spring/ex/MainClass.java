package com.spring.ex;

public class MainClass {
	//3월 5일 DI IOC컨테이너 설명함 : A객체는 B, C에 의존한다 / IOC - 제어의 역전 / DI와 IOC 개념 -> 시험
	//*방법2 - B와 C 객체 외부에 따로 생성하여 A객체에 넣어준다 - 셋터나 생성자로 콜해서 사용 -> 스프링방법(인터페이스를 통한 부품화)
	// 방법1 - A객체가 B와 C객체를 직접 생성 -> 기존
	// 	 ->  방법2가 외부에 있기 때문에 유지보수시 훨씬 용이함 - 객체를 주입함(DI - 의존성주의)
	public static void main(String[] args) {
		Calulation calulation = new Calulation();
		calulation.setFirstNum(10);
		calulation.setSecondNum(2);
		
		calulation.add();
		calulation.sub();
		calulation.mul();
		calulation.dev();
	}

}
