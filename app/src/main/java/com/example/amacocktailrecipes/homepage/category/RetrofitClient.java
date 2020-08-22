package com.example.amacocktailrecipes.homepage.category;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static String Base_Url = "https://www.thecocktaildb.com/";
    private static Retrofit retrofit;

    public static Retrofit getClient() {

        retrofit = new Retrofit
                .Builder()
                .baseUrl(Base_Url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }
}
