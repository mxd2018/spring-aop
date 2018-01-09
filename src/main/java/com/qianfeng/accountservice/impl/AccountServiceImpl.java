package com.qianfeng.accountservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qianfeng.accountdao.IAccountDao;
import com.qianfeng.accountservice.IAccountService;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {
	@Autowired
	private IAccountDao idao;
	@Override
	
	@Transactional
	public void transfer(Integer from, Integer to, Double money) {
		idao.increaseMoney(to, money);
		/*此处抛出异常，如果在transfer.xml中没有配置
		 * <tx:method name="transfer" propagation="REQUIRED"/>开启事务
		 * 那么在增加了某方的金额后，另一方金额不会减少 
		 *  */
		/*int i=10/0;*/
		idao.decreaseMoney(from, money);
	}

}
