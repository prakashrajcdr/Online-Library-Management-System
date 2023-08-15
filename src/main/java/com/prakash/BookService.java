package com.prakash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prakash.entity.BookDetail;
import com.prakash.entity.Books;
import com.prakash.repository.BookDetailRepository;
import com.prakash.repository.BooksRepository;

@Service
public class BookService {

	@Autowired
	BooksRepository booksRepository;
	
	@Autowired
	BookDetailRepository bookDetailRepository;
	
	public Books getBookById(Long id) {
		return booksRepository.findById(id).orElse(null);
	}
	
	public BookDetail getBookByPageId(Long bookId, Long pageId) {
		return bookDetailRepository.findByBooksAndPageNo(bookId, pageId);
	}
}
