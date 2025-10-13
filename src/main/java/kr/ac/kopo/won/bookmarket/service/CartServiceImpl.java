package kr.ac.kopo.won.bookmarket.service;

import kr.ac.kopo.won.bookmarket.domain.Cart;
import kr.ac.kopo.won.bookmarket.exception.CartException;
import kr.ac.kopo.won.bookmarket.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl  implements CartService{
    @Autowired
    private CartRepository cartRepository;

    @Override
    public Cart create(Cart cart) {
        return cartRepository.create(cart);
    }

    @Override
    public Cart read(String cartId) {
        return cartRepository.read(cartId);
    }

    @Override
    public void update(String cartId,Cart cart) {
        cartRepository.update(cartId,cart);
    }

    @Override
    public void delete(String cartId) {
        cartRepository.delete(cartId);
    }

    @Override
    public Cart validateCart(String cartId) {
        Cart cart = this.read(cartId);
        if (cart == null) {
            // 장바구니가 없으면 새로 생성
            cart = new Cart(cartId);
            this.create(cart);
            throw new CartException("장바구니가 비어있습니다: " + cartId);
        }
        if (cart.getCartItems() == null || cart.getCartItems().isEmpty()) {
            throw new CartException("장바구니에 상품이 없습니다: " + cartId);
        }
        return cart;
    }


}
