package com.example.amacocktailrecipes.homepage.category;

import com.example.amacocktailrecipes.cocktailslist.CocktailsListItemsDataClass;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategoryDataClass {

    @SerializedName("drinks")
    private List<CategoryListDataClass> categoryList;

    public List<CategoryListDataClass> getCategoryList() {
        return categoryList;
    }

}
