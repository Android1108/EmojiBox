package com.dongbin.emojibox.network.bean;

/**
 * Created by Administrator on 2018/4/24.
 */

public class JsonItem {
    private String key;
    private Object value;

    public JsonItem(String key, Object value){
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
