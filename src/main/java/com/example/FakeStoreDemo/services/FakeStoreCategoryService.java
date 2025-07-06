package com.example.FakeStoreDemo.services;

import com.example.FakeStoreDemo.dto.CategoryDTO;
import com.example.FakeStoreDemo.gateways.FakeStoreApiGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
@Service
public class FakeStoreCategoryService implements ICategoryService{
    public final FakeStoreApiGateway fakeStoreApiGateway;
    public FakeStoreCategoryService(FakeStoreApiGateway fakeStoreApiGateway){
        this.fakeStoreApiGateway = fakeStoreApiGateway;
    }
    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return this.fakeStoreApiGateway.getAllCategories();
    }
}
