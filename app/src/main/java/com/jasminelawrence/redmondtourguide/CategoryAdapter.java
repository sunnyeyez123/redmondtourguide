package com.jasminelawrence.redmondtourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Jasmine on 12/28/17.
 */


public class CategoryAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[]{"Live", "Eat", "Work", "Explore"};

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new LiveFragment();
        } else if (position == 1) {
            return new EatFragment();
        } else if (position == 2) {
            return new WorkFragment();
        } else {
            return new ExploreFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return tabTitles[position];

    }
}