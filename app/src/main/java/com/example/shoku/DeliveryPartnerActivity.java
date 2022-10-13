package com.example.shoku;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;

import com.example.shoku.Fragments.DepositFragment;
import com.example.shoku.Fragments.FeedFragment;
import com.example.shoku.Fragments.GigsFragment;
import com.example.shoku.Fragments.MoreFragment;
import com.example.shoku.Fragments.PayoutFragment;
import com.example.shoku.databinding.ActivityDeliveryPartnerBinding;

public class DeliveryPartnerActivity extends AppCompatActivity {

    ActivityDeliveryPartnerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDeliveryPartnerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        setSupportActionBar(binding.toolbar2);

        DeliveryPartnerActivity.this.setTitle("Offline");


        FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
        transaction1.replace(R.id.frameLayout, new FeedFragment());
        transaction1.commit();

        binding.bottomNavigation.setOnItemSelectedListener(item ->  {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                switch (item.getItemId())
                {
                    case R.id.feed:
                        transaction.replace(R.id.frameLayout, new FeedFragment());
                        break;

                    case R.id.payout:
                        transaction.replace(R.id.frameLayout, new PayoutFragment());
                        break;

                    case R.id.gigs:
                        transaction.replace(R.id.frameLayout, new GigsFragment());
                        break;


                    case R.id.deposit:
                        transaction.replace(R.id.frameLayout, new DepositFragment());
                        break;

                    case R.id.more:
                        transaction.replace(R.id.frameLayout, new MoreFragment());
                        break;


                }
                transaction.commit();
            return true;

        });
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {

        getMenuInflater().inflate(R.menu.delivery_menu_item, menu);
        return true;
    }
}