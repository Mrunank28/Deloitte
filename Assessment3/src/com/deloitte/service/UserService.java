package com.deloitte.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.deloitte.bean.User;
import com.deloitte.dao.IUserDao;

@Transactional
@Service
public class UserService implements IUserService {

	IUserDao dao;

	@Override
	public List<User> getUserList() {
		return dao.getUserList();
	}

}
