package com.example.demo.model;

public class pet {

private int petid;
private String type;
@Override
public String toString() {
	return "pet [petid=" + petid + ", type=" + type + ", price=" + price + "]";
}
private Double price;
public int getPetid() {
	return petid;
}
public void setPetid(int petid) {
	this.petid = petid;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
}
