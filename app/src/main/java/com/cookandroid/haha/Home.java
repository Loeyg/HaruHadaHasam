package com.cookandroid.haha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button home, calendar, setting;

        home = (Button) findViewById(R.id.home);
        calendar = (Button) findViewById(R.id.calendar);
        setting = (Button) findViewById(R.id.setting);

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mIntent = new Intent(Home.this, Setting.class);
                startActivity(mIntent);
                finish();
            }
        });

        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mIntent = new Intent(Home.this, Calendar.class);
                startActivity(mIntent);
                finish();
            }
        });

    }
}