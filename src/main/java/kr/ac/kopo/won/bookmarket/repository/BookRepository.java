package kr.ac.kopo.won.bookmarket.repository;

import kr.ac.kopo.won.bookmarket.domain.Book;

import java.util.List;

public interface BookRepository {
    List<Book> getAllBookList();
    Book getBookbyId(String bookId);
    List<Book> getBookListByCategory(String category);
}
