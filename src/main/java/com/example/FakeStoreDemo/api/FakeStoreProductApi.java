package com.example.FakeStoreDemo.api;

import com.example.FakeStoreDemo.dto.FakeStoreCategoryResponseDTO;
import com.example.FakeStoreDemo.dto.FakeStoreProductResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.io.IOException;

public interface FakeStoreProductApi {
    @GET("products/{id}")
    Call<FakeStoreProductResponseDTO> getProduct(@Path("id") Long id) throws IOException;

}
