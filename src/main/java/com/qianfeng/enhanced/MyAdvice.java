package com.qianfeng.enhanced;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAdvice {
	//注意第一个*后面要加空格					
	@Pointcut("execution(* com.qianfeng.userserviceimpl.*UserServiceImpl.*(..))")
	public void pc(){
		
	}
	
	@Before("MyAdvice.pc()")
	public void before(){
		System.out.println("前置通知");
	}
	
	@AfterReturning("MyAdvice.pc()")
	public void afterReturning(){
		System.out.println("方法不出现异常时，发送后置通知");
	}
	
	@Around("MyAdvice.pc()")
	public Object around(ProceedingJoinPoint point) throws Throwable{
		System.out.println("前置环绕通知");
		Object object = point.proceed();
		System.out.println("后置环绕通知");
		return object;
	}
	
	public void afterException(){
		System.out.println("当出现异常时，会发送通知");
	}
	
	public void after(){
		System.out.println("这也是后置通知,就算方法发生异常也会调用!");
	}
}
