package com.shoplify.ecommerce_springboot.service;

import com.shoplify.ecommerce_springboot.model.Category;
import java.util.List;
import DTO.CategoryForm;

public interface CategoryService {
    public List<Category> findAllCategories ();
    public Category getCategory(long id);
    public Category addCategory(CategoryForm dto);
}
