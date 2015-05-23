package com.startup.mobile.android.Login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.startup.mobile.android.Menu.Model.FoodItem;
import com.startup.mobile.android.Navigation.NavigationDrawerActivity;
import com.startup.mobile.android.R;

public class LoginActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.login);
        TextView continueAsGuest = (TextView) findViewById(R.id.guest);
        continueAsGuest.setOnClickListener(continueAsGuestListener());
        setupFoodItems();
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

    private void setupFoodItems(){
        FoodItem foodItem1 = new FoodItem("Rasmalai", "Desert", 100f);
        FoodItem foodItem2 = new FoodItem("no rasmalai", "no Desert", 1000f);
        FoodItem foodItem3 = new FoodItem("many Rasmalai", "many Deserts", 10f);
        FoodItem foodItem4 = new FoodItem("puchke", "bahut badiya", 100f);
        FoodItem foodItem5 = new FoodItem("aloo puri", "breakfast", 10062f);
        FoodItem foodItem6 = new FoodItem("maggi", "excess msd", 100f);
        FoodItem foodItem7 = new FoodItem("pita bread", "firangi start", 100f);
        FoodItem foodItem8 = new FoodItem("extra cheese pizza", "italian", 100f);
        FoodItem foodItem9 = new FoodItem("poha", "Kota mein jake", 100f);
        FoodItem foodItem10 = new FoodItem("French Fries", "God's Own Food", 123f);
        foodItem1.save();
        foodItem2.save();
        foodItem3.save();
        foodItem4.save();
        foodItem5.save();
        foodItem6.save();
        foodItem7.save();
        foodItem8.save();
        foodItem9.save();
        foodItem10.save();
    }
}
