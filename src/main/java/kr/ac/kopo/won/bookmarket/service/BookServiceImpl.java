package kr.ac.kopo.won.bookmarket.service;

import kr.ac.kopo.won.bookmarket.domain.Book;
import kr.ac.kopo.won.bookmarket.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.getAllBookList() ;
    }

    @Override
    public Book getBookById(String bookid) {
        Book book = bookRepository.getBookbyId(bookid);
        return book;
    }

    @Override
    public List<Book> getBooksByCategory(String category) {
        List<Book> booksByCategory = bookRepository.getBookListByCategory(category);
        return booksByCategory;
    }

    @Override
    public Set<Book> getBookSetByFilter(Map<String, List<String>> filter) {
        Set<Book> booksByFilter = bookRepository.getBookSetByFilter(filter);
        return booksByFilter;
    }

    @Override
    public void setNewBook(Book book) {
        bookRepository.setNewBook(book);
    }

}
