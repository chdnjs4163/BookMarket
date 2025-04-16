package kr.ac.kopo.won.bookmarket.service;

import kr.ac.kopo.won.bookmarket.domain.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book getBookById(String bookid);
    List<Book> getBooksByCategory(String category);

}
