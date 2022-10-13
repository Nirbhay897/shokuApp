package com.example.shoku.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.shoku.Fragments.DailyFragment;
import com.example.shoku.Fragments.MonthlyFragment;
import com.example.shoku.Fragments.WeeklyFragment;

public class FragmentAdapter extends FragmentPagerAdapter {
    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:return new DailyFragment();
            case 1:return new WeeklyFragment();
            case 2:return new MonthlyFragment();
            default:return new DailyFragment();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        String title  = null;

        if (position == 0)
        {
            title = "DAILY";
        }
         if (position == 1)
        {
            title = "WEEKLY";
        }
        if (position==2){

            title = "MONTHLY";
        }
        return title;
    }
}
