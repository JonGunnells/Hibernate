package com.theironyard;


import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
   @Id
   @GeneratedValue
    int id;

    @Column (nullable = false)
    String name;

    @Column(nullable = false)
    String email;

    public Customer() {
    }

    public Customer( String name, String email) {

        this.name = name;
        this.email = email;
    }
}
