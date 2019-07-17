package com.example.andelaapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView title = (TextView)findViewById(R.id.nameView);
        title.setText("John Doe");

        if (getIntent().hasExtra("track")){
            TextView tv = (TextView) findViewById(R.id.trackView);
            String text = getIntent().getExtras().getString("track");
            tv.setText(text);
        }
        if (getIntent().hasExtra("count")){
            TextView tv = (TextView) findViewById(R.id.countView);
            String text = getIntent().getExtras().getString("count");
            tv.setText(text);
        }
        if (getIntent().hasExtra("email")){
            TextView tv = (TextView) findViewById(R.id.emailView);
            String text = getIntent().getExtras().getString("email");
            tv.setText(text);
        }
        if (getIntent().hasExtra("num")){
            TextView tv = (TextView) findViewById(R.id.numView);
            String text = getIntent().getExtras().getString("num");
            tv.setText(text);
        }
        if (getIntent().hasExtra("slack")){
            TextView tv = (TextView) findViewById(R.id.slackView);
            String text = getIntent().getExtras().getString("slack");
            tv.setText(text);
        }
    }
}
