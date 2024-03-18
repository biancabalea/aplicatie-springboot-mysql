package com.nyx.nyxdata.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.*;

@Entity
@Table(name = "products")
@SequenceGenerator(name = "products_seq", initialValue = 7)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "products_seq")
    @Column(name = "products_id")
    private Integer id;

    @Column(name = "products_name")
    private String name;

    @Column(name = "price")
    private Double price;

    @Column(name = "descriere")
    private String description;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "products_categories_id" , referencedColumnName = "categories_id")
    private Category category;

    // Constructors, getters, and setters

    public Product() {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}