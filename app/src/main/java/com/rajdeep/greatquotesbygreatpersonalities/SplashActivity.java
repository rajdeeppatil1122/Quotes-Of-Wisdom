package com.rajdeep.greatquotesbygreatpersonalities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends AppCompatActivity {
    LottieAnimationView lottieAnimationView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        lottieAnimationView = findViewById(R.id.lottieAnimationView);
        textView = findViewById(R.id.title);

        lottieAnimationView.playAnimation();

        Animation scale = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_anim_faster);
        Animation fade_in = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        lottieAnimationView.startAnimation(scale);
        textView.startAnimation(fade_in);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent iHome = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(iHome);
                finish();       // finish() this will clear the backtrace of the SplashActivity Activity from the stack
                finishAffinity();
            }
        }, 3500);

//        5200


    }
}