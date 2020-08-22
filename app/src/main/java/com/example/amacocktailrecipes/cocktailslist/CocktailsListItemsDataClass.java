package com.example.amacocktailrecipes.cocktailslist;

import com.google.gson.annotations.SerializedName;

public class CocktailsListItemsDataClass {

    @SerializedName("strDrink")
    private String drinkName;

    public String getDrinkName() {
        return drinkName;
    }

    @SerializedName("strDrinkThumb")
    private String drinkImg;

    public String getDrinkImg() {
        return drinkImg;
    }
}
