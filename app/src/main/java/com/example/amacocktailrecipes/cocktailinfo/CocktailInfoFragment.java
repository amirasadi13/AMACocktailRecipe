package com.example.amacocktailrecipes.cocktailinfo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.amacocktailrecipes.R;
import com.example.amacocktailrecipes.homepage.category.CategoryApiService;
import com.example.amacocktailrecipes.homepage.category.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class CocktailInfoFragment extends Fragment {
    String cocktailName;
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cocktail_info, container, false);
        cocktailName = getArguments().getString("cocktailName");
        recyclerView = view.findViewById(R.id.rv_cocktail_info);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);


        getData();
        return view;
    }

    private void getData() {
        CategoryApiService categoryApiService = RetrofitClient.getClient().create(CategoryApiService.class);
        Call<CocktailInfoDataClass> call = categoryApiService.getCocktailInfo(cocktailName);
        call.enqueue(new Callback<CocktailInfoDataClass>() {
            @Override
            public void onResponse(Call<CocktailInfoDataClass> call, Response<CocktailInfoDataClass> response) {
                initRecycle(response.body());
            }

            @Override
            public void onFailure(Call<CocktailInfoDataClass> call, Throwable t) {

            }
        });

    }

    private void initRecycle(CocktailInfoDataClass cocktailInfoDataClass) {
        CocktailInfoRecycleAdapter cocktailInfoRecycleAdapter = new CocktailInfoRecycleAdapter(cocktailInfoDataClass.getInfoList(),getContext());
        recyclerView.setAdapter(cocktailInfoRecycleAdapter);
    }
}