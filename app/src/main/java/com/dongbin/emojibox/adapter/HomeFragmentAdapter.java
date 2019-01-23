package com.dongbin.emojibox.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class HomeFragmentAdapter extends FragmentPagerAdapter {
    private List<Fragment> list;
    public HomeFragmentAdapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.list=list;
    }

    @Override
    public Fragment getItem(int i) {
        return list.get(i);
    }

    @Override
    public int getCount() {
        return list.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "最新";
            case 1:
                return "热门";
            default:
                return null;
        }

    }
}
