package com.spring.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {
		String singatureStr = joinPoint.getSignature().toShortString();
		System.out.println(singatureStr + "is start.");
		long st = System.currentTimeMillis();
		
		try {
			Object obj = joinPoint.proceed();
			return obj;
		} finally {
			long et = System.currentTimeMillis();
			System.out.println(singatureStr + " is finished.");
			System.out.println(singatureStr + " 경과시간 : " + (et-st));
		}
		
	}
}
