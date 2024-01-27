package com.springtechie.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "address")
public class Address {
	
	@Id
	private int Id;
	private String city;
	private String pincode;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public Address(int id, String city, String pincode) {
		super();
		Id = id;
		this.city = city;
		this.pincode = pincode;
	}
	
	public Address() {
		
	}
	
	

}
