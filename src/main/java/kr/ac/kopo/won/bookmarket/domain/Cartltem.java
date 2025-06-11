package kr.ac.kopo.won.bookmarket.domain;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class Cartltem {
    private  Book book;
    private  int quantity;
    private BigDecimal totalPrice;

    public Cartltem(Book book){
        this.book = book;
        quantity = 1;
        totalPrice = book.getUnitPrice();
    }

    public void setBook(Book book){
        this.book = book;
        updateTotalPrice();
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
        updateTotalPrice();
    }

    public  void updateTotalPrice(){
        this.totalPrice = book.getUnitPrice().multiply(new BigDecimal(quantity));
    }
}
