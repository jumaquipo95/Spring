package com.example.eccomerce_deport.repository;

import com.example.eccomerce_deport.model.Product;
import com.example.eccomerce_deport.model.ProductList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductListRepository extends JpaRepository<ProductList, Long> {
    List<ProductList> findAllProductByClientId(long clientId);

}
