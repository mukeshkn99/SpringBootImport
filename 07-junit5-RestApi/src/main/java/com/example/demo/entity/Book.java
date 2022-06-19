package com.example.demo.entity;


public class Book {
	
public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public Book(String bookid, String bookname, Double bookprice) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookprice = bookprice;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public Double getBookprice() {
		return bookprice;
	}
	public void setBookprice(Double bookprice) {
		this.bookprice = bookprice;
	}
private String bookid;
private String bookname;
private Double bookprice;
}
