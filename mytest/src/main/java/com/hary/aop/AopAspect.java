package com.hary.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author ankoye@qq.com
 * @date 2021/03/05
 */
@Component
@Aspect
public class AopAspect {

	@Before("execution(public * com.hary.aop.UserService.sayHello(..))")
	public void before(JoinPoint joinPoint) throws Throwable {
		System.out.println("before - before===");
	}

	@After("execution(public * com.hary.aop.UserService.after(..))")
	public void after(JoinPoint joinPoint) throws Throwable {
		System.out.println("after - after===");
	}

	@Around("execution(public * com.hary.service.*.*(..))")
	public Object around(ProceedingJoinPoint point) throws Throwable {
		System.out.println("around - before===");
		Object proceed = point.proceed();
		System.out.println("around - after===");
		return proceed;
	}
}
