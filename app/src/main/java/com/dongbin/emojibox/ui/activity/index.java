package com.dongbin.emojibox.ui.activity;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.view.MenuItem;
import android.widget.TextView;

import com.dongbin.emojibox.R;
import com.dongbin.emojibox.adapter.IndexFragmentAdapter;
import com.dongbin.emojibox.ui.activity.base.ActionbarActivity;
import com.dongbin.emojibox.ui.fragment.HomeFragment;
import com.dongbin.emojibox.ui.fragment.MineFragment;
import com.dongbin.emojibox.ui.fragment.PublishFragment;
import com.dongbin.emojibox.util.CustomViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class index extends ActionbarActivity {
    private List<Fragment> mFragmentList;

    private TextView mTextMessage;


    @BindView(R.id.aty_index_vp)
    CustomViewPager mViewPager;


    @Override
    protected void init() {
        super.init();
        hideToolbar();
        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        initFragment();
    }
    private void initFragment(){
        mFragmentList=new ArrayList<>();
        HomeFragment homeFragment=new HomeFragment();
        MineFragment mineFragment=new MineFragment();
        PublishFragment publishFragment=new PublishFragment();
        mFragmentList.add(homeFragment);
        mFragmentList.add(mineFragment);
        mFragmentList.add(publishFragment);
        IndexFragmentAdapter adapter=new IndexFragmentAdapter(getSupportFragmentManager(),mFragmentList);
        mViewPager.setScanScroll(false);
        mViewPager.setAdapter(adapter);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mViewPager.setCurrentItem(0);
                    return true;
                case R.id.navigation_dashboard:
                    mViewPager.setCurrentItem(1);
                    return true;
                case R.id.navigation_notifications:
                    mViewPager.setCurrentItem(2);
                    return true;
            }
            return false;
        }
    };




    @Override
    protected int getLayoutId() {
        return R.layout.activity_index;

    }



}
