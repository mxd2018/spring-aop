package com.qianfeng.accountdao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.qianfeng.accountdao.IAccountDao;

@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	@Override
	public void increaseMoney(Integer id, Double money) {
		String sql="update ar_account set money=money + ? where id=?";
		jdbcTemplate.update(sql,money,id);
		
	}

	@Override
	public void decreaseMoney(Integer id, Double money) {
		String sql="update ar_account set money=money - ? where id=?";
		jdbcTemplate.update(sql,money,id);

	}

}
