package com.theironyard;

import javax.persistence.*;

@Entity
@Table(name = "purchases")
public class Purchase {

    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String date;

    @Column(nullable = false)
    String creditCard;

    @Column(nullable = false)
    int cvv;

    @Column(nullable = false)
    String category;

    @ManyToOne
    Customer customer;

    public Purchase() {
    }

    public Purchase(int id, String date, String creditCard, int cvv, String category, Customer customer) {
        this.id = id;
        this.date = date;
        this.creditCard = creditCard;
        this.cvv = cvv;
        this.category = category;
        this.customer = customer;
    }
}
