package kr.ac.kopo.won.bookmarket.service;

import kr.ac.kopo.won.bookmarket.domain.Cart;
import org.springframework.stereotype.Service;

@Service
public interface CartService {

    Cart create(Cart cart);

    Cart read(String cartId);

    void update(String cartId, Cart cart);
    void delete(String cartId);
    Cart validateCart(String cartId);
}