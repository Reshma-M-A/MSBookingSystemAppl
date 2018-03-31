package com.api.searchinventory.dto;

import javax.persistence.*;

@Entity
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "price_id")
    long id;

    double price;

    public Price(){}


    public Price(double price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

