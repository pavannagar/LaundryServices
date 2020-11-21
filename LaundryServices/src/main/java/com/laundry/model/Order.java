package com.laundry.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "Order_Details")
public class Order {

	@Id
	private String orderId;
	private String dateOfOrder;
	private String deliveryDate;
	private String orderStatus;
	private int orderAmount;
	private int deliveryCharge;
	private int totalAmount;
	private String paymentType;
	@ManyToOne
	private Customer customer;
	@ManyToOne
	private Washerman washerman;
	@OneToMany(mappedBy = "order")
	private List<OrderItems> orderItems;
	
	
	public Order() {
		super();
	}


	public Order(String orderId) {
		super();
		this.orderId = orderId;
	}


	public Order(String orderId, String dateOfOrder, String deliveryDate, String orderStatus, int orderAmount,
			int deliveryCharge, int totalAmount, String paymentType, Customer customer, Washerman washerman) {
		super();
		this.orderId = orderId;
		this.dateOfOrder = dateOfOrder;
		this.deliveryDate = deliveryDate;
		this.orderStatus = orderStatus;
		this.orderAmount = orderAmount;
		this.deliveryCharge = deliveryCharge;
		this.totalAmount = totalAmount;
		this.paymentType = paymentType;
		this.customer = customer;
		this.washerman = washerman;
	}
	
	
	
}
