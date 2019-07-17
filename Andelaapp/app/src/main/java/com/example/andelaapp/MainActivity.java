package com.example.andelaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView title = (TextView)findViewById(R.id.textView);
        title.setText("Welcome to alc 4.0");

        Button alc_activity = (Button)findViewById(R.id.about_alc_button);
        alc_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent StartIntent = new Intent(getApplicationContext(), Main2Activity.class);
                StartIntent.putExtra("flocka", "THE ANDELA LEARNING COMMUNITy");
                StartIntent.putExtra("schu", "A community empowering the next generation of African technology leaders");
                StartIntent.putExtra("lose", "Join us!");
                StartIntent.putExtra("luk", "The Andela Learning Community is a network of technologists and tech enthusiasts across africa dedicated to learning how to use technology to solve human problems");
                startActivity(StartIntent);}  });

        Button profile = (Button)findViewById(R.id.my_profile_button);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent StartIntent = new Intent(getApplicationContext(), Main3Activity.class);
                StartIntent.putExtra("track", "Track: Android");
                StartIntent.putExtra("count", "Country: Nigeria");
                StartIntent.putExtra("email", "Email: johndoe@gmail.com");
                StartIntent.putExtra("num", "Phone number: 2348063547362");
                StartIntent.putExtra("slack", "Slack username: @johndoe");
                startActivity(StartIntent);
            }
        });}}