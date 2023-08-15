package com.prakash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prakash.entity.Books;

public interface BooksRepository extends JpaRepository<Books, Long> {

}
