package com.example.dulip.fuel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView fue = findViewById(R.id.f1);
        CardView plu = findViewById(R.id.mm);
        fue.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Fuel.class);
                startActivity(i);
            }


        });
       plu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(MainActivity.this,Maintain.class);
                startActivity(j);
            }


        });

    }
}
