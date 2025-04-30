package kr.ac.kopo.won.bookmarket.repository;

import kr.ac.kopo.won.bookmarket.domain.Book;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface BookRepository {
    List<Book> getAllBookList();
    Book getBookbyId(String bookId);
    List<Book> getBookListByCategory(String category);
    Set<Book> getBookSetByFilter(Map<String, List<String>> filter);
}
