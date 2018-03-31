package com.api.searchinventory.dto;

import javax.persistence.*;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="price_id")
    Price price;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="inv_id")
    Inventory inventory;

    String name;
    String venue;
    String date;

    public Event(){}

    public Event(String name, String venue, String date, Price price, Inventory inventory) {
        this.name = name;
        this.venue = venue;
        this.date = date;
        this.price = price;
        this.inventory = inventory;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}
