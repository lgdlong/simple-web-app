package com.lgdlong.simplewebapp.repository;

import com.lgdlong.simplewebapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    // Spring auto-implements basic CRUD
}
