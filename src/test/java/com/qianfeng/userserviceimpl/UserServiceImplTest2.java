package com.qianfeng.userserviceimpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qianfeng.iuserservice.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-test2.xml")
public class UserServiceImplTest2 {
	@Autowired
	private UserService uService;
	@Test
	public void TestSave(){
		uService.save();
	}
}
