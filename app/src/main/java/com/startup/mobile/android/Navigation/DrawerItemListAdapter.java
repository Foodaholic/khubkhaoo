package com.startup.mobile.android.Navigation;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.startup.mobile.android.R;

import java.util.List;

public class DrawerItemListAdapter extends BaseAdapter{
    private final Activity activity;
    private final List<String> drawerItems;

    public DrawerItemListAdapter(Activity activity, List<String> drawerItems) {
        this.activity = activity;
        this.drawerItems = drawerItems;
    }

    @Override
    public int getCount() {
        return drawerItems.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if(convertView == null){
            LayoutInflater inflater = activity.getLayoutInflater();
            view= inflater.inflate(R.layout.drawer_list_item, parent, false);
        }
        else {
            view = convertView;
        }
        TextView titleView = (TextView) view.findViewById(R.id.drawer_item_text);
        titleView.setText(drawerItems.get(position));
        return view;
    }
}
