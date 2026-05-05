package com.shoplify.ecommerce_springboot.repository;

import com.shoplify.ecommerce_springboot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
