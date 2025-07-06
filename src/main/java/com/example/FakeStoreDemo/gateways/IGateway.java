package com.example.FakeStoreDemo.gateways;

import com.example.FakeStoreDemo.dto.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface IGateway {
    List<CategoryDTO> getAllCategories() throws IOException;
}
