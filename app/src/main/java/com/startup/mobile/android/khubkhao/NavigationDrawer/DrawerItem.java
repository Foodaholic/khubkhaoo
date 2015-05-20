package com.startup.mobile.android.khubkhao.NavigationDrawer;

import android.app.Fragment;

public class DrawerItem {
    private String title;
    private Fragment fragment;

    public DrawerItem(Fragment fragment, String title) {
        this.fragment = fragment;
        this.title = title;
    }

    public void launch(){

    }
}
