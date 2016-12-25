package com.lfk.listviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015/12/1.
 */
public class ListAdapter extends BaseAdapter {
    private ArrayList<ListInfo> userList;
    private Context context;        //上下文
    e

    public ListAdapter(Context context, ArrayList<ListInfo> userList) {
        this.context = context;
        this.userList = userList;
    }
    //缓存
    private class ViewHolder{
        private ImageView imageView;
        private TextView textView;
        private CheckBox checkBox;
    }

    @Override
    public int getCount() {
        return userList.size();
    }

    @Override
    public Object getItem(int i) {
        return userList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // 首先新建viewHolder实例，由于getView这个函数会在每个Item生成的时候都运行一次，
        // 所以我们用了这种写法
        ViewHolder viewHolder = null;
        // view还是null时，此时为第一次创建
        if(view == null){       //最开始缓存为0
            // 新建实例
            viewHolder = new ViewHolder();
            // 为View添加布局，此处View是Item的View
            view = LayoutInflater.from(context).inflate(R.layout.list_item,null);
            // 为ViewHolder填充
            viewHolder.imageView = (ImageView)view.findViewById(R.id.list_img);
            viewHolder.textView = (TextView)view.findViewById(R.id.list_text);
            viewHolder.checkBox = (CheckBox)view.findViewById(R.id.list_check);
            // 给View设定额外的标签，可存储一个数据，我们把ViewHolder存进去
            view.setTag(viewHolder);
        }else {
            // 此处已经是>=2 创建Item了
            // 把view从tag中拿出来
            viewHolder = (ViewHolder)view.getTag();
        }
        // 从ArrayList找到当前项的数据
        ListInfo listInfo = userList.get(i);
        // 逐个填充
        viewHolder.imageView.setImageResource(listInfo.getList_img());
        viewHolder.textView.setText(listInfo.getList_text());
        viewHolder.checkBox.setChecked(listInfo.isList_click());
        return view;
    }
}
