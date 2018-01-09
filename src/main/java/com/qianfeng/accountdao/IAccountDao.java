package com.qianfeng.accountdao;

public interface IAccountDao {
	void increaseMoney(Integer id,Double money);
	void decreaseMoney(Integer id,Double money);
}
