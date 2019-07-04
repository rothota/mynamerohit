package com.cap.demo;

public class order {
 private int orderno;
 private String productname;
 private double price;
 private int quantity;
public int getOrderno() {
	return orderno;
}
public void setOrderno(int orderno) {
	this.orderno = orderno;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "order [orderno=" + orderno + ", productname=" + productname + ", price=" + price + ", quantity=" + quantity
			+ "]";
}
 
}
