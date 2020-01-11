package com.deloitte.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.deloitte.bean.User;

@Transactional
@Repository
public class UserDao implements IUserDao {

	@PersistenceContext
	EntityManager entityManager;
	Logger logger = Logger.getLogger(UserDao.class);

	@Override
	public List<User> getUserList() {
		String sql = "SELECT list from User list";
		try {
			TypedQuery<User> query = entityManager.createQuery(sql, User.class);
			logger.info("Fetching Users  ");
			return query.getResultList();
		} catch (Exception e) {
			System.out.println("Catch block");
		}
		return null;
	}
}
