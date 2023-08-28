package com.prakash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prakash.entity.BookDetail;
import com.prakash.repository.BookDetailRepository;
import com.prakash.repository.BooksRepository;

@Service
public class BookService {

	@Autowired
	BooksRepository booksRepository;
	
	@Autowired
	BookDetailRepository bookDetailRepository;
	
	public BookDetail getBookByPageId(Long bookId, Long pageId) {
		BookDetail bookDetail = null;
		try {
			bookDetail = bookDetailRepository.findByBooksAndPageNo(bookId, pageId);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return bookDetail;
	}
}
