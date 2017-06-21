package com.muthu.bookapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muthu.bookapplication.model.Book;
import com.muthu.bookapplication.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepo;
	public void save(Book book) {
		bookRepo.save(book);
	}

}
