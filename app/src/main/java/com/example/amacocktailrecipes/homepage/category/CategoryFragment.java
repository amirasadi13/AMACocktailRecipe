package com.example.amacocktailrecipes.homepage.category;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.amacocktailrecipes.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CategoryFragment extends Fragment {

    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_category, container, false);

        recyclerView = view.findViewById(R.id.rv_category);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        setHasOptionsMenu(true);
        getData();

        return view;
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.navigationdrawer_menu,menu);
    }

    private void getData() {

        CategoryApiService categoryApiService = RetrofitClient.getClient().create(CategoryApiService.class);
        Call<CategoryDataClass> call = categoryApiService.getCategory("list");
        call.enqueue(new Callback<CategoryDataClass>() {
            @Override
            public void onResponse(Call<CategoryDataClass> call, Response<CategoryDataClass> response) {
                initRecycle(response.body());
            }

            @Override
            public void onFailure(Call<CategoryDataClass> call, Throwable t) {

            }
        });
    }

    private void initRecycle(CategoryDataClass categoryDataClass) {
        CategoryRecycleAdapter categoryRecycleAdapter = new CategoryRecycleAdapter(categoryDataClass.getCategoryList(), getContext());
        recyclerView.setAdapter(categoryRecycleAdapter);
    }
}