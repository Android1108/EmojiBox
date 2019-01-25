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
import com.dongbin.emojibox.bean.NewGifBean;

import java.util.List;

public class NewGifRecycleViewAdapter extends RecyclerView.Adapter {
     private Context context;
    private List<NewGifBean> list;

    public NewGifRecycleViewAdapter(Context context, List<NewGifBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {
        View view =LayoutInflater.from(context).inflate(R.layout.item_new_gif,viewGroup,false);
        NewGifViewHolder hotGifViewHolder=new NewGifViewHolder(view);
        return hotGifViewHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ((NewGifViewHolder)viewHolder).Title.setText(list.get(i).getGif_title());
        //((HotGifViewHolder)viewHolder).Img.setImageBitmap(BitmapFactory.decodeResource(context.getResources(),R.drawable.honshaoyu));

        Glide.with(context).load("https://pic1.zhimg.com/80/v2-35b25f2406a9040c87fdff0d3c837330_hd.jpg").into( ((NewGifViewHolder)viewHolder).Img1);
        Glide.with(context).load("https://pic4.zhimg.com/80/v2-643be47b204809237a27d9583da9fabf_hd.jpg").into( ((NewGifViewHolder)viewHolder).Img2);
        Glide.with(context).load("https://pic4.zhimg.com/80/v2-a86b5c9a7ce1aea38f5e0ac43fb8c4c3_hd.jpg").into( ((NewGifViewHolder)viewHolder).Img3);



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class NewGifViewHolder extends RecyclerView.ViewHolder{
        private ImageView Img1;
        private ImageView Img2;
        private ImageView Img3;
        private TextView Title;
        private TextView Like_Num;
        private ImageView Like_Img;


        private NewGifViewHolder(View itemView) {
            super(itemView);
            Img1=itemView.findViewById(R.id.item_hot_gif_img1);
            Img2=itemView.findViewById(R.id.item_hot_gif_img2);
            Img3=itemView.findViewById(R.id.item_hot_gif_img3);
            Title=itemView.findViewById(R.id.item_new_gif_title);
            Like_Num=itemView.findViewById(R.id.item_new_gif_like_num);
            Like_Img=itemView.findViewById(R.id.item_hot_gif_like_icon);


        }
    }


}
