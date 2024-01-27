package com.springtechie.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springtechie.model.Address;
import com.springtechie.repository.AddressRepository;
import com.springtechie.service.AddressService;

@Service
public class AddressServoiceImpl  implements AddressService{
	
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public void saveAddress(Address address) {
		
		if(address.getPincode().length()!=6) {
			throw  new InvalidPincodeException("Invalid pincode length");
		}
		else {
			 addressRepository.save(address);
		}
		
	}

}
