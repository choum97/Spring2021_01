package com.spring.ex;

public class MainClass {
	//3�� 5�� DI IOC�����̳� ������ : A��ü�� B, C�� �����Ѵ� / IOC - ������ ���� / DI�� IOC ���� -> ����
	//*���2 - B�� C ��ü �ܺο� ���� �����Ͽ� A��ü�� �־��ش� - ���ͳ� �����ڷ� ���ؼ� ��� -> ���������(�������̽��� ���� ��ǰȭ)
	// ���1 - A��ü�� B�� C��ü�� ���� ���� -> ����
	// 	 ->  ���2�� �ܺο� �ֱ� ������ ���������� �ξ� ������ - ��ü�� ������(DI - ����������)
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
