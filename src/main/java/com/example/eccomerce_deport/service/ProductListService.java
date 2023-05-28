package com.example.eccomerce_deport.service;

import com.example.eccomerce_deport.model.Product;
import com.example.eccomerce_deport.model.ProductList;
import com.example.eccomerce_deport.repository.ProductListRepository;
import com.example.eccomerce_deport.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductListService {
    private final ProductListRepository productListRepository;
    private final ProductRepository productRepository;

    public ProductListService(ProductListRepository productListRepository, ProductRepository productRepository) {
        this.productListRepository = productListRepository;
        this.productRepository = productRepository;
    }
    public List<ProductList> getProductsByClientId(long id){
        return productListRepository.findAllProductByClientId(id);
    }
    public ProductList buyProduct(long id, long product_id){
        Product product = productRepository.findById(product_id).orElseThrow(()->new RuntimeException("No existe el Producto seleccionado"));
        ProductList productList = new ProductList();
        productList.getProducts().add(product);
        productList.setClientId(id);
        return productListRepository.save(productList);

    }
}
