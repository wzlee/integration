package com.wzlee.template.dao.impl;


import org.springframework.stereotype.Repository;

import com.wzlee.template.dao.IUserDao;
import com.wzlee.template.dao.common.AbstractHibernateDao;
import com.wzlee.template.model.User;

@Repository("usersDao")
public class UserDao extends AbstractHibernateDao<User> implements IUserDao {

	public UserDao() {
		super();
		
		setClazz(User.class);
	}


}
