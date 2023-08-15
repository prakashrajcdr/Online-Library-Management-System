package com.prakash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.prakash.entity.BookDetail;

public interface BookDetailRepository extends JpaRepository<BookDetail, Long> {

	@Query(value = "SELECT * FROM book_detail as bd WHERE bd.book_id = :bookId and bd.page_no = :pageId", nativeQuery = true)
	BookDetail findByBooksAndPageNo(@Param("bookId") Long bookId, @Param("pageId") Long pageId);
}
