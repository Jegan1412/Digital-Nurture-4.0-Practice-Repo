package com.librarymanagement.LibraryManagement.Repository;


import com.librarymanagement.LibraryManagement.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
