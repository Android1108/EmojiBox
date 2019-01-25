package com.dongbin.emojibox.bean;

public class NewGifBean {
   private String img1;
   private String img2;
   private String img3;
   private String gif_title;
   private int like_num;
   private boolean like_press;

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public String getGif_title() {
        return gif_title;
    }

    public void setGif_title(String gif_title) {
        this.gif_title = gif_title;
    }

    public int getLike_num() {
        return like_num;
    }

    public void setLike_num(int like_num) {
        this.like_num = like_num;
    }

    public boolean isLike_press() {
        return like_press;
    }

    public void setLike_press(boolean like_press) {
        this.like_press = like_press;
    }
}
