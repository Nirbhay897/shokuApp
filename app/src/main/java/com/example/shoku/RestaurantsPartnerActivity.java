package com.example.shoku;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.shoku.Fragments.DepositFragment;
import com.example.shoku.Fragments.FeedFragment;
import com.example.shoku.Fragments.GigsFragment;
import com.example.shoku.Fragments.InsightsFragment;
import com.example.shoku.Fragments.MenuFragment;
import com.example.shoku.Fragments.MoreFragment;
import com.example.shoku.Fragments.OrderFragment;
import com.example.shoku.Fragments.PayoutFragment;
import com.example.shoku.databinding.ActivityRestaurantsPartnerBinding;

public class RestaurantsPartnerActivity extends AppCompatActivity {

    ActivityRestaurantsPartnerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRestaurantsPartnerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar2);
        RestaurantsPartnerActivity.this.setTitle("Online");


        FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
        transaction1.replace(R.id.framelayout1, new OrderFragment());
        transaction1.commit();

        binding.bottomNavigation.setOnItemSelectedListener(item ->  {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            switch (item.getItemId())
            {
                case R.id.orders:
                    binding.toolbar2.setTitle("Online");
                    transaction.replace(R.id.framelayout1, new OrderFragment());
                    break;

                case R.id.menu:
                    binding.toolbar2.setTitle("Menu");
                    transaction.replace(R.id.framelayout1, new MenuFragment());
                    break;

                case R.id.insights:
                    binding.toolbar2.setTitle("Business Insights");
                    transaction.replace(R.id.framelayout1, new InsightsFragment());
                    break;

            }
            transaction.commit();
            return true;

        });
    }
    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {

        getMenuInflater().inflate(R.menu.restaurants_menu_item, menu);
        return true;
    }


}