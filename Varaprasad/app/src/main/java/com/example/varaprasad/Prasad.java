package com.example.varaprasad;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Prasad {
    @GET("beers")
    Call<String> value();
}
