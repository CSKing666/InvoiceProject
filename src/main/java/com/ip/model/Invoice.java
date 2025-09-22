package com.ip.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String customerName;
	private String itemName;
	private double price;
	
	public Invoice() {
		// TODO Auto-generated constructor stub
	}

	public Invoice(int id, String customerName, String itemName, double price) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.itemName = itemName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", customerName=" + customerName + ", itemName=" + itemName + ", price=" + price
				+ "]";
	}
	
	
}
