package com.example.demoretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface myapi {

    @GET("countries/")
    Call<List<model>> getModels();
}
