package com.laundry.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "weekly_Payments")
public class WeeklyPayments {

	@Id
	private int id;
	private int payToWasherman;
	private String date;
	private int commission;
	
	@ManyToOne
	private Washerman washerman;
	
	public WeeklyPayments() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
