package com.example.shoku.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shoku.Models.RestaurantMenuModel;
import com.example.shoku.R;
import com.example.shoku.databinding.RestaurantMenuRvBinding;

import java.util.ArrayList;

public class RestaurantMenuAdapter extends RecyclerView.Adapter<RestaurantMenuAdapter.viewHolder> {

    ArrayList<RestaurantMenuModel>  list;
    Context context;

    public RestaurantMenuAdapter(ArrayList<RestaurantMenuModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.restaurant_menu_rv, parent, false);
        return new viewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        RestaurantMenuModel model = list.get(position);

        holder.binding.foodName.setText(model.getFoodName());
        holder.binding.price.setText(model.getPrice());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  class viewHolder extends RecyclerView.ViewHolder {

        RestaurantMenuRvBinding binding;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            binding = RestaurantMenuRvBinding.bind(itemView);
        }
    }
}
