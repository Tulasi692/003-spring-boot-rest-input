package com.example.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Book;
@RestController
@RequestMapping("/book")
public class BookRestController {
	
	@PostMapping("/save")
	public String createBook(@RequestBody Book book) {
		return book.toString();
	}

}
