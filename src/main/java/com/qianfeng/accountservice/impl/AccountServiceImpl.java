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
		/*�˴��׳��쳣�������transfer.xml��û������
		 * <tx:method name="transfer" propagation="REQUIRED"/>��������
		 * ��ô��������ĳ���Ľ�����һ��������� 
		 *  */
		/*int i=10/0;*/
		idao.decreaseMoney(from, money);
	}

}
