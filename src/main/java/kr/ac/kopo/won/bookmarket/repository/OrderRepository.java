package kr.ac.kopo.won.bookmarket.repository;

import kr.ac.kopo.won.bookmarket.domain.Order;

public interface OrderRepository {
    // 주문목록 저장
    Long saveOrder(Order order);
}
