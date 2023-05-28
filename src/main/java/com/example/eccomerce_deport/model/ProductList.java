package com.example.eccomerce_deport.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "BUY")
public class ProductList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long clientId;
    @OneToMany
    public Collection<Product> products;

    public Collection<Product> getProducts(){
        if(products==null) products=new ArrayList<>();
        return products;
    }

}
