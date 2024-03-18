package com.nyx.nyxdata.controller;

import  com.nyx.nyxdata.entity.Product;
import com.nyx.nyxdata.service.ProductService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") Integer id) {
        return productService.getProduct(id);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Integer id, @RequestBody Product product) {

            return productService.updateProduct(product);

    }

    @PatchMapping("/{id}")
    public Product updatePatchProduct(@PathVariable("id") Integer id, @RequestBody Product product) {

            return productService.updatePatchProduct(id, product);

    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void deleteProduct(@PathVariable("id") Integer id) {
        productService.deleteProduct(id);
    }
}


