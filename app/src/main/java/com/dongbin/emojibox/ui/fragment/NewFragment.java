package com.dongbin.emojibox.ui.fragment;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.OvershootInterpolator;

import com.dongbin.emojibox.R;
import com.dongbin.emojibox.adapter.NewGifRecycleViewAdapter;
import com.dongbin.emojibox.bean.NewGifBean;
import com.dongbin.emojibox.ui.fragment.base.BaseFragment;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.footer.BallPulseFooter;
import com.scwang.smartrefresh.layout.header.BezierRadarHeader;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.recyclerview.adapters.AlphaInAnimationAdapter;

public class NewFragment extends BaseFragment {
    private RecyclerView recyclerView;


    private List<NewGifBean> newGifBeansList;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_new;
    }

    @Override
    public void initView(View view) {
        super.initView(view);
        RefreshLayout refreshLayout=view.findViewById(R.id.refreshLayout);
        refreshLayout.setRefreshHeader(new BezierRadarHeader(getContext()).setEnableHorizontalDrag(true));
//设置 Footer 为 球脉冲 样式
        refreshLayout.setRefreshFooter(new BallPulseFooter(getContext()).setSpinnerStyle(SpinnerStyle.Scale));

        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                refreshLayout.finishRefresh(500/*,false*/);//传入false表示刷新失败

            }
        });
        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                refreshLayout.finishLoadMore(2000/*,false*/);//传入false表示加载失败
            }
        });

        recyclerView=view.findViewById(R.id.fg_newfragment_rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);


        newGifBeansList=new ArrayList<>();
        for (int i=0;i<10;i++){
            NewGifBean bean=new NewGifBean();
            bean.setGif_title("EmojiBox表情包测试");

            newGifBeansList.add(bean);
        }

        NewGifRecycleViewAdapter adapter=new NewGifRecycleViewAdapter(getContext(),newGifBeansList);
        AlphaInAnimationAdapter alphaAdapter = new AlphaInAnimationAdapter(adapter);
        alphaAdapter.setDuration(1000);
        alphaAdapter.setInterpolator(new OvershootInterpolator());
        recyclerView.setAdapter(alphaAdapter);



    }
}
