package com.prakash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prakash.entity.BookDetail;

public interface BookDetailRepository extends JpaRepository<BookDetail, Long> {

}
