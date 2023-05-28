package com.example.eccomerce_deport.service;

import com.example.eccomerce_deport.model.Product;
import com.example.eccomerce_deport.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product findByID(long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Producto no registrado"));

    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public void saveProduct(Product p) {
        productRepository.save(p);
    }

    public Product setProduct(Product p, long id) {
        Product o = productRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontro producto con ese id"));
        o.setName(p.getName());
        o.setPrice(p.getPrice());
        o.setCart(p.getCart());
        o.setDescription(p.getDescription());
        return productRepository.save(o);
    }
}


