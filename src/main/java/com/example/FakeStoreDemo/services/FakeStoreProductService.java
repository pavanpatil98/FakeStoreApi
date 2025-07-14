package com.example.FakeStoreDemo.services;

import com.example.FakeStoreDemo.dto.ProductResponseDTO;
import com.example.FakeStoreDemo.gateways.FakeStoreApiGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
@Service
public class FakeStoreProductService implements IProductService{
    public final ProductService productService;
    public FakeStoreProductService(ProductService productService){
        this.productService = productService;
    }
    @Override
    public ProductResponseDTO getProduct(Long id) throws Exception {
        return productService.getProduct(id);
    }

    @Override
    public ProductResponseDTO createProduct(ProductResponseDTO productDto) throws IOException {
        return productService.createProduct(productDto);
    }
}
