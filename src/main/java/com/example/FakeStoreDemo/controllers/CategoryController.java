package com.example.FakeStoreDemo.controllers;

import com.example.FakeStoreDemo.dto.CategoryDTO;
import com.example.FakeStoreDemo.services.ICategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    public final ICategoryService categoryService;
    public CategoryController(ICategoryService categoryService){
        this.categoryService = categoryService;
    }
    @GetMapping
    public List<CategoryDTO> getCategories() throws IOException {
        return this.categoryService.getAllCategories();
    }
}
