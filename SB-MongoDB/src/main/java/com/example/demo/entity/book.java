package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class book {
	@Id
private String id;
private int bookid;
private String bookname;
private String author;
private Double price;
}
