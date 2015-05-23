package com.startup.mobile.android.Login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.startup.mobile.android.Navigation.NavigationDrawerActivity;
import com.startup.mobile.android.R;

public class LoginActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.login);
        TextView continueAsGuest = (TextView) findViewById(R.id.guest);
        continueAsGuest.setOnClickListener(continueAsGuestListener());
        super.onCreate(savedInstanceState);
    }

    private View.OnClickListener continueAsGuestListener(){
       return new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NavigationDrawerActivity.class);
                startActivity(intent);
            }
        };
    }
}
