package com.example.shoku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.shoku.Fragments.AccountFragment;
import com.example.shoku.Fragments.DeliveryFragment;
import com.example.shoku.Fragments.HistoryFragment;
import com.example.shoku.databinding.ActivityCustomerBinding;
import com.iammert.library.readablebottombar.ReadableBottomBar;

public class CustomerActivity extends AppCompatActivity {

    ActivityCustomerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, new DeliveryFragment());
        transaction.commit();


        binding.readableBottomBar.setOnItemSelectListener(new ReadableBottomBar.ItemSelectListener() {
            @Override
            public void onItemSelected(int i) {

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                switch (i)
                {
                    case 0:
                        transaction.replace(R.id.container, new DeliveryFragment());
                    break;

                    case 1:
                        transaction.replace(R.id.container, new HistoryFragment());
                        break;

                    case 2:
                        transaction.replace(R.id.container, new AccountFragment());
                        break;
                }
                transaction.commit();
            }
        });
    }
}