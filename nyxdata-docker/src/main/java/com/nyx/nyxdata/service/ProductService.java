package com.nyx.nyxdata.service;

import com.nyx.nyxdata.entity.Product;
import com.nyx.nyxdata.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProduct(Integer id) {
        return productRepository.findById(id).get();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product) {
        Product existingProduct = productRepository.findById(product.getId()).get();
        if (existingProduct != null) {
            existingProduct.setName(product.getName());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setDescription(product.getDescription());
            existingProduct.setCategory(product.getCategory());

            return productRepository.save(existingProduct);
        }
        return null;
    }

    public Product updatePatchProduct(Integer id, Product product) {
        Product existingProduct = productRepository.findById(id).get();
        if (existingProduct != null) {
            if (product.getName() != null) {
                existingProduct.setName(product.getName());
            }
            if (product.getPrice() != null) {
                existingProduct.setPrice(product.getPrice());
            }
            if (product.getDescription() != null) {
                existingProduct.setDescription(product.getDescription());
            }
            if (product.getCategory() != null) {
                existingProduct.setCategory(product.getCategory());
            }

            return productRepository.save(existingProduct);
        }
        return null;
    }

    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }

}
