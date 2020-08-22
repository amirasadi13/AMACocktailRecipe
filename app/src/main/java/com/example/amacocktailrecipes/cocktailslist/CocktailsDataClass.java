package com.example.amacocktailrecipes.cocktailslist;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CocktailsDataClass {

    @SerializedName("drinks")
    private List<CocktailsListItemsDataClass> cocktailsList;

    public List<CocktailsListItemsDataClass> getCocktailsList() {
        return cocktailsList;
    }
}
