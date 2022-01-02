package com.gourab.controller;

import com.gourab.model.Product;
import com.gourab.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin("http://localhost:8080/")
@RestController
@RequestMapping(value = "api/v1/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService){
        super();
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return this.productService.getAllProducts();
    }

    @GetMapping("{id}")
    public Product getProductById(@PathVariable Long id){
        return this.productService.getProductById(id);
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return this.productService.addProduct(product);
    }

    @PostMapping
    public List<Product> addProducts(@RequestBody List<Product> products){
        return this.productService.addProducts(products);
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product){
        return this.productService.updateProduct(product);
    }

    @DeleteMapping("{id}")
    public String deleteProduct(@PathVariable Long id){
        return this.productService.deleteProductById(id);
    }
}
