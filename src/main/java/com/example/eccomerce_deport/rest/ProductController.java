package com.example.eccomerce_deport.rest;

import com.example.eccomerce_deport.model.Product;
import com.example.eccomerce_deport.model.ProductList;
import com.example.eccomerce_deport.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/{id}")
    public Product findById(@PathVariable long id){
        return productService.findByID(id);
    }
    @GetMapping("/list")
    public List<Product> findAll(){return productService.findAll();}
    @PostMapping()
    public void saveProduct(@RequestBody Product p){ productService.saveProduct(p);}

    @PutMapping("/update/{id}")
    public void setProductService(@PathVariable Product p,@RequestBody long id){productService.setProduct(p,id);}
}
