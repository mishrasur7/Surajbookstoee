package com.example.Surajbookstore.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Surajbookstore.domain.Book;
import com.example.Surajbookstore.domain.BookRepository;
import com.example.Surajbookstore.domain.CategoryRepository;

@Controller
public class BookController {

	@Autowired
	private BookRepository repository;
	
	@Autowired
	private CategoryRepository cateRepository; 

	@RequestMapping(value = {"/", "/booklist"})
	public String bookList(Model model) {
		model.addAttribute("books", repository.findAll());
//		model.addAttribute("categories", cateRepository.findAll());
		return "booklist";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteBook(@PathVariable("id") Long bookId, Model model) {
		repository.deleteById(bookId);
		return "redirect:../booklist";
	}

	@RequestMapping(value = "/add")
	public String addBook(Model model) {
		model.addAttribute("book", new Book());
		model.addAttribute("categories", cateRepository.findAll());
		return "addbook";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(Book book) {
		repository.save(book);
		return "redirect:booklist";
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String bookLists(@PathVariable("id") Long bookId, Model model) {
		model.addAttribute("books", repository.findById(bookId));
		model.addAttribute("categories", cateRepository.findAll());
		return "editbook";
	}
	
	
	@RequestMapping(value = "edit/savebook", method = RequestMethod.POST)
	public String saveBook(Book book) {
		repository.save(book);
		return "redirect:../booklist";
	}
	
}