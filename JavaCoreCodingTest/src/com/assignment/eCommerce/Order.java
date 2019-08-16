package com.assignment.eCommerce;

public class Order {
	private int orderId;
	private String productNameToBeOrdered;
	private String customerName;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String cutomerName) {
		this.customerName = cutomerName;
	}

	public String getProductNameToBeOrdered() {
		return productNameToBeOrdered;
	}

	public void setProductNameToBeOrdered(String productNameToBeOrdered) {
		this.productNameToBeOrdered = productNameToBeOrdered;
	}
	
	
	
}
