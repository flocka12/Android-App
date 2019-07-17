package com.example.andelaapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if (getIntent().hasExtra("flocka")){
            TextView tv = (TextView) findViewById(R.id.about_alc_head_view);
            String text = getIntent().getExtras().getString("flocka");
            tv.setText(text);
        }
        if (getIntent().hasExtra("schu")){
            TextView tv = (TextView) findViewById(R.id.about_alc_topic_view);
            String text = getIntent().getExtras().getString("schu");
            tv.setText(text);
        }
        if (getIntent().hasExtra("lose")){
            TextView tv = (TextView) findViewById(R.id.about_alc_bod_view);
            String text = getIntent().getExtras().getString("lose");
            tv.setText(text);
        }
        if (getIntent().hasExtra("luk")){
            TextView tv = (TextView) findViewById(R.id.about_alc_end_view);
            String text = getIntent().getExtras().getString("luk");
            tv.setText(text);
        }
    }
}
