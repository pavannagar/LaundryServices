package com.laundry.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "washerman_Payments")
public class TotalPayments {

	@Id
	private int serialNumber;
	private int totalEarning;
	private int payTotal;
	private int leftToPay;
	private int totalCommission;
	@OneToOne
	private Washerman washerman;
	public TotalPayments() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
