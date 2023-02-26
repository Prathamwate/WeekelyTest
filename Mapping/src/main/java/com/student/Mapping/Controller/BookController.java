package com.student.Mapping.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.student.Mapping.Model.Book;
import com.student.Mapping.Service.BookService;

import jakarta.annotation.Nullable;

@RestController
@RequestMapping("/book")
public class BookController {
		
	@Autowired
	private BookService bookService;
	
	@PostMapping("/book")
	public Book addBook(@RequestBody String book) {
		return bookService.addBook(book);
	}
	
	@GetMapping("/book")
	public List<Book> getBook(@Nullable @RequestParam String bookId) {
	      return  bookService.findByBook(bookId);
	 }
}
