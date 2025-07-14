package com.example.FakeStoreDemo.controllers;

import com.example.FakeStoreDemo.dto.ProductResponseDTO;
import com.example.FakeStoreDemo.services.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import retrofit2.http.GET;

import java.io.IOException;

@RestController
@RequestMapping("/api/products")
public class ProductController{
    private final IProductService productService;
    public ProductController(IProductService productService){
        this.productService = productService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductResponseDTO> getProductType(@PathVariable Long id) throws Exception {
        ProductResponseDTO responseDTO = productService.getProduct(id);
        return ResponseEntity.ok(responseDTO);
    }

    @PostMapping
    public ResponseEntity<ProductResponseDTO> createProduct(@RequestBody ProductResponseDTO productResponseDTO) throws IOException {
        return ResponseEntity.ok(productService.createProduct(productResponseDTO));
    }

}
