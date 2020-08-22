package com.example.amacocktailrecipes.cocktailslist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.amacocktailrecipes.R;
import com.example.amacocktailrecipes.homepage.category.CategoryApiService;
import com.example.amacocktailrecipes.homepage.category.CategoryDataClass;
import com.example.amacocktailrecipes.homepage.category.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class CocktailsListFragment extends Fragment {
    RecyclerView recyclerView;
    String categoryTitle;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cocktails_list, container, false);
        categoryTitle = getArguments().getString("title");
        recyclerView = view.findViewById(R.id.rv_cocktails_list);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager);

        getData();
        return view;
    }

    private void getData() {

        CategoryApiService categoryApiService = RetrofitClient.getClient().create(CategoryApiService.class);
        Call<CocktailsDataClass> call = categoryApiService.getCocktailsList(categoryTitle);
        call.enqueue(new Callback<CocktailsDataClass>() {
            @Override
            public void onResponse(Call<CocktailsDataClass> call, Response<CocktailsDataClass> response) {
                initRecycle(response.body());
            }

            @Override
            public void onFailure(Call<CocktailsDataClass> call, Throwable t) {

            }
        });

    }
    private void initRecycle(CocktailsDataClass cocktailsDataClass){
        CocktailsListRecycleAdapter cocktailsListRecycleAdapter = new CocktailsListRecycleAdapter(cocktailsDataClass.getCocktailsList(),getContext());
        recyclerView.setAdapter(cocktailsListRecycleAdapter);
    }
}