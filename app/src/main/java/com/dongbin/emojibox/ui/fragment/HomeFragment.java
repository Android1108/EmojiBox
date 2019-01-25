package com.dongbin.emojibox.ui.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.dongbin.emojibox.R;
import com.dongbin.emojibox.adapter.HomeFragmentAdapter;
import com.dongbin.emojibox.ui.fragment.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends BaseFragment {

    private List<Fragment> mFragmentList;



    ViewPager viewPager;


    TabLayout tableLayout;


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    public void initView(View view) {
        super.initView(view);
       viewPager=view.findViewById(R.id.fg_home_pv);
       tableLayout=view.findViewById(R.id.fg_home_tab);

    }

    @Override
    public void init() {
        super.init();

        mFragmentList=new ArrayList<>();
        HotFragment hotFragment=new HotFragment();
        NewFragment newFragment=new NewFragment();

        mFragmentList.add(newFragment);
        mFragmentList.add(hotFragment);
        HomeFragmentAdapter adapter=new HomeFragmentAdapter(getChildFragmentManager(),mFragmentList);

        viewPager.setAdapter(adapter);
        tableLayout.setupWithViewPager(viewPager);
    }
}
