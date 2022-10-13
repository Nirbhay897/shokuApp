package com.example.shoku.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shoku.Models.RestaurantFoodListModel;
import com.example.shoku.R;
import com.example.shoku.databinding.RestaurantFoodRvBinding;

import java.util.ArrayList;

public class RestaurantFoodListAdapter extends RecyclerView.Adapter<RestaurantFoodListAdapter.viewHolder>
    implements View.OnClickListener

{

    View.OnClickListener onClickListener;
    ArrayList<RestaurantFoodListModel> list;
    Context context;

    public RestaurantFoodListAdapter(ArrayList<RestaurantFoodListModel> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.restaurant_food_rv, parent, false);
        view.setOnClickListener(this);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        RestaurantFoodListModel model = list.get(position);

        holder.binding.foodItem.setImageResource(model.getFoodItem());
        holder.binding.foodNme.setText(model.getFoodName());
        holder.binding.reviewCount.setText(model.getReviewCount());
        holder.binding.description.setText(model.getFoodDescription());
        holder.binding.price.setText(model.getPrice());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  boolean onClickListener(View.OnClickListener onClickListener)
    {
        this.onClickListener = onClickListener;
        return  true;
    }

    @Override
    public void onClick(View view) {
        onClickListener.onClick(view);
        return;

    }

    public class viewHolder extends RecyclerView.ViewHolder {

        RestaurantFoodRvBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            binding = RestaurantFoodRvBinding.bind(itemView);
        }
    }
}
