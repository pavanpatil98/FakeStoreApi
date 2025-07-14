package com.example.FakeStoreDemo.configuration;

import com.example.FakeStoreDemo.api.FakeStoreCategoryApi;
import com.example.FakeStoreDemo.api.FakeStoreProductApi;
import com.example.FakeStoreDemo.dto.FakeStoreCategoryResponseDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

@Configuration
public class GatewayConfig {

    @Bean
    public FakeStoreCategoryApi fakeStoreCategoryApi(Retrofit retrofit) throws IOException {
        return retrofit.create(FakeStoreCategoryApi.class);
    }

    @Bean
    public FakeStoreProductApi fakeStoreProductApi(Retrofit retrofit) throws IOException {
        return retrofit.create(FakeStoreProductApi.class);
    }

    @Bean
    public Retrofit getGateway(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://fakestoreapi.in/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }


}
