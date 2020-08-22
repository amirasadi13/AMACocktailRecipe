package com.example.amacocktailrecipes.cocktailslist;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.amacocktailrecipes.R;

import java.util.List;

public class CocktailsListRecycleAdapter extends RecyclerView.Adapter<CocktailsListRecycleAdapter.MyViewHolder> {


    List<CocktailsListItemsDataClass> cocktailsList;
    Context context;

    public CocktailsListRecycleAdapter(List<CocktailsListItemsDataClass> cocktailsList, Context context) {
        this.cocktailsList = cocktailsList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cocktails_list_items,parent,false);
        MyViewHolder recycle = new MyViewHolder(view);
        return recycle;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.tvName.setText(cocktailsList.get(position).getDrinkName());
        Glide.with(context).load(cocktailsList.get(position).getDrinkImg()).into(holder.imgDrink);
        holder.btnGoToInfoPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cocktailName = cocktailsList.get(position).getDrinkName();
                Bundle bundle = new Bundle();
                bundle.putString("cocktailName",cocktailName);
                Navigation.findNavController(v).navigate(R.id.action_cocktailsListFragment_to_cocktailInfoFragment,bundle);
            }
        });
    }

    @Override
    public int getItemCount() {
        return cocktailsList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        ImageView imgDrink;
        LinearLayout btnGoToInfoPage;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            btnGoToInfoPage = itemView.findViewById(R.id.btn_go_to_cocktail_info);
            imgDrink = itemView.findViewById(R.id.img_cocktail);
            tvName = itemView.findViewById(R.id.tv_cocktail_name);
        }
    }
}
