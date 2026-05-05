package com.shoplify.ecommerce_springboot.service.impl;

import DTO.ProductForm;
import com.shoplify.ecommerce_springboot.exception.ResourceNotFoundException;
import com.shoplify.ecommerce_springboot.model.Product;
import com.shoplify.ecommerce_springboot.repository.ProductRepository;
import com.shoplify.ecommerce_springboot.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ProductServiceImpl implements ProductService {

    ProductRepository db;

    public ProductServiceImpl(ProductRepository db) {
        this.db = db;
    }

    public List<Product> findAllProducts() {
        return db.findAll();
    }

    @Transactional
    public Product saveProduct(ProductForm dto) {
        Product createdProduct = new Product();

        createdProduct.setName(dto.name());
        createdProduct.setType(dto.type());
        createdProduct.setDescription(dto.description());
        createdProduct.setPrice(dto.price());
        createdProduct.setStock(dto.stock());

        return db.save(createdProduct);
    }

    public Product getProduct(long id) {
        return db.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product with ID "+ id + " not found"));
    }

    @Transactional
    public Product updateProduct(long id, ProductForm dto) {
        Product productToUpdate = this.getProduct(id);
        productToUpdate.setName(dto.name());
        productToUpdate.setType(dto.type());
        productToUpdate.setDescription(dto.description());
        productToUpdate.setPrice(dto.price());
        productToUpdate.setStock(dto.stock());

        return db.save(productToUpdate);
    }

    @Transactional
    public Product deleteProduct(long id) {
        Product productToUpdate = this.getProduct(id);

        db.delete(productToUpdate);

        return productToUpdate;
    }
}
