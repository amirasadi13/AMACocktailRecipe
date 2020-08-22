package com.example.amacocktailrecipes.homepage.category;

import com.google.gson.annotations.SerializedName;

public class CategoryListDataClass {

    @SerializedName("strCategory")
    private String categoryList;

    public String getList() {
        return categoryList;
    }
}
