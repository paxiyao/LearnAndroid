package com.a24900.helloworld.ListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.a24900.helloworld.R;
import com.bumptech.glide.Glide;

/**
 * Created by 24900 on 2018/10/27.
 */

public class MyListAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public MyListAdapter(Context context) {
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder {
        public ImageView imageview;
        public TextView tv_title,tv_time,tv_content;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder view = null;
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.layout_list_view, null);
            view = new ViewHolder();
            view.imageview = (ImageView) convertView.findViewById(R.id.iv);
            view.tv_title = (TextView) convertView.findViewById(R.id.tv_title);
            view.tv_time = (TextView) convertView.findViewById(R.id.tv_time);
            view.tv_content = (TextView) convertView.findViewById(R.id.tv_content);

            convertView.setTag(view);
        } else {
            view = (ViewHolder) convertView.getTag();
        }
        //给控件复制
        view.tv_title.setText("这是标题");
        view.tv_time.setText("这是时间");
        view.tv_content.setText("这是内容");
        Glide.with(mContext).load("https://www.baidu.com/img/bd_logo1.png").into(view.imageview);
        return convertView;
    }
}
