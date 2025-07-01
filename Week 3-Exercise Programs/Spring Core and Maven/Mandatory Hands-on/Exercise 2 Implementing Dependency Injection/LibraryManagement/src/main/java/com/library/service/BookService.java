package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
	public BookService() {

		System.out.println("Book Service is Enabled");
	}

	private BookRepository bookrepository;

	public void setBookrepository(BookRepository bookrepository) {
		this.bookrepository = bookrepository;
		System.out.println("BookRepository is injected using Setter Injection in BookService");
	}
}
