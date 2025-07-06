package com.example.FakeStoreDemo.gateways;

import com.example.FakeStoreDemo.api.FakeStoreCategoryApi;
import com.example.FakeStoreDemo.dto.CategoryDTO;
import com.example.FakeStoreDemo.dto.FakeStoreCategoryResponseDTO;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class FakeStoreApiGateway implements IGateway{
    public final FakeStoreCategoryApi fakeStoreCategoryApi;
    public FakeStoreApiGateway(FakeStoreCategoryApi fakeStoreCategoryApi){
        this.fakeStoreCategoryApi = fakeStoreCategoryApi;
    }
    @Override
    public List<CategoryDTO> getAllCategories() throws IOException{
        FakeStoreCategoryResponseDTO responseDTO = this.fakeStoreCategoryApi.listCategories().execute().body();
        List<CategoryDTO> categoryDTOS = responseDTO.getCategories().stream().map(category->CategoryDTO.builder().name(category).build()).toList();
        return categoryDTOS;
    }
}
