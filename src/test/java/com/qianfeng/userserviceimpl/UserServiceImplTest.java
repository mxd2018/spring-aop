package com.qianfeng.userserviceimpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qianfeng.iuserservice.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-test.xml")
public class UserServiceImplTest {
	@Autowired
	private UserService userServiceImpl;
	@Test
	public void TestAll(){
		/*ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-test.xml");
		//注意：这里需要使用接口才行，不然就得在配置文件xml中设置proxy-target-class="true"属性，指明使用cglib代理
		UserService userServiceImpl = ctx.getBean("userServiceImpl",UserService.class);*/
		userServiceImpl.save();
		/*userServiceImpl.delete();*/
	}
}
