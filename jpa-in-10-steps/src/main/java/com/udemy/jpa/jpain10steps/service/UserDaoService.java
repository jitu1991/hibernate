package com.udemy.jpa.jpain10steps.service;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.udemy.jpa.jpain10steps.entity.User;

@Repository
@Transactional
public class UserDaoService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	public long insert(User user) {
		entityManager.persist(user);
		return user.getId();
	}
}
