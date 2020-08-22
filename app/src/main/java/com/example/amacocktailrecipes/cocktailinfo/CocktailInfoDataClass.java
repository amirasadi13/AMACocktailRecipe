package com.example.amacocktailrecipes.cocktailinfo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CocktailInfoDataClass {

    @SerializedName("drinks")
    private List<CocktailInfoListDataClass> InfoList;

    public List<CocktailInfoListDataClass> getInfoList() {
        return InfoList;
    }
}
