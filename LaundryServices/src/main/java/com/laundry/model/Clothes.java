package com.laundry.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "clothes")
public class Clothes {

	@Id
	private int clothId;
	private String clothName;
	@OneToMany(mappedBy = "clothes")
	private List<OrderItems> orderItems;
	@OneToMany(mappedBy = "clothes")
	private List<RateList> rateList;
	public Clothes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Clothes(int clothId, String clothName) {
		super();
		this.clothId = clothId;
		this.clothName = clothName;
	}
	public Clothes(int clothId) {
		super();
		this.clothId = clothId;
	}
	
	
}
