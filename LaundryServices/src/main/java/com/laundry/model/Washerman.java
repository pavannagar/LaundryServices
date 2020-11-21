package com.laundry.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "washerman_registration")
public class Washerman {

	@Id
	private String email;
	private String password;
	private String name;
	private String contact;
	private String shopeName;
	private String shopeAddress;
	private String shopeno;
	private String street;
	private String city;
	private String state;
	private String landmark;
	
	@OneToMany(mappedBy = "washerman")
	private List<Order> order;
	
	@OneToMany(mappedBy = "washerman")
	private List<WeeklyPayments> weeklyPayments;
	
	@OneToOne(mappedBy = "washerman")
	private TotalPayments totalPayments;
	
	
	
	public Washerman() {
		super();
		
	}
	
	
	
	public Washerman(String email) {
		super();
		this.email = email;
	}



	public Washerman(String email, String password, String name, String contact, String shopeName, String shopeAddress,
			String shopeno, String street, String city, String state, String landmark) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.contact = contact;
		this.shopeName = shopeName;
		this.shopeAddress = shopeAddress;
		this.shopeno = shopeno;
		this.street = street;
		this.city = city;
		this.state = state;
		this.landmark = landmark;
	}
	
	
	
	
}
