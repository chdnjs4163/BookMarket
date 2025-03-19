package kr.ac.kopo.won.bookmarket.repository;

import kr.ac.kopo.won.bookmarket.domain.Book;

import java.util.List;

public interface BookRepository {
    List<Book> getAllBookList();
}
