package com.example.shoku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.shoku.Adapter.RestaurantFoodListAdapter;
import com.example.shoku.Fragments.FoodBottomSheetFragment;
import com.example.shoku.Models.RestaurantFoodListModel;
import com.example.shoku.databinding.ActivityReastaurantsFoodListBinding;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;

public class ReastaurantsFoodListActivity extends AppCompatActivity {

    private  int position;
    private BottomSheetDialog bottomSheetDialog;
    ArrayList<RestaurantFoodListModel> list;
    ActivityReastaurantsFoodListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityReastaurantsFoodListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());





        list = new ArrayList<>();

        list.add(new RestaurantFoodListModel(R.drawable.restorunt, "Rabdi Rasmalai" , "34"
                , "A delicious dessert made..." , "120"));

        list.add(new RestaurantFoodListModel(R.drawable.delicious, "Classic Fries" , "24"
                , "A delicious dessert made..." , "90"));

        list.add(new RestaurantFoodListModel(R.drawable.fast_food, "Aloo Tikki Rasmalai" , "14"
                , "A delicious dessert made..." , "150"));

        list.add(new RestaurantFoodListModel(R.drawable.restorunt, "Veggie Burger" , "12"
                , "A delicious dessert made..." , "80"));

        list.add(new RestaurantFoodListModel(R.drawable.fast_food, "Vanilla Shake" , "32"
                , "A delicious dessert made..." , "70"));

        list.add(new RestaurantFoodListModel(R.drawable.delicious, "Tandoori Pasta" , "18"
                , "A delicious dessert made from..." , "140"));




        RestaurantFoodListAdapter adapter = new RestaurantFoodListAdapter(list, this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.restaurantFoodRV.setLayoutManager(layoutManager);


        adapter.onClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FoodBottomSheetFragment foodBottomSheetFragment = new FoodBottomSheetFragment();
                foodBottomSheetFragment.show(getSupportFragmentManager(), foodBottomSheetFragment.getTag());

            }
        });

        binding.restaurantFoodRV.setAdapter(adapter);

    }

}