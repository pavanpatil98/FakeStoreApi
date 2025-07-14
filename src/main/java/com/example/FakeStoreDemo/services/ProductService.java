package com.example.FakeStoreDemo.services;

import com.example.FakeStoreDemo.dto.ProductResponseDTO;
import com.example.FakeStoreDemo.entity.Product;
import com.example.FakeStoreDemo.mappers.ProductMapper;
import com.example.FakeStoreDemo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
@Service
public class ProductService implements IProductService{
    ProductRepository productRepository;
    public  ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public ProductResponseDTO getProduct(Long id) throws Exception {
       return productRepository.findById(id).map(ProductMapper::toDto).orElseThrow(()->new Exception("Product not found"));
        //return ProductMapper.toDto(product);
    }

    @Override
    public ProductResponseDTO createProduct(ProductResponseDTO productDTO) throws IOException {
        Product product = productRepository.save(ProductMapper.toEntity(productDTO));
        return ProductMapper.toDto(product);
    }
}
