package com.example.shoku.Adapter;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shoku.Models.FoodModel;
import com.example.shoku.R;
import com.example.shoku.ReastaurantsFoodListActivity;
import com.example.shoku.databinding.FoodItemRvBinding;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.viewHolder> {

    ArrayList<FoodModel> list;
    Context context;

    public FoodAdapter(ArrayList<FoodModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.food_item_rv, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        FoodModel model = list.get(position);

        holder.binding.foodItem.setImageResource(model.getFoodImage());

        holder.binding.restaurantsName.setText(model.getRestaurantName());
        holder.binding.restaurantsPlace.setText(model.getRestaurantPlace());
        holder.binding.price.setText(model.getPrice());
        holder.binding.time.setText(model.getTime());
        holder.binding.min.setText(model.getMinute());
        holder.binding.distance.setText(model.getDistance());
        holder.binding.km.setText(model.getKm());
        holder.binding.rating.setText(model.getRating());

        holder.binding.restaurantLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ReastaurantsFoodListActivity.class);
                context.startActivity(intent);

            }
        });



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        FoodItemRvBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            binding = FoodItemRvBinding.bind(itemView);
        }
    }
}
