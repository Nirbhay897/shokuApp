package com.example.shoku.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shoku.Adapter.FragmentAdapter;
import com.example.shoku.R;
import com.example.shoku.databinding.FragmentPayoutBinding;


public class PayoutFragment extends Fragment {

   FragmentPayoutBinding binding;

    public PayoutFragment() {
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
        //return inflater.inflate(R.layout.fragment_payout, container, false);
        binding = FragmentPayoutBinding.inflate(inflater, container, false);

        binding.viewPager.setAdapter(new FragmentAdapter(getFragmentManager()));
        binding.tabLayout.setupWithViewPager(binding.viewPager);

        return binding.getRoot();
    }
}