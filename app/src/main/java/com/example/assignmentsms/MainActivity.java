package com.example.assignmentsms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import static android.os.SystemClock.sleep;

public class MainActivity extends AppCompatActivity {
    Animation top,bottom;
    ImageView image;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Handler handler= new Handler();
        top= AnimationUtils.loadAnimation(MainActivity.this,R.anim.top_animation);
        bottom= AnimationUtils.loadAnimation(MainActivity.this,R.anim.bottom_animation);
        image=findViewById(R.id.image);
        text=findViewById(R.id.slogan);
        image.setAnimation(top);
        text.setAnimation(bottom);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

            sta();
            finish();
            }
        },3000);
    }
    public void sta(){

        try {

            startActivity(new Intent(this,Sms.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}