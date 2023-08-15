package com.prakash.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.prakash.BookService;
import com.prakash.entity.BookDetail;

@RestController
public class BooksController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/getBook/{bookId}")
	public ResponseEntity<Map<String, Object>> getBook(@PathVariable("bookId") Long bookId){
		Map<String, Object> res = new HashMap<>();
		Long pageId = 1L;
		BookDetail book = bookService.getBookByPageId(bookId, pageId);
		if(book != null){
			res.put(book.getBooks().getBookName(), book);
		} else {
			res.put("errorMessge", "Book or Page not found");
		}
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
	
	@GetMapping("/getBook/{bookId}/{pageId}")
	public ResponseEntity<Map<String, Object>> getBookWithPageId(@PathVariable("bookId") Long bookId, @PathVariable("pageId") Long pageId){
		Map<String, Object> res = new HashMap<>();
		BookDetail book = bookService.getBookByPageId(bookId, pageId);
		if(book != null){
			res.put(book.getBooks().getBookName(), book);
		} else {
			res.put("errorMessge", "Book or Page not found");
		}
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
	
	
	
}
