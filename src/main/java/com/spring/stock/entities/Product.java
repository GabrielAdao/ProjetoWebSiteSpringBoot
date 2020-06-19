package com.spring.stock.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spring.stock.entities.enums.Measure;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private float quantity;
    private Integer measure;
    private String description;

    //@JsonIgnore
    //@ManyToMany
    //@JoinTable(name = "tb_product_category", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
    //private Set<Category> categories = new HashSet<>();

    public Product(){
    }

    public Product(Long id, String name, float quantity, Measure measure, String description) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        setMeasure(measure);
        this.description = description;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public Measure getMeasure() {
        return Measure.valueOf(measure);
    }

    public void setMeasure(Measure measure) {
        if (measure != null){
            this.measure = measure.getCode();
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //public Set<Category> getCategories() {
    //    return categories;
    //}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
