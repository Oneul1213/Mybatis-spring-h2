package com.example.mybatisspringh2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.mybatisspringh2.model.Product;
import com.example.mybatisspringh2.service.ProductService;

@Controller
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product")
    @ResponseBody
    public Product getProductById(@RequestParam("id") Long id) {
        return productService.getProductById(id);
    }

    @GetMapping("/all-products")
    @ResponseBody
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
