package com.example.FakeStoreDemo.gateways;

import com.example.FakeStoreDemo.api.FakeStoreCategoryApi;
import com.example.FakeStoreDemo.api.FakeStoreProductApi;
import com.example.FakeStoreDemo.dto.CategoryDTO;
import com.example.FakeStoreDemo.dto.FakeStoreCategoryResponseDTO;
import com.example.FakeStoreDemo.dto.FakeStoreProductResponseDTO;
import com.example.FakeStoreDemo.dto.ProductResponseDTO;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class FakeStoreApiGateway implements IGateway{
    public final FakeStoreCategoryApi fakeStoreCategoryApi;
    public final FakeStoreProductApi fakeStoreProductApi;
    public FakeStoreApiGateway(FakeStoreCategoryApi fakeStoreCategoryApi,FakeStoreProductApi fakeStoreProductApi){
        this.fakeStoreCategoryApi = fakeStoreCategoryApi;
        this.fakeStoreProductApi = fakeStoreProductApi;
    }
    @Override
    public List<CategoryDTO> getAllCategories() throws IOException{
        FakeStoreCategoryResponseDTO responseDTO = this.fakeStoreCategoryApi.listCategories().execute().body();
        List<CategoryDTO> categoryDTOS = responseDTO.getCategories().stream().map(category->CategoryDTO.builder().name(category).build()).toList();
        return categoryDTOS;
    }

    @Override
    public ProductResponseDTO getProduct(Long id)throws IOException {
        FakeStoreProductResponseDTO responseDTO = this.fakeStoreProductApi.getProduct(id).execute().body();
        System.out.println(responseDTO);
        return responseDTO.getData();
        //return productDTO;
    }
}
