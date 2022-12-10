package com.spring.ex;

public class Calulation {
	private int firstNum;
	private int secondNum;
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int flistNum) {
		this.firstNum = flistNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public void add() {
		System.out.println("add()");
		System.out.println(firstNum + " + " + secondNum + " = " + (firstNum+secondNum));
	}
	
	public void sub() {
		System.out.println("sub()");
		System.out.println(firstNum + " - " + secondNum + " = " + (firstNum-secondNum));	
	}
	
	public void mul() {
		System.out.println("mul()");
		System.out.println(firstNum + " * " + secondNum + " = " + (firstNum*secondNum));
	}
	
	public void dev() {
		System.out.println("dev()");
		System.out.println(firstNum + " / " + secondNum + " = " + (firstNum/secondNum));
	}
}
