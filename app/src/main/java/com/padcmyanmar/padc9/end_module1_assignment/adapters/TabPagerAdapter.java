package com.padcmyanmar.padc9.end_module1_assignment.adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.padcmyanmar.padc9.end_module1_assignment.fragments.NearbyHotelFragment;

public class TabPagerAdapter extends FragmentStatePagerAdapter {

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        if(i == 0){
            return new NearbyHotelFragment();
        }else if(i == 1){
            return new NearbyHotelFragment();
        }else return new NearbyHotelFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return  "Nearby";
        }else if(position == 1){
            return "Popular";
        }else return "All";
    }
}
