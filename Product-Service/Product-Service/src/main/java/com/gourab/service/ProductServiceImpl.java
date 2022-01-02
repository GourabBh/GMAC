package com.gourab.service;

import com.gourab.exception.ProductException;
import com.gourab.model.Product;
import com.gourab.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return this.productRepository.findAll();
    }

    @Override
    public Product getProductById(Long productId) {
        return this.productRepository.findById(productId)
                .orElseThrow(()-> new ProductException("Product is not available with Product Id: " + productId));
    }

    @Override
    public Product addProduct(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public List<Product> addProducts(List<Product> products) {
        return this.productRepository.saveAll(products);
    }

    @Override
    public Product updateProduct(Product product) {
        Product existingProduct = this.productRepository.findById(product.getProductId())
                .orElseThrow(()-> new ProductException("Product is not available with Product id: " + product.getProductId()));
        existingProduct.setProductPrice(product.getProductPrice());
        existingProduct.setProductBatchNo(product.getProductBatchNo());
        existingProduct.setProductQuantity(product.getProductQuantity());
        existingProduct.setProductExpiryDate(product.getProductExpiryDate());
        existingProduct.setProductManufacturedDate(product.getProductManufacturedDate());

        Product updatedProductDetails = this.productRepository.save(existingProduct);
        return updatedProductDetails;
    }

    @Override
    public String deleteProductById(Long id) {
        Product existingProduct = this.productRepository.findById(id)
                .orElseThrow(()-> new ProductException("Product is not available with Product id: " + id));
        this.productRepository.delete(existingProduct);
        return "Product with Product Id " + id + " is deleted successfully!";
    }
}
