package com.rajdeep.greatquotesbygreatpersonalities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    RelativeLayout like_activity, txtSetting;
    FloatingActionButton fabFav, fabSettings;
    CardView abdul_card_view, albert_card_view, henry_card_view, steve_card_view, buddha_card_view, dalai_card_view, bill_card_view, martin_card_view, bruce_less_card_view, thomas_card_view, custom_cardView;
    CardView abraham_cv, alan_cv, aesop_cv, albert_camus_cv, benjamin_cv, barack_cv, charlie_cv, christopher_cv,
            charles_cv, antony_cv, alex_cv, chirstopher_hit_cv, charles_darwin_cv, bernard_cv, vivekanand_cv,
            deepak_cv, elon_cv, william_cv, plato_cv, socrates_cv, sivananda_cv, mark_twain, gandhi_cv, leonardo_cv,
            usain_cv, helen_cv, karl_cv, jesus_cv, george_cv, muhammaad_cv, emily_cv, fyodor_cv, jane_cv, osho_cv,
            confuscius_cv, neil_cv, issac_cv, tony_cv, van_cv, warren_cv, chanakya_cv, denis_cv, walt_cv, walt_whitman_cv,
            nikola_cv;
    ImageView img2;
    LottieAnimationView lottie_customization;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.left_to_right, R.anim.right_to_left);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview);
        img2 = findViewById(R.id.img2);

        nikola_cv = findViewById(R.id.nikola_card_view);
        walt_whitman_cv = findViewById(R.id.walt_whitman_card_view);
        walt_cv = findViewById(R.id.walt_disney_card_view);
        denis_cv = findViewById(R.id.denis_waitley_card_view);
        chanakya_cv = findViewById(R.id.chanakya_card_view);
        warren_cv = findViewById(R.id.warren_buffett_card_view);
        van_cv = findViewById(R.id.vincent_card_view);
        tony_cv = findViewById(R.id.tony_card_view);
        issac_cv = findViewById(R.id.newton_card_view);
        neil_cv = findViewById(R.id.neil_card_view);
        confuscius_cv = findViewById(R.id.confucius_card_view);
        osho_cv = findViewById(R.id.osho_card_view);
        jane_cv = findViewById(R.id.jane_austen_card_view);
        fyodor_cv = findViewById(R.id.fyodor_card_view);
        emily_cv = findViewById(R.id.emily_card_view);
        muhammaad_cv = findViewById(R.id.muhummad_card_view);
        george_cv = findViewById(R.id.george_washington_card_view);
        jesus_cv = findViewById(R.id.jesus_card_view);
        karl_cv = findViewById(R.id.karl_marx_card_view);
        helen_cv = findViewById(R.id.helen_card_view);
        usain_cv = findViewById(R.id.usain_card_view);
        leonardo_cv = findViewById(R.id.leonardo_card_view);
        gandhi_cv = findViewById(R.id.mahatma_card_view);
        mark_twain = findViewById(R.id.mark_twain_card_view);
        sivananda_cv = findViewById(R.id.sivand_card_view);
        socrates_cv = findViewById(R.id.socrotes_card_view);
        plato_cv = findViewById(R.id.plato_card_view);
        william_cv = findViewById(R.id.william_shakes_card_view);
        elon_cv = findViewById(R.id.elon_card_view);
        deepak_cv = findViewById(R.id.deepka_card_view);
        vivekanand_cv = findViewById(R.id.vivekanand_card_view);
        bernard_cv = findViewById(R.id.bernard_card_view);
        charles_darwin_cv = findViewById(R.id.charles_darwin_card_view);
        chirstopher_hit_cv = findViewById(R.id.christopher_card_view);
        alex_cv = findViewById(R.id.alexander_card_view);
        antony_cv = findViewById(R.id.antony_robbin_card_view);
        charles_cv = findViewById(R.id.charles_dickens_card_view);
        christopher_cv = findViewById(R.id.christphoer_dawson_card_view);
        charlie_cv = findViewById(R.id.charlie_chaplin_card_view);
        barack_cv = findViewById(R.id.obama_card_view);
        benjamin_cv = findViewById(R.id.benjamin_card_view);
        albert_camus_cv = findViewById(R.id.albert_camus_card_view);
        aesop_cv = findViewById(R.id.aesop_card_view);
        alan_cv = findViewById(R.id.alanwatts_card_view);
        abraham_cv = findViewById(R.id.abraham_card_view);
        abdul_card_view = findViewById(R.id.abdul_card_view);
        albert_card_view = findViewById(R.id.albert_card_view);
        henry_card_view = findViewById(R.id.henry_card_view);
        steve_card_view = findViewById(R.id.steve_card_view);
        buddha_card_view = findViewById(R.id.buddha_card_view);
        dalai_card_view = findViewById(R.id.dalai_card_view);
        bill_card_view = findViewById(R.id.bill_card_view);
        martin_card_view = findViewById(R.id.martin_luther_card_view);
        bruce_less_card_view = findViewById(R.id.bruce_lee_card_view);
        thomas_card_view = findViewById(R.id.thomas_card_view);
        custom_cardView = findViewById(R.id.custom_cardView);
        lottie_customization = findViewById(R.id.lottie_customization);
        fabFav = findViewById(R.id.fabFav);
        fabSettings = findViewById(R.id.fabSettings);

        like_activity = findViewById(R.id.like_activity);
        txtSetting = findViewById(R.id.settings);


      Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;

//        Toast.makeText(this, "WIDTH " + width, Toast.LENGTH_SHORT).show();
        // We have done this
        abdul_card_view.requestLayout();
        abdul_card_view.getLayoutParams().height = (width/2)-30;
        albert_card_view.requestLayout();
        albert_card_view.getLayoutParams().height = (width/2)-30;
        henry_card_view.requestLayout();
        henry_card_view.getLayoutParams().height = (width/2)-30;
        steve_card_view.requestLayout();
        steve_card_view.getLayoutParams().height = (width/2)-30;
        buddha_card_view.requestLayout();
        buddha_card_view.getLayoutParams().height = (width/2)-30;
        dalai_card_view.requestLayout();
        dalai_card_view.getLayoutParams().height = (width/2)-30;
        martin_card_view.requestLayout();
        martin_card_view.getLayoutParams().height = (width/2)-30;
        bill_card_view.requestLayout();
        bill_card_view.getLayoutParams().height = (width/2)-30;
        thomas_card_view.requestLayout();
        thomas_card_view.getLayoutParams().height = (width/2)-30;
        bruce_less_card_view.requestLayout();
        bruce_less_card_view.getLayoutParams().height = (width/2)-30;
        abraham_cv.requestLayout();
        abraham_cv.getLayoutParams().height = (width/2) - 30;

        alan_cv.requestLayout();
        alan_cv.getLayoutParams().height = (width/2) - 30;

        aesop_cv.requestLayout();
        aesop_cv.getLayoutParams().height = (width/2) - 30;

        albert_camus_cv.requestLayout();
        albert_camus_cv.getLayoutParams().height = (width/2) - 30;

        benjamin_cv.requestLayout();
        benjamin_cv.getLayoutParams().height = (width/2) - 30;

        barack_cv.requestLayout();
        barack_cv.getLayoutParams().height = (width/2) - 30;

        charlie_cv.requestLayout();
        charlie_cv.getLayoutParams().height = (width/2) - 30;

        christopher_cv.requestLayout();
        christopher_cv.getLayoutParams().height = (width/2) - 30;

        charles_cv.requestLayout();
        charles_cv.getLayoutParams().height = (width/2) - 30;

        antony_cv.requestLayout();
        antony_cv.getLayoutParams().height = (width/2) - 30;

        alex_cv.requestLayout();
        alex_cv.getLayoutParams().height = (width/2) - 30;

        chirstopher_hit_cv.requestLayout();
        chirstopher_hit_cv.getLayoutParams().height = (width/2) - 30;

        charles_darwin_cv.requestLayout();
        charles_darwin_cv.getLayoutParams().height = (width/2) - 30;

        bernard_cv.requestLayout();
        bernard_cv.getLayoutParams().height = (width/2) - 30;

        vivekanand_cv.requestLayout();
        vivekanand_cv.getLayoutParams().height = (width/2) - 30;

        deepak_cv.requestLayout();
        deepak_cv.getLayoutParams().height = (width/2) - 30;

        elon_cv.requestLayout();
        elon_cv.getLayoutParams().height = (width/2) - 30;

        william_cv.requestLayout();
        william_cv.getLayoutParams().height = (width/2) - 30;

        plato_cv.requestLayout();
        plato_cv.getLayoutParams().height = (width/2) - 30;

        socrates_cv.requestLayout();
        socrates_cv.getLayoutParams().height = (width/2) - 30;

        sivananda_cv.requestLayout();
        sivananda_cv.getLayoutParams().height = (width/2) - 30;

        mark_twain.requestLayout();
        mark_twain.getLayoutParams().height = (width/2) - 30;

        gandhi_cv.requestLayout();
        gandhi_cv.getLayoutParams().height = (width/2) - 30;

        leonardo_cv.requestLayout();
        leonardo_cv.getLayoutParams().height = (width/2) - 30;

        usain_cv.requestLayout();
        usain_cv.getLayoutParams().height = (width/2) - 30;

        helen_cv.requestLayout();
        helen_cv.getLayoutParams().height = (width/2) - 30;

        karl_cv.requestLayout();
        karl_cv.getLayoutParams().height = (width/2) - 30;

        jesus_cv.requestLayout();
        jesus_cv.getLayoutParams().height = (width/2) - 30;

        george_cv.requestLayout();
        george_cv.getLayoutParams().height = (width/2) - 30;

        muhammaad_cv.requestLayout();
        muhammaad_cv.getLayoutParams().height = (width/2) - 30;

        emily_cv.requestLayout();
        emily_cv.getLayoutParams().height = (width/2) - 30;

        fyodor_cv.requestLayout();
        fyodor_cv.getLayoutParams().height = (width/2) - 30;

        jane_cv.requestLayout();
        jane_cv.getLayoutParams().height = (width/2) - 30;

        osho_cv.requestLayout();
        osho_cv.getLayoutParams().height = (width/2) - 30;

        confuscius_cv.requestLayout();
        confuscius_cv.getLayoutParams().height = (width/2) - 30;

        neil_cv.requestLayout();
        neil_cv.getLayoutParams().height = (width/2) - 30;

        issac_cv.requestLayout();
        issac_cv.getLayoutParams().height = (width/2) - 30;

        tony_cv.requestLayout();
        tony_cv.getLayoutParams().height = (width/2) - 30;

        van_cv.requestLayout();
        van_cv.getLayoutParams().height = (width/2) - 30;

        warren_cv.requestLayout();
        warren_cv.getLayoutParams().height = (width/2) - 30;

        chanakya_cv.requestLayout();
        chanakya_cv.getLayoutParams().height = (width/2) - 30;

        denis_cv.requestLayout();
        denis_cv.getLayoutParams().height = (width/2) - 30;

        walt_cv.requestLayout();
        walt_cv.getLayoutParams().height = (width/2) - 30;

        walt_whitman_cv.requestLayout();
        walt_whitman_cv.getLayoutParams().height = (width/2) - 30;

        nikola_cv.requestLayout();
        nikola_cv.getLayoutParams().height = (width/2) - 30;



        albert_card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag",1);
                startActivity(intent);
            }
        });

        abdul_card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag",2);
                startActivity(intent);
            }
        });

        steve_card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 3);
                startActivity(intent);
            }
        });

        henry_card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 4);
                startActivity(intent);
            }
        });

        buddha_card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 5);
                startActivity(intent);
            }
        });

        dalai_card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 6);
                startActivity(intent);
            }
        });

        bruce_less_card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 7);
                startActivity(intent);
            }
        });

        martin_card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 8);
                startActivity(intent);
            }
        });

        thomas_card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 9);
                startActivity(intent);
            }
        });

        bill_card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 10);
                startActivity(intent);
            }
        });


        abraham_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 11);
                startActivity(intent);
            }
        });

        alan_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 12);
                startActivity(intent);
            }
        });

        aesop_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 13);
                startActivity(intent);
            }
        });

        albert_camus_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 14);
                startActivity(intent);
            }
        });

        benjamin_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 15);
                startActivity(intent);
            }
        });

        barack_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 16);
                startActivity(intent);
            }
        });

        charlie_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 17);
                startActivity(intent);
            }
        });

        christopher_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 18);
                startActivity(intent);
            }
        });

        charles_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 19);
                startActivity(intent);
            }
        });

        antony_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 20);
                startActivity(intent);
            }
        });

        alex_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 21);
                startActivity(intent);
            }
        });

        chirstopher_hit_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 22);
                startActivity(intent);
            }
        });

        charles_darwin_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 23);
                startActivity(intent);
            }
        });

        bernard_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 24);
                startActivity(intent);
            }
        });

        vivekanand_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 25);
                startActivity(intent);
            }
        });

        deepak_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 26);
                startActivity(intent);
            }
        });

        elon_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 27);
                startActivity(intent);
            }
        });

        william_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 28);
                startActivity(intent);
            }
        });

        plato_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 29);
                startActivity(intent);
            }
        });

        socrates_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 30);
                startActivity(intent);
            }
        });

        sivananda_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 31);
                startActivity(intent);
            }
        });

        mark_twain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 32);
                startActivity(intent);
            }
        });

        gandhi_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 33);
                startActivity(intent);
            }
        });

        leonardo_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 34);
                startActivity(intent);
            }
        });

        usain_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 35);
                startActivity(intent);
            }
        });

        helen_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 36);
                startActivity(intent);
            }
        });

        karl_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 37);
                startActivity(intent);
            }
        });

        jesus_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 38);
                startActivity(intent);
            }
        });

        george_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 39);
                startActivity(intent);
            }
        });

        muhammaad_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 40);
                startActivity(intent);
            }
        });

        emily_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 41);
                startActivity(intent);
            }
        });

        fyodor_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 42);
                startActivity(intent);
            }
        });

        jane_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 43);
                startActivity(intent);
            }
        });

        osho_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 44);
                startActivity(intent);
            }
        });

        confuscius_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 45);
                startActivity(intent);
            }
        });

        neil_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 46);
                startActivity(intent);
            }
        });

        issac_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 47);
                startActivity(intent);
            }
        });

        tony_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 48);
                startActivity(intent);
            }
        });

        van_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 49);
                startActivity(intent);
            }
        });

        warren_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 50);
                startActivity(intent);
            }
        });

        chanakya_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 51);
                startActivity(intent);
            }
        });

        denis_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 52);
                startActivity(intent);
            }
        });

        walt_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 53);
                startActivity(intent);
            }
        });

        walt_whitman_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 54);
                startActivity(intent);
            }
        });

        nikola_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetaInformationActivity.class);
                intent.putExtra("Flag", 55);
                startActivity(intent);
            }
        });



        like_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LikeActivity.class);
                startActivity(intent);
            }
        });

        custom_cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (custom_cardView.isEnabled()) {
                    custom_cardView.setEnabled(false); // Disable the button to prevent further clicks
                    lottie_customization.playAnimation();

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent intent = new Intent(MainActivity.this, SettingActivity.class);
                            startActivity(intent);
                            custom_cardView.setEnabled(true); // Re-enable the button after the delay
                        }
                    }, 500);
                }
            }
        });


        fabSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(i);
            }
        });

        fabFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, LikeActivity.class);
                startActivity(i);
            }
        });

    }

}