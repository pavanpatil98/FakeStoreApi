package com.example.FakeStoreDemo.api;

import com.example.FakeStoreDemo.dto.FakeStoreCategoryResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;

public interface FakeStoreCategoryApi {
    @GET("products/category")
    Call<FakeStoreCategoryResponseDTO> listCategories() throws IOException;

}
