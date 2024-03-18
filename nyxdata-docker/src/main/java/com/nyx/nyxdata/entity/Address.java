package com.nyx.nyxdata.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "address")
@SequenceGenerator(name = "address_seq", initialValue = 1)
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_seq")
    @Column(name = "address_id")
    private Integer id;

    @Column(name = "nume_complet")
    private String fullName;

    @Column(name = "adresa")
    private String address;

    @Column(name = "oras")
    private String city;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "user_id" , referencedColumnName = "user_id")
    private User user;

    // Constructors, getters, and setters

    public Address() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}