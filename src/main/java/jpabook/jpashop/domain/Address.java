package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    // 함부로 new로 생성하는 것을 방지하기 위함
    protected Address() {
    }

    // setter를 쓰지 않고 생성할 때만 값이 세팅되도록 생성자 추가
    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
