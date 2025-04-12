package com.lgdlong.simplewebapp.service;

import com.lgdlong.simplewebapp.dto.ProductDTO;
import com.lgdlong.simplewebapp.model.Product;
import com.lgdlong.simplewebapp.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(new Product());
    }

    public Product addProduct(ProductDTO dto) {
        Product product = new Product(dto.getName(), dto.getPrice());
        return productRepository.save(product);
    }

    public void updateProduct(Product product) {
        Product existingProduct = productRepository.findById(product.getId()).orElse(null);
        if (existingProduct != null) {
            existingProduct.setName(product.getName());
            existingProduct.setPrice(product.getPrice());
            productRepository.save(existingProduct);
        } else {
            System.err.println("Product with id = " + product.getId() + " not found");
        }
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
