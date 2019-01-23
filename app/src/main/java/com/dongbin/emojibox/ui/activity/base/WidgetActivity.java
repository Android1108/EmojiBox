package com.dongbin.emojibox.ui.activity.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import butterknife.ButterKnife;

/**
 * @author k-lm on 2017/11/14.
 */

public abstract class WidgetActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initLayout();
        initView();
        init();
        initData();

    }

    /**
     * 返回layoutId
     *
     * @return layoutId
     */
    protected abstract int getLayoutId();

    /**
     * 用于初始化布局
     */
    void initLayout() {
        setContentView(getLayoutId());
       // SoftHideKeyBoardUtil.assistActivity(this);
        ButterKnife.bind(this);

    }

    /**
     * 用于初始化view ，仅用于base类
     */
     void initView() {

    }



    protected void init() {

    }

    protected void initData() {
    }




    /**
     * 返回通知栏高度
     *
     * @return 返回 返回通知栏高度, 返回-1为未获取到
     */
    public int getNoticeBarHeight() {
        int statusBarHeight = -1;
        //获取status_bar_height资源的ID
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            //根据资源ID获取响应的尺寸值
            statusBarHeight = getResources().getDimensionPixelSize(resourceId);

        }
        return statusBarHeight;
    }




}
