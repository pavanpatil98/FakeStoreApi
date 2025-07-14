package com.example.FakeStoreDemo.services;

import com.example.FakeStoreDemo.dto.ProductResponseDTO;
import com.example.FakeStoreDemo.entity.Product;

import java.io.IOException;

public interface IProductService {
    public ProductResponseDTO getProduct(Long id) throws Exception;
    public ProductResponseDTO createProduct(ProductResponseDTO productDto)throws IOException;
}
