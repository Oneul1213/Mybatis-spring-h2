package com.example.mybatisspringh2.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.mybatisspringh2.model.Product;

@Mapper
public interface ProductMapper {
    Product selectProductById(Long id);
    List<Product> selectAllProducts();
    void insertProduct(Product product);
}
