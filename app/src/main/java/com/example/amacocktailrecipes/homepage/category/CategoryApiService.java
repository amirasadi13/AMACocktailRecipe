package com.example.amacocktailrecipes.homepage.category;

import com.example.amacocktailrecipes.cocktailinfo.CocktailInfoDataClass;
import com.example.amacocktailrecipes.cocktailslist.CocktailsDataClass;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CategoryApiService {

    @GET("api/json/v1/1/list.php")
    Call<CategoryDataClass> getCategory(@Query("c") String category);

    @GET("api/json/v1/1/filter.php")
    Call<CocktailsDataClass> getCocktailsList(@Query("c") String categoryTitle);

    @GET("api/json/v1/1/search.php")
    Call<CocktailInfoDataClass> getCocktailInfo(@Query("s") String cocktailTitle);
}
