package com.example.phai0512.tutorialapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

// import jp.co.casareal.sample.viewpagersample.fragment.AgeFragment;
// import jp.co.casareal.sample.viewpagersample.fragment.FoodFragment;
// import jp.co.casareal.sample.viewpagersample.fragment.NameFragment;

/**
 * Created by phai0512 on 2017/10/07.
 */

public class HelloInfoViewPagerAdapter extends FragmentPagerAdapter {
    private static final int PAGE_NUM = 2;

    public HelloInfoViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new HelloFragment();
                break;
            default:
                fragment = new WorldFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return PAGE_NUM;
    }
}
