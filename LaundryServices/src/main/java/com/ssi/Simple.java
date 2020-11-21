package com.ssi;

import javax.persistence.Id;
import javax.persistence.Table;

@Table
public class Simple {

	@Id
	private int no;
	private String name;
	public Simple() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Simple(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	
	
	
	
}
