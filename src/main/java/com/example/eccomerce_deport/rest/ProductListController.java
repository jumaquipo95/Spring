package com.example.eccomerce_deport.rest;

import com.example.eccomerce_deport.model.Product;
import com.example.eccomerce_deport.model.ProductList;
import com.example.eccomerce_deport.service.ProductListService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product/list")
public class ProductListController {
    private final ProductListService productListService;

    public ProductListController(ProductListService productListService) {
        this.productListService = productListService;
    }
    @GetMapping("/client/{id}")
    public List<ProductList> getProductsByClientId(@PathVariable long id){
        return productListService.getProductsByClientId(id);
    }
    @PostMapping("/buy/{id}/{product_id}")
    public ProductList buyProduct(@PathVariable long id,@PathVariable long product_id){
        return productListService.buyProduct(id,product_id);
    }
}
