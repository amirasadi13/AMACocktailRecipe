package com.example.amacocktailrecipes.cocktailinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.amacocktailrecipes.R;

import java.util.List;

public class CocktailInfoRecycleAdapter extends RecyclerView.Adapter<CocktailInfoRecycleAdapter.MyViewHolder> {

    List<CocktailInfoListDataClass> cocktailInfoList;
    Context context;

    public CocktailInfoRecycleAdapter(List<CocktailInfoListDataClass> cocktailInfoList, Context context) {
        this.cocktailInfoList = cocktailInfoList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cocktail_info_layout, parent, false);
        MyViewHolder recycle = new MyViewHolder(view);
        return recycle;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tvMealName.setText(cocktailInfoList.get(position).getDrinkName());
        holder.tvMealInstruction.setText(cocktailInfoList.get(position).getInstructions());
        holder.tvArea.setText(cocktailInfoList.get(position).getAlcoholic());
        holder.tvCategory.setText(cocktailInfoList.get(position).getCategory());
        Glide.with(context).load(cocktailInfoList.get(position).getDrinkImg()).into(holder.imgFood);
        holder.tvTags.setText(cocktailInfoList.get(position).getTags());
        setIngStatus(position, holder);
        setMeasStatus(position, holder);
    }

    @Override
    public int getItemCount() {
        return cocktailInfoList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvTags;
        TextView tvMealName;
        TextView tvMealInstruction;
        ImageView imgFood;
        TextView tvCategory;
        TextView tvArea;
        TextView tvIng1;
        TextView tvIng2;
        TextView tvIng3;
        TextView tvIng4;
        TextView tvIng5;
        TextView tvIng6;
        TextView tvIng7;
        TextView tvIng8;
        TextView tvIng9;
        TextView tvIng10;
        TextView tvIng11;
        TextView tvIng12;
        TextView tvIng13;
        TextView tvIng14;
        TextView tvIng15;
        TextView tvMeas1;
        TextView tvMeas2;
        TextView tvMeas3;
        TextView tvMeas4;
        TextView tvMeas5;
        TextView tvMeas6;
        TextView tvMeas7;
        TextView tvMeas8;
        TextView tvMeas9;
        TextView tvMeas10;
        TextView tvMeas11;
        TextView tvMeas12;
        TextView tvMeas13;
        TextView tvMeas14;
        TextView tvMeas15;
        LinearLayout l1;
        LinearLayout l2;
        LinearLayout l3;
        LinearLayout l4;
        LinearLayout l5;
        LinearLayout l6;
        LinearLayout l7;
        LinearLayout l8;
        LinearLayout l9;
        LinearLayout l10;
        LinearLayout l11;
        LinearLayout l12;
        LinearLayout l13;
        LinearLayout l14;
        LinearLayout l15;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTags = itemView.findViewById(R.id.tv_tags);
            tvMealInstruction = itemView.findViewById(R.id.food_instruction);
            imgFood = itemView.findViewById(R.id.img_food_material);
            tvMealName = itemView.findViewById(R.id.tv_meal_name);
            tvCategory = itemView.findViewById(R.id.tv_category);
            tvArea = itemView.findViewById(R.id.tv_area);
            tvIng1 = itemView.findViewById(R.id.ing1);
            tvIng2 = itemView.findViewById(R.id.ing2);
            tvIng3 = itemView.findViewById(R.id.ing3);
            tvIng4 = itemView.findViewById(R.id.ing4);
            tvIng5 = itemView.findViewById(R.id.ing5);
            tvIng6 = itemView.findViewById(R.id.ing6);
            tvIng7 = itemView.findViewById(R.id.ing7);
            tvIng8 = itemView.findViewById(R.id.ing8);
            tvIng9 = itemView.findViewById(R.id.ing9);
            tvIng10 = itemView.findViewById(R.id.ing10);
            tvIng11 = itemView.findViewById(R.id.ing11);
            tvIng12 = itemView.findViewById(R.id.ing12);
            tvIng13 = itemView.findViewById(R.id.ing13);
            tvIng14 = itemView.findViewById(R.id.ing14);
            tvIng15 = itemView.findViewById(R.id.ing15);
            tvMeas1 = itemView.findViewById(R.id.meas1);
            tvMeas2 = itemView.findViewById(R.id.meas2);
            tvMeas3 = itemView.findViewById(R.id.meas3);
            tvMeas4 = itemView.findViewById(R.id.meas4);
            tvMeas5 = itemView.findViewById(R.id.meas5);
            tvMeas6 = itemView.findViewById(R.id.meas6);
            tvMeas7 = itemView.findViewById(R.id.meas7);
            tvMeas8 = itemView.findViewById(R.id.meas8);
            tvMeas9 = itemView.findViewById(R.id.meas9);
            tvMeas10 = itemView.findViewById(R.id.meas10);
            tvMeas11 = itemView.findViewById(R.id.meas11);
            tvMeas12 = itemView.findViewById(R.id.meas12);
            tvMeas13 = itemView.findViewById(R.id.meas13);
            tvMeas14 = itemView.findViewById(R.id.meas14);
            tvMeas15 = itemView.findViewById(R.id.meas15);
            l1 = itemView.findViewById(R.id.l_1);
            l2 = itemView.findViewById(R.id.l_2);
            l3 = itemView.findViewById(R.id.l_3);
            l4 = itemView.findViewById(R.id.l_4);
            l5 = itemView.findViewById(R.id.l_5);
            l6 = itemView.findViewById(R.id.l_6);
            l7 = itemView.findViewById(R.id.l_7);
            l8 = itemView.findViewById(R.id.l_8);
            l9 = itemView.findViewById(R.id.l_9);
            l10 = itemView.findViewById(R.id.l_10);
            l11 = itemView.findViewById(R.id.l_11);
            l12 = itemView.findViewById(R.id.l_12);
            l13 = itemView.findViewById(R.id.l_13);
            l14 = itemView.findViewById(R.id.l_14);
            l15 = itemView.findViewById(R.id.l_15);
        }
    }

    private void setMeasStatus(int position, MyViewHolder holder) {

        if (cocktailInfoList.get(position).getMeas1() == null) {
            holder.tvMeas1.setVisibility(View.GONE);
        } else {
            holder.tvMeas1.setText(cocktailInfoList.get(position).getMeas1());
        }
        if (cocktailInfoList.get(position).getMeas2() == null) {
            holder.tvMeas2.setVisibility(View.GONE);
        } else {
            holder.tvMeas2.setText(cocktailInfoList.get(position).getMeas2());
        }
        if (cocktailInfoList.get(position).getMeas3() == null) {
            holder.tvMeas3.setVisibility(View.GONE);
        } else {
            holder.tvMeas3.setText(cocktailInfoList.get(position).getMeas3());
        }
        if (cocktailInfoList.get(position).getMeas4() == null) {
            holder.tvMeas4.setVisibility(View.GONE);
        } else {
            holder.tvMeas4.setText(cocktailInfoList.get(position).getMeas4());
        }
        if (cocktailInfoList.get(position).getMeas5() == null) {
            holder.tvMeas5.setVisibility(View.GONE);
        } else {
            holder.tvMeas5.setText(cocktailInfoList.get(position).getMeas5());
        }
        if (cocktailInfoList.get(position).getMeas6() == null) {
            holder.tvMeas6.setVisibility(View.GONE);
        } else {
            holder.tvMeas6.setText(cocktailInfoList.get(position).getMeas6());
        }
        if (cocktailInfoList.get(position).getMeas7() == null) {
            holder.tvMeas7.setVisibility(View.GONE);
        } else {
            holder.tvMeas7.setText(cocktailInfoList.get(position).getMeas7());
        }
        if (cocktailInfoList.get(position).getMeas8() == null) {
            holder.tvMeas8.setVisibility(View.GONE);
        } else {
            holder.tvMeas8.setText(cocktailInfoList.get(position).getMeas8());
        }
        if (cocktailInfoList.get(position).getMeas9() == null) {
            holder.tvMeas9.setVisibility(View.GONE);
        } else {
            holder.tvMeas9.setText(cocktailInfoList.get(position).getMeas9());
        }
        if (cocktailInfoList.get(position).getMeas10() == null) {
            holder.tvMeas10.setVisibility(View.GONE);
        } else {
            holder.tvMeas10.setText(cocktailInfoList.get(position).getMeas10());
        }
        if (cocktailInfoList.get(position).getMeas11() == null) {
            holder.tvMeas11.setVisibility(View.GONE);
        } else {
            holder.tvMeas11.setText(cocktailInfoList.get(position).getMeas11());
        }
        if (cocktailInfoList.get(position).getMeas12() == null) {
            holder.tvMeas12.setVisibility(View.GONE);
        } else {
            holder.tvMeas12.setText(cocktailInfoList.get(position).getMeas12());
        }
        if (cocktailInfoList.get(position).getMeas13() == null) {
            holder.tvMeas13.setVisibility(View.GONE);
        } else {
            holder.tvMeas13.setText(cocktailInfoList.get(position).getMeas13());
        }
        if (cocktailInfoList.get(position).getMeas14() == null) {
            holder.tvMeas14.setVisibility(View.GONE);
        } else {
            holder.tvMeas14.setText(cocktailInfoList.get(position).getMeas14());
        }
        if (cocktailInfoList.get(position).getMeas15() == null) {
            holder.tvMeas15.setVisibility(View.GONE);
        } else {
            holder.tvMeas15.setText(cocktailInfoList.get(position).getMeas15());
        }
    }

    private void setIngStatus(int position, MyViewHolder holder) {
        if (cocktailInfoList.get(position).getIng1() == null) {
            holder.tvIng1.setVisibility(View.GONE);
            holder.l1.setVisibility(View.GONE);
        } else {
            holder.tvIng1.setText(cocktailInfoList.get(position).getIng1());
        }
        if (cocktailInfoList.get(position).getIng2() == null) {
            holder.tvIng2.setVisibility(View.GONE);
            holder.l2.setVisibility(View.GONE);
        } else {
            holder.tvIng2.setText(cocktailInfoList.get(position).getIng2());
        }
        if (cocktailInfoList.get(position).getIng3() == null) {
            holder.tvIng3.setVisibility(View.GONE);
            holder.l3.setVisibility(View.GONE);
        } else {
            holder.tvIng3.setText(cocktailInfoList.get(position).getIng3());
        }
        if (cocktailInfoList.get(position).getIng4() == null) {
            holder.tvIng4.setVisibility(View.GONE);
            holder.l4.setVisibility(View.GONE);
        } else {
            holder.tvIng4.setText(cocktailInfoList.get(position).getIng4());
        }
        if (cocktailInfoList.get(position).getIng5() == null) {
            holder.tvIng5.setVisibility(View.GONE);
            holder.l5.setVisibility(View.GONE);
        } else {
            holder.tvIng5.setText(cocktailInfoList.get(position).getIng5());
        }
        if (cocktailInfoList.get(position).getIng6() == null) {
            holder.tvIng6.setVisibility(View.GONE);
            holder.l6.setVisibility(View.GONE);
        } else {
            holder.tvIng6.setText(cocktailInfoList.get(position).getIng6());
        }
        if (cocktailInfoList.get(position).getIng7() == null) {
            holder.tvIng7.setVisibility(View.GONE);
            holder.l7.setVisibility(View.GONE);
        } else {
            holder.tvIng7.setText(cocktailInfoList.get(position).getIng7());
        }
        if (cocktailInfoList.get(position).getIng8() == null) {
            holder.tvIng8.setVisibility(View.GONE);
            holder.l8.setVisibility(View.GONE);
        } else {
            holder.tvIng8.setText(cocktailInfoList.get(position).getIng8());
        }
        if (cocktailInfoList.get(position).getIng9() == null) {
            holder.tvIng9.setVisibility(View.GONE);
            holder.l9.setVisibility(View.GONE);
        } else {
            holder.tvIng9.setText(cocktailInfoList.get(position).getIng9());
        }
        if (cocktailInfoList.get(position).getIng10() == null) {
            holder.tvIng10.setVisibility(View.GONE);
            holder.l10.setVisibility(View.GONE);
        } else {
            holder.tvIng10.setText(cocktailInfoList.get(position).getIng10());
        }
        if (cocktailInfoList.get(position).getIng11() == null) {
            holder.tvIng11.setVisibility(View.GONE);
            holder.l11.setVisibility(View.GONE);
        } else {
            holder.tvIng11.setText(cocktailInfoList.get(position).getIng11());
        }
        if (cocktailInfoList.get(position).getIng12() == null) {
            holder.tvIng12.setVisibility(View.GONE);
            holder.l12.setVisibility(View.GONE);
        } else {
            holder.tvIng12.setText(cocktailInfoList.get(position).getIng12());
        }
        if (cocktailInfoList.get(position).getIng13() == null) {
            holder.tvIng13.setVisibility(View.GONE);
            holder.l13.setVisibility(View.GONE);
        } else {
            holder.tvIng13.setText(cocktailInfoList.get(position).getIng13());
        }
        if (cocktailInfoList.get(position).getIng14() == null) {
            holder.tvIng14.setVisibility(View.GONE);
            holder.l14.setVisibility(View.GONE);
        } else {
            holder.tvIng14.setText(cocktailInfoList.get(position).getIng14());
        }
        if (cocktailInfoList.get(position).getIng15() == null) {
            holder.tvIng15.setVisibility(View.GONE);
            holder.l15.setVisibility(View.GONE);
        } else {
            holder.tvIng15.setText(cocktailInfoList.get(position).getIng15());
        }
    }
}
