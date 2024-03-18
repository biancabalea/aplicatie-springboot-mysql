package com.nyx.nyxdata.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categories")
@SequenceGenerator(name = "categories_seq", initialValue = 4)
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categories_seq")
    @Column(name = "categories_id")
    private Integer id;

    @Column(name = "categories_name")
    private String name;

    @JsonManagedReference
    @OneToMany(mappedBy = "category")
    private List<Product> productsList = new ArrayList<>();

    // Constructors, getters, and setters

    public Category() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
