package kr.ac.kopo.won.bookmarket.service;

import kr.ac.kopo.won.bookmarket.domain.Cart;

public interface CartService {
    Cart create(Cart cart);
    Cart read(String cartId);
}
