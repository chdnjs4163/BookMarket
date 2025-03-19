package kr.ac.kopo.won.bookmarket.controller;

import kr.ac.kopo.won.bookmarket.domain.Book;
import kr.ac.kopo.won.bookmarket.repository.BookRepository;
import kr.ac.kopo.won.bookmarket.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class BookContrller {
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String requestBookList(Model model) {
        List<Book> bookList = bookService.getAllBooks();
        model.addAttribute("bookList", bookList);
        return "books";
    }
}
