package com.wzlee.template.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wzlee.template.dao.IUserDao;
import com.wzlee.template.dao.common.IOperations;
import com.wzlee.template.model.User;
import com.wzlee.template.service.IUserService;
import com.wzlee.template.service.common.AbstractService;

@Service("userService")
public class UserService extends AbstractService<User> implements IUserService {

	@Resource(name="usersDao")
	private IUserDao dao;
	
	public UserService() {
		super();
	}


	@Override
	protected IOperations<User> getDao() {
		return this.dao;
	}

}
