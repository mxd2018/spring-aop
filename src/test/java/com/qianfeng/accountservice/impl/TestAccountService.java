package com.qianfeng.accountservice.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qianfeng.accountservice.IAccountService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:transfer-annotation.xml")
public class TestAccountService {
	@Autowired
	private IAccountService iaccountservice;
	
	@Test
	public void TestTransfer(){
		iaccountservice.transfer(1,2,500.00);
	}
}
