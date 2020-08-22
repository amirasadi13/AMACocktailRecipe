package com.example.amacocktailrecipes.homepage.category;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.amacocktailrecipes.R;

import java.util.List;

public class CategoryRecycleAdapter extends RecyclerView.Adapter<CategoryRecycleAdapter.MyViewHolder> {

    List<CategoryListDataClass> categoryList;
    Context context;

    public CategoryRecycleAdapter(List<CategoryListDataClass> categoryList, Context context) {
        this.categoryList = categoryList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.category_items, parent, false);
        MyViewHolder recycle = new MyViewHolder(view);
        return recycle;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {


        holder.tvTitle.setText(categoryList.get(position).getList());

        holder.btnGoToCocktailsList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = categoryList.get(position).getList();
                Bundle bundle = new Bundle();
                bundle.putString("title",title);
                Navigation.findNavController(v).navigate(R.id.action_categoryFragment_to_cocktailsListFragment,bundle);
            }
        });

    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvTitle;
        LinearLayout btnGoToCocktailsList;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_category_name);
            btnGoToCocktailsList = itemView.findViewById(R.id.btn_go_to_cocktails_list);
        }
    }
}
