package kr.ac.kopo.won.bookmarket.service;

import kr.ac.kopo.won.bookmarket.domain.Order;

public interface OrderService {
    void confirmOrder(String bookId, long quantity); // 도서 재고 수량 확인
    long saveOrder(Order order); // 주문 목록 저장
}