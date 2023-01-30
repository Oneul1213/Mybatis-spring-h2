package com.example.mybatisspringh2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.mybatisspringh2.model.Product;
import com.example.mybatisspringh2.repository.ProductMapper;

@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;

    public Product getProductById(Long id) {
        return productMapper.selectProductById(id);
    }

    public List<Product> getAllProducts() {
        return productMapper.selectAllProducts();
    }

    @Transactional
    public void addProduct(Product product) {
        productMapper.insertProduct(product);
    }
}
