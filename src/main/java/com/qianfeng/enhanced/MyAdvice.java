package com.qianfeng.enhanced;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAdvice {
	//ע���һ��*����Ҫ�ӿո�					
	@Pointcut("execution(* com.qianfeng.userserviceimpl.*UserServiceImpl.*(..))")
	public void pc(){
		
	}
	
	@Before("MyAdvice.pc()")
	public void before(){
		System.out.println("ǰ��֪ͨ");
	}
	
	@AfterReturning("MyAdvice.pc()")
	public void afterReturning(){
		System.out.println("�����������쳣ʱ�����ͺ���֪ͨ");
	}
	
	@Around("MyAdvice.pc()")
	public Object around(ProceedingJoinPoint point) throws Throwable{
		System.out.println("ǰ�û���֪ͨ");
		Object object = point.proceed();
		System.out.println("���û���֪ͨ");
		return object;
	}
	
	public void afterException(){
		System.out.println("�������쳣ʱ���ᷢ��֪ͨ");
	}
	
	public void after(){
		System.out.println("��Ҳ�Ǻ���֪ͨ,���㷽�������쳣Ҳ�����!");
	}
}
