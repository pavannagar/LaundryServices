package com.laundry.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table
public class Customer {

	@Id
	private String email;
	private String password;
	private String name;
	private String contact;
	private String address;
	private String hno;
	private String street;
	private String city;
	private String state;
	private String landmark;
	@OneToMany(mappedBy = "customer")
	private List<Order> order;
	
	public Customer() {
		super();
	
	}

	public Customer(String email, String password, String name, String contact, String address, String hno,
			String street, String city, String state, String landmark) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.contact = contact;
		this.address = address;
		this.hno = hno;
		this.street = street;
		this.city = city;
		this.state = state;
		this.landmark = landmark;
	}

	public Customer(String email) {
		super();
		this.email = email;
	}
	
	
	
	
	
	
}
