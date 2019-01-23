package com.dongbin.emojibox.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dongbin.emojibox.R;
import com.dongbin.emojibox.bean.HotGifBean;

import java.util.List;

public class HotGifRecycleViewAdapter extends RecyclerView.Adapter {
     private Context context;
    private List<HotGifBean> list;

    public HotGifRecycleViewAdapter(Context context, List<HotGifBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {
        View view =LayoutInflater.from(context).inflate(R.layout.item_hot_gif,viewGroup,false);
        HotGifViewHolder hotGifViewHolder=new HotGifViewHolder(view);
        return hotGifViewHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ((HotGifViewHolder)viewHolder).Text.setText(list.get(i).getGif_title());

        Glide.with(context).load("http://goo.gl/gEgYUd").into( ((HotGifViewHolder)viewHolder).Img);



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class HotGifViewHolder extends RecyclerView.ViewHolder{
        private ImageView Img;
        private TextView Text;



        private HotGifViewHolder(View itemView) {
            super(itemView);
            Img=itemView.findViewById(R.id.item_hot_gif_img);
            Text=itemView.findViewById(R.id.item_hot_gif_tv);



        }
    }


}
