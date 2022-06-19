package com.example.demo.model;

public class Product {
private String productid;
private String productname;
private Double price;
public String getProductid() {
	return productid;
}
public void setProductid(String productid) {
	this.productid = productid;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [productid=" + productid + ", productname=" + productname + ", price=" + price + "]";
}
public Product() {
	
}
public Product(String i, String productname, Double price) {
	super();
	this.productid = i;
	this.productname = productname;
	this.price = price;
}

}
