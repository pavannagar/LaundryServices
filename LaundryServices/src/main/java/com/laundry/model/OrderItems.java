package com.laundry.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "Order_Items")
public class OrderItems {

	@Id
	private int serialNumber;
	private int quantity;
	private int charge;

	@ManyToOne
	private Order order;
	@ManyToOne
	private Category category;
	@ManyToOne
	private Clothes clothes;
	public OrderItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderItems(int serialNumber, int quantity, int charge, Order order, Category category, Clothes clothes) {
		super();
		this.serialNumber = serialNumber;
		this.quantity = quantity;
		this.charge = charge;
		this.order = order;
		this.category = category;
		this.clothes = clothes;
	}
	public OrderItems(int serialNumber) {
		super();
		this.serialNumber = serialNumber;
	}
	
	
	
}
