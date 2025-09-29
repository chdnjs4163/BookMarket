package kr.ac.kopo.won.bookmarket.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Address {
    @Id
    @GeneratedValue
    private int id;
    private String country; // 국가명
    private String zipcode; // 우편 번호
    private String addressName; // 기본 주소
    private String detailName; // 상제 주소
}
