package com.muthu.bookapplication.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.muthu.bookapplication.model.Book;
import com.muthu.bookapplication.repository.BookRepository;

@Controller
@RequestMapping("/books")
public class BookController {
	@Autowired
	BookRepository bookRepo;
	Book book = new Book();
	
	@GetMapping("")
	public String book_list(ModelMap modelMap)
	{
		List<Book> book =  bookRepo.findAll();
		System.out.println(book);
		modelMap.addAttribute("books", book);
		return  "booklist";
	}
	@GetMapping("/addbook")
	public String addbook() {
		return "addbook";
	}
	@GetMapping("/view/{id}")
	public String show(@PathVariable("id") Integer id, ModelMap modelMap, HttpSession session) {
		System.out.println("ShowBook:" + id);
		Book book = bookRepo.findOne(id);
		modelMap.addAttribute("SELECTED_BOOK", book);
		return "view";
	}
}
