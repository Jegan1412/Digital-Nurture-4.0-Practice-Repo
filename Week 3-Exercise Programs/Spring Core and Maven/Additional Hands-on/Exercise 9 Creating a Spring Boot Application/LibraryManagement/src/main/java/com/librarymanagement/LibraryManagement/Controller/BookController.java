package com.librarymanagement.LibraryManagement.Controller;

import com.librarymanagement.LibraryManagement.Model.Book;
import com.librarymanagement.LibraryManagement.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class BookController {

    @Autowired
    BookRepository bookrepository;

    @GetMapping
    public List<Book> getBooks() {
        return bookrepository.findAll();
    }

    @GetMapping("/book/{bookid}")
    public Book getBookById(@PathVariable int bookid) {
        return bookrepository.findById(bookid).orElse(new Book());
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookrepository.save(book);
    }

    @PutMapping("/book/{id}")
    public Book updateBook(@RequestBody Book book) {
        return bookrepository.save(book);
    }

    @DeleteMapping("/book/{bookid}")
    public void deleteBook(@PathVariable int bookid) {
        bookrepository.deleteById(bookid);
    }
}
