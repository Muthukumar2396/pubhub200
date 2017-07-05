package com.muthu.bookapplication.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.muthu.bookapplication.model.Book;
import com.muthu.bookapplication.repository.BookRepository;
import com.muthu.bookapplication.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
	private static final Logger LOGGER = Logger.getLogger(BookController.class);

	@Autowired
	private BookService bookService;
	
	@Autowired
	private BookRepository bookRepo;
	private Book book = new Book();
	
	@GetMapping
	public String list(@RequestParam(value = "price",required=false) String priceFilter, @RequestParam(value = "released_date",required=false) String releasedDateFilter, HttpSession session) {
		LOGGER.info("Entering list");
		
		List<Book> books = null ; 

		if (priceFilter != null) {
			if (priceFilter.equals("desc")) {
				books = bookService.findByPriceDesc();
			} else if (priceFilter.equals("asc")) {
				books = bookService.findByPriceAsc();
			}
		}
		else if (releasedDateFilter != null ) {
			if ( releasedDateFilter.equals("desc")){
				books = bookService.findByReleasedDateDesc();
			}
		}
		else {
			books = bookService.findAll();
		}
		LOGGER.info(books);
		session.setAttribute("books", books);
		return "booklist";
	}

	@GetMapping("/addbook")
	public String addbook() {
		return "addbook";
	}
	@GetMapping("/{id}")
	public String show(@PathVariable("id") Long id, ModelMap modelMap, HttpSession session) {
		LOGGER.info("ShowBook:" + id);
		book = bookRepo.findOne(id);
		modelMap.addAttribute("SELECTED_BOOK", book);
		return "view";
	}
}
