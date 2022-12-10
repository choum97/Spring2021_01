package com.spring.ex;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class LogAop {
	@Pointcut("within(com.spring.ex.*)")
	private void pointcutMethod() {
	}
	@Around("pointcutMethod()")
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
