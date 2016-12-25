package com.lfk.listviewdemo;

/**
 * Created by Administrator on 2015/11/30.
 */
public class ListInfo {
    private int list_img;
    private String list_text;
    private boolean list_click;

    public ListInfo(int list_img, String list_text, boolean list_click) {
        this.list_img = list_img;
        this.list_text = list_text;
        this.list_click = list_click;
    }

    public int getList_img() {
        return list_img;
    }

    public String getList_text() {
        return list_text;
    }

    public boolean isList_click() {
        return list_click;
    }
}
