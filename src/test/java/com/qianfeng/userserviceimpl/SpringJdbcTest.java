package com.qianfeng.userserviceimpl;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qianfeng.studentdaoimpl.StudentImpl;

public class SpringJdbcTest {
	@SuppressWarnings("resource")
	@Test
	public void TestSpringJdbcTest(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-test3.xml");
		StudentImpl studao = ctx.getBean("studentDaoImpl",StudentImpl.class);
		studao.saveStu(3, "要成功要成功");
	}
	
	@Test
	public void TestfindStu(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-test3.xml");
		StudentImpl studao = ctx.getBean("studentDaoImpl",StudentImpl.class);
		studao.findStu(3);
	}
}
