package com.qianfeng.userserviceimpl;

import com.qianfeng.iuserservice.UserService;

public class UserServiceImpl implements UserService{

	@Override
	public void save() {
		
		System.out.println("保存用户");
		/*int i=10/0;*/
		
	}

	@Override
	public void delete() {
		System.out.println("删除用户");
		
	}

	@Override
	public void update() {
		System.out.println("更新用户");
		
	}

	@Override
	public void select() {
		System.out.println("查询用户");
		
	}

}
