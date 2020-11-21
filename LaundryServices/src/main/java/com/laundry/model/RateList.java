package com.laundry.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "RateList")
public class RateList {

	@Id
	private int serialNumber;
	private int charge;
	@ManyToOne
	private Category category;
	@ManyToOne
	private Clothes clothes;
	public RateList() {
		super();
	}
	
	
}
