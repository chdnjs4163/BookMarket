package kr.ac.kopo.won.bookmarket.controller;

import kr.ac.kopo.won.bookmarket.domain.Book;
import kr.ac.kopo.won.bookmarket.repository.BookRepository;
import kr.ac.kopo.won.bookmarket.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/books")
public class BookContrller {
    @Autowired
    private BookService bookService;

    @GetMapping
    public String requestBookList(Model model) {
        List<Book> bookList = bookService.getAllBooks();
        model.addAttribute("bookList", bookList);
        return "books";
    }


    @GetMapping(value = "/all")
    public ModelAndView requestAllBookList() {
        ModelAndView modelV = new ModelAndView();
        modelV.setViewName("books");
        List<Book> bookList = bookService.getAllBooks();
        modelV.addObject("bookList", bookList);
        return modelV;
    }
}
