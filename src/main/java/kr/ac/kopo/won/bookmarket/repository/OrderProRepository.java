package kr.ac.kopo.won.bookmarket.repository;

import kr.ac.kopo.won.bookmarket.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProRepository  extends JpaRepository<Order, Long> {
}
