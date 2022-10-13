package com.example.shoku.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shoku.Adapter.RestaurantMenuAdapter;
import com.example.shoku.Models.FoodModel;
import com.example.shoku.Models.RestaurantMenuModel;
import com.example.shoku.R;

import java.util.ArrayList;


public class MenuFragment extends Fragment {

    RecyclerView restaurantMenuRV;
    ArrayList<RestaurantMenuModel> list;


    public MenuFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        restaurantMenuRV = view.findViewById(R.id.restaurantMenuRV);
        list = new ArrayList<>();

        list.add(new RestaurantMenuModel("Chole Bhathure", "50"));
        list.add(new RestaurantMenuModel("Classic Fries", "120"));
        list.add(new RestaurantMenuModel("Rabdi Rasmalai ", "90"));
        list.add(new RestaurantMenuModel("Vanilla Shake", "70"));
        list.add(new RestaurantMenuModel("Veggie Burger ", "80"));

        RestaurantMenuAdapter adapter = new RestaurantMenuAdapter(list, getContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        restaurantMenuRV.setLayoutManager(layoutManager);
        restaurantMenuRV.setAdapter(adapter);




        return view;
    }
}