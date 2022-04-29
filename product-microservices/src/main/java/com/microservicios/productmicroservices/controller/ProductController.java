package com.microservicios.productmicroservices.controller;

import com.microservicios.productmicroservices.entity.ProductEntity;
import com.microservicios.productmicroservices.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts(){
        return productRepository.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    private void createProduct(@RequestBody ProductEntity productEntity){
    productRepository.save(productEntity);
    }
}
