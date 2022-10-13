package com.example.shoku.Fragments;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shoku.Adapter.FoodAdapter;
import com.example.shoku.Models.FoodModel;
import com.example.shoku.R;

import java.util.ArrayList;


public class DeliveryFragment extends Fragment {

    RecyclerView foodRv;
    ArrayList<FoodModel> list;




    public DeliveryFragment() {
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
        View view =  inflater.inflate(R.layout.fragment_delivery, container, false);

        foodRv = view.findViewById(R.id.foodRV);
        list = new ArrayList<>();

        list.add(new FoodModel(R.drawable.restorunt,"Maurya Dhaba", "Narela", "150","45", "min"
                   , "3.0","km", "5.0" ));

        list.add(new FoodModel(R.drawable.fast_food,"Akshat Dhaba", "SwatantraNagar", "200","35", "min"
                , "2.5","km", "4.5" ));

        list.add(new FoodModel(R.drawable.delicious,"Naveen Dhaba", "Bankner", "100","25", "min"
                , "1.5","km", "4.0" ));

        list.add(new FoodModel(R.drawable.restorunt,"Maurya Dhaba", "Narela", "150","45", "min"
                , "3.0","km", "5.0" ));

        list.add(new FoodModel(R.drawable.fast_food,"Akshat Dhaba", "SwatantraNagar", "200","35", "min"
                , "2.5","km", "4.5" ));

        list.add(new FoodModel(R.drawable.delicious,"Naveen Dhaba", "Bankner", "100","25", "min"
                , "1.5","km", "4.0" ));

        FoodAdapter adapter = new FoodAdapter(list, getContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        foodRv.setLayoutManager(layoutManager);
        foodRv.setAdapter(adapter);

        return view;
    }
}