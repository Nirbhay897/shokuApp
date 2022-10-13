package com.example.shoku.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shoku.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class FoodBottomSheetFragment extends BottomSheetDialogFragment {



    public FoodBottomSheetFragment() {
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
        View view =  inflater.inflate(R.layout.fragment_food_bottom_sheet, container, false);

        return  view;
    }
}