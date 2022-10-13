package com.example.shoku.Fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


import com.example.shoku.ProfileActivity;
import com.example.shoku.databinding.FragmentAccountBinding;


public class AccountFragment extends Fragment {

    FragmentAccountBinding binding;

    @Override
    public void onResume() {
        super.onResume();


    }



    public AccountFragment() {
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
        //View view =  inflater.inflate(R.layout.fragment_account, container, false);
        binding = FragmentAccountBinding.inflate(inflater,container, false);

        binding.cardViewProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ProfileActivity.class);
                startActivity(intent);
            }
        });


        return binding.getRoot();
    }


}