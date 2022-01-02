package com.gourab.service;

import com.gourab.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();
    Product getProductById(Long productId);
    Product addProduct(Product product);
    List<Product> addProducts(List<Product> products);
    Product updateProduct(Product product);
    String deleteProductById(Long id);
}
