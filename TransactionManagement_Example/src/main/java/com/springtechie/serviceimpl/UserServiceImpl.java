package com.springtechie.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.springtechie.model.User;
import com.springtechie.repository.UserRepository;


@Service
public class UserServiceImpl
{
	
	@Autowired
	private UserRepository userRepository;
//	@Transactional(transactionManager = "transactionManager")
//	@Transactional(propagation = Propagation.REQUIRED)
//  @Transactional(propagation = Propagation.REQUIRES_NEW)
//  @Transactional(propagation = Propagation.MANDATORY)
//	@Transactional(propagation = Propagation.SUPPORTS)
//	@Transactional(propagation = Propagation.NOT_SUPPORTED)
//	@Transactional(propagation = Propagation.NEVER)
	@Transactional(isolation = Isolation.DEFAULT)
	public User saveUser(User user)
	{
		return userRepository.save(user);
	}

}
