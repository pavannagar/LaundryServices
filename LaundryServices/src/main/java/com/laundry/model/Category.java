package com.laundry.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "Category")
public class Category {

	@Id
	private int categoryId;
	private String categoryName;
	@OneToMany(mappedBy = "category")
	private List<OrderItems> orderItems;
	@OneToMany(mappedBy = "category")
	private List<RateList> rateList;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}
	public Category(int categoryId) {
		super();
		this.categoryId = categoryId;
	}

	

 
}
