package com.example.wonder_pass;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionsPageAdapter extends FragmentPagerAdapter {

    // variables that track fragments and fragment titles
    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();

    // add fragment to fragment list
    public void addFragment(Fragment fragment, String title) {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

    public SectionsPageAdapter(FragmentManager fm){
        super(fm);
    }

    // return page title
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }

    // return actual fragment itself
    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    // return fragment list size
    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}
