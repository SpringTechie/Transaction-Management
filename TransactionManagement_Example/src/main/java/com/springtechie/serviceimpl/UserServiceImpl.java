package com.springtechie.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springtechie.model.Address;
import com.springtechie.model.User;
import com.springtechie.repository.UserRepository;
import com.springtechie.service.AddressService;
import com.springtechie.service.UserService;



@Service
public class UserServiceImpl  implements UserService
{
	
	@Autowired
	private UserRepository usrrepo;
	
	@Autowired
	private AddressService addressService;
	  
	@Transactional(noRollbackFor = InvalidPincodeException.class)
	public User saveUser(User user) throws Exception
	{
		
		Address add=new Address(1,"Hyd","509123");
		
		User u= usrrepo.save(user);
		addressService.saveAddress(add);
		return u;
	}
	
	
	 
	

}
