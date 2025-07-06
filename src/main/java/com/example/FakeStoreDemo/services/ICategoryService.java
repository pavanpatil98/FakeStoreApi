package com.example.FakeStoreDemo.services;

import com.example.FakeStoreDemo.dto.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryService {
    public List<CategoryDTO> getAllCategories() throws IOException;
}
