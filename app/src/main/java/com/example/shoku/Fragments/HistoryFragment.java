package com.example.shoku.Fragments;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;


import com.example.shoku.MainActivity;
import com.example.shoku.R;
import com.example.shoku.databinding.FragmentHistoryBinding;


public class HistoryFragment extends Fragment {

    Toolbar toolbar;

  //FragmentHistoryBinding binding;





    public HistoryFragment() {
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
         View view =  inflater.inflate(R.layout.fragment_history, container, false);
        //binding = FragmentHistoryBinding.inflate(inflater, container, false);







        return view;
    }
}