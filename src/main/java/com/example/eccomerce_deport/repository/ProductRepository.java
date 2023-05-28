package com.example.eccomerce_deport.repository;

import com.example.eccomerce_deport.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product , Long> {

    Optional<Product> findById(long id);


}
