package kr.ac.kopo.won.bookmarket.repository;

import kr.ac.kopo.won.bookmarket.domain.Book;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.*;

@Repository
public class BookRepositoryImpl implements BookRepository {
    private List<Book> listOfBooks = new ArrayList<Book>();

    public BookRepositoryImpl() {
        Book book1 = new Book();
        book1.setBookId("isbn0001");
        book1.setName("스프링부트완전정복");
        book1.setUnitPrice(BigDecimal.valueOf(35000));
        book1.setAuthor("송미영");
        book1.setDescription("스프링 부트는 스프링을 기반으로 쉽고 빠르게 웹 애플리케이션을 개발할 수 있는 도구이다. " +
                "이 책에서는 스프링 부트의 기본 개념을 쉽게 이해하고 다양한 실습 예제로 빠르게 익힐 수 있다. " +
                "그리고 단계별 실습을 따라 하다 보면 도서 쇼핑몰 구축 프로젝트를 완성할 수 있다. 개념-실습-프로젝트의 3단계 학습으로 스프링 부트를 제대로 익힌다면 개발 시간을 단축하고 생산성을 높일 수 있는 개발자로 성장할 수 있다.");
        book1.setPublisher("길벗캠퍼스");
        book1.setCategory("IT교재");
        book1.setUnitsInStock(10000);
        book1.setReleaseDate("2024/12/31");
        book1.setCondition("신규도서");

        Book book2 = new Book();
        book2.setBookId("isbn0002");
        book2.setName("클린 코드");
        book2.setUnitPrice(BigDecimal.valueOf(38000));
        book2.setAuthor("로버트 C. 마틴");
        book2.setDescription("클린 코드는 좋은 소프트웨어를 개발하기 위한 원칙과 방법을 설명하는 책이다. " +
                "소프트웨어 장인 정신을 강조하며 가독성 높은 코드 작성 방법, 리팩토링 기법 등을 다룬다. " +
                "이 책을 통해 유지보수성이 뛰어난 코드를 작성하는 방법을 배울 수 있다.");
        book2.setPublisher("인사이트");
        book2.setCategory("소프트웨어 공학");
        book2.setUnitsInStock(4000);
        book2.setReleaseDate("2022/09/10");
        book2.setCondition("중고도서");

        Book book3 = new Book();
        book3.setBookId("isbn0003");
        book3.setName("파이썬 데이터 분석");
        book3.setUnitPrice(BigDecimal.valueOf(45000));
        book3.setAuthor("웨슬리 추니");
        book3.setDescription("파이썬 데이터 분석은 데이터를 효율적으로 다루고 분석하는 방법을 설명하는 실용적인 가이드북이다. " +
                "판다스, 넘파이, 맷플롯립 등의 라이브러리를 활용하여 데이터 전처리, 시각화 및 머신러닝 기초까지 배울 수 있다. " +
                "이 책을 통해 실무에서 데이터를 다루는 능력을 향상시킬 수 있다.");
        book3.setPublisher("제이펍");
        book3.setCategory("IT교재");
        book3.setUnitsInStock(5000);
        book3.setReleaseDate("2023/11/05");
        book3.setCondition("신규도서");


        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
    }

    @Override
    public List<Book> getAllBookList() {
        return listOfBooks;
    }

    @Override
    public Book getBookbyId(String bookId) {
        Book bookInfo = null;
        for (Book book : listOfBooks) {
            if (book!=null && book.getBookId()!=null && book.getBookId().equals(bookId)) {
                bookInfo = book;
                break;
            }
        }
        if (bookInfo==null) {
            throw new IllegalArgumentException("도서번호가 " + bookId + "인 해당 도서를 찾을 수 없습니다.");
        }
        return bookInfo;
    }

    @Override
    public List<Book> getBookListByCategory(String category) {
        List<Book> booksByCategory = new ArrayList<>();
        for (Book book : listOfBooks) {
            if (book.getCategory()!=null && book.getCategory().equals(category)) {
                booksByCategory.add(book);
            }
        }

        return booksByCategory;
    }

    @Override
    public Set<Book> getBookSetByFilter(Map<String, List<String>> filter) {
        Set<Book> booksByPublisher = new HashSet<Book>();
        Set<Book> booksByCategory = new HashSet<Book>();
        Set<String> booksByFilter  = filter.keySet();

        if (booksByFilter.contains("publisher")) {
            for(int i =0; i<filter.get("publisher").size(); i++) {
                String publisherName = filter.get("publisher").get(i);
                for (Book book : listOfBooks) {
                    if (publisherName.equalsIgnoreCase(book.getPublisher())){ //IgnoreCase 영어로 쓸떄는 이걸 써야한다
                        booksByPublisher.add(book);
                    }
                }
            }
        }

        if (booksByFilter.contains("category")) {
            for (int i =0; i<filter.get("category").size(); i++) {
                String categoryName = filter.get("category").get(i);
                List<Book> list = getBookListByCategory(categoryName);
                booksByCategory.addAll(list);
            }
        }

//      저장된 요소 중에서 2 Set의 비교하여 같은 값만 남기고 나머지는 제거하는 역할(교집합만 남김)
        booksByCategory.retainAll(booksByPublisher);

        return booksByCategory;
    }

    @Override
    public void setNewBook(Book book) {
        listOfBooks.add(book);
    }
}


