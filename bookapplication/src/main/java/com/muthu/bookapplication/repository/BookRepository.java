package com.muthu.bookapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muthu.bookapplication.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
