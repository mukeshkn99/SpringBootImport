package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.book;
import com.example.demo.repo.bookrepository;

@RestController
public class bookcontroller {

	@Autowired
	private bookrepository repo;
	
	@PostMapping("/addbook")
	public ResponseEntity<String> addbook(@RequestBody book book){
		repo.save(book);
	return new ResponseEntity<>("book saved",HttpStatus.OK);	
	}
	
	@GetMapping("/getbook")
	public List<book> getall(){
		return repo.findAll();
	}

	@GetMapping("/getbook/{bookid}")
	public book getid(@PathVariable("bookid") int bookid) {
		return repo.findById(bookid);
		
	}
	
	@DeleteMapping("deletebook/{bookid}")
	public book delete(@PathVariable("bookid")int bookid) {
		return repo.deleteById(bookid);
	}

}
