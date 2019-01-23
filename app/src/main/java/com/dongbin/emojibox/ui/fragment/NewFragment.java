package com.dongbin.emojibox.ui.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.dongbin.emojibox.R;
import com.dongbin.emojibox.adapter.HotGifRecycleViewAdapter;
import com.dongbin.emojibox.bean.HotGifBean;
import com.dongbin.emojibox.ui.fragment.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.recyclerview.adapters.AlphaInAnimationAdapter;

public class NewFragment extends BaseFragment {
    private RecyclerView recyclerView;
    private List<HotGifBean> hotGifBeanList;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_new;
    }

    @Override
    public void initView(View view) {
        super.initView(view);
        recyclerView=view.findViewById(R.id.fg_newfragment_rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        hotGifBeanList=new ArrayList<>();
        for (int i=0;i<10;i++){
            HotGifBean bean=new HotGifBean();
            bean.setGif_title("ss");
            bean.setGif_url("ss");
            hotGifBeanList.add(bean);
        }

        HotGifRecycleViewAdapter adapter=new HotGifRecycleViewAdapter(getContext(),hotGifBeanList);
        recyclerView.setAdapter(new AlphaInAnimationAdapter(adapter));



    }
}
