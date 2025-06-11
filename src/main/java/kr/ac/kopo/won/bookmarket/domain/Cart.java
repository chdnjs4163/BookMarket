package kr.ac.kopo.won.bookmarket.domain;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Data
@ToString
public class Cart { // Cartltem 전체 관리하는 항목
    private String cartId;
    private Map<String,Cartltem> cartItems;
    private BigDecimal grandTotal;

    public Cart() {
        cartItems = new HashMap<String,Cartltem>();
        grandTotal = new BigDecimal(0);  //BigDecimal.ZERO;
    }

    public Cart(String cartId) {
        this();
        this.cartId = cartId;
    }
}
