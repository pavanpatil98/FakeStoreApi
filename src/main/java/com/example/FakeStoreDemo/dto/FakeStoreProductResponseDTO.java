package com.example.FakeStoreDemo.dto;

import lombok.*;
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FakeStoreProductResponseDTO {
    private String status;
    private String message;
    private ProductResponseDTO data;
}
