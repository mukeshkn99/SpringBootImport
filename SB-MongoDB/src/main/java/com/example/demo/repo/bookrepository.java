package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.book;

@Repository
public interface bookrepository extends MongoRepository<book,String> {

	book findById(int bookid);


	book deleteById(int bookid);

}
