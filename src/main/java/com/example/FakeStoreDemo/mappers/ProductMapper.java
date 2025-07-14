package com.example.FakeStoreDemo.mappers;

import com.example.FakeStoreDemo.dto.ProductResponseDTO;
import com.example.FakeStoreDemo.entity.Product;

public class ProductMapper {
    public static ProductResponseDTO toDto(Product product){
        return  ProductResponseDTO.builder()
                .id(product.getId())
                .brand(product.getBrand())
                .image(product.getImage())
                .model(product.getModel())
                .color(product.getColor())
                .price(product.getPrice())
                .title(product.getTitle())
                .description(product.getDescription())
                .popular(product.isPopular())
                .category(product.getCategory())
                .discount(product.getDiscount())
                .build();
    }

    public static Product toEntity(ProductResponseDTO productResponseDTO){
        return Product.builder()
                .brand(productResponseDTO.getBrand())
                .image(productResponseDTO.getImage())
                .model(productResponseDTO.getModel())
                .color(productResponseDTO.getColor())
                .price(productResponseDTO.getPrice())
                .title(productResponseDTO.getTitle())
                .description(productResponseDTO.getDescription())
                .popular(productResponseDTO.isPopular())
                .category(productResponseDTO.getCategory())
                .build();

    }
}
