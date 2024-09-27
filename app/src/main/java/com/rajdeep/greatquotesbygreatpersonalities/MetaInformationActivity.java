package com.rajdeep.greatquotesbygreatpersonalities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class MetaInformationActivity extends AppCompatActivity {
    ImageView about_image;
    TextView read_info_btn, read_quotes_btn, about_name_txt;
    LinearLayout linearLayout;
    LottieAnimationView lottieAnimationView;
    Animation shake, scale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.left_to_right, R.anim.right_to_left);
        setContentView(R.layout.activity_meta_information);
        about_image = findViewById(R.id.about_image);
        about_name_txt = findViewById(R.id.about_name_txt);
        read_info_btn = findViewById(R.id.read_info_btn);
        read_quotes_btn = findViewById(R.id.read_quotes_btn);
        lottieAnimationView = findViewById(R.id.lottie_anime);

        shake = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake);
        scale = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_anim_faster);
        about_name_txt.startAnimation(scale);

        lottieAnimationView.playAnimation();

        Bundle data = getIntent().getExtras();
        int Flag = data.getInt("Flag");
        setData(Flag);

    }

    public void setData(int Flag){
        int resourceId = 0;     // initialized
        String aboutTxt="";     // initialized

        if(Flag == 1){
            resourceId = R.drawable.ab;
            aboutTxt = "About Albert Einstein :";
        }
        else if(Flag == 2){
            resourceId = R.drawable.apj3;
            aboutTxt = "About A.P.J Abdul Kalam :";
        }else if(Flag == 3){
            resourceId = R.drawable.steve_j;
            aboutTxt = "About Steve Jobs :";
        }else if(Flag == 4){
            resourceId = R.drawable.ford_baba;
            aboutTxt = "About Henry Ford :";
        }else if(Flag == 5){
            resourceId = R.drawable.g_b;
            aboutTxt = "About Gautama Buddha :";
        }else if(Flag == 6){
            resourceId = R.drawable.dalai_final;
            aboutTxt = "About Dalai Lama :";
        }else if(Flag == 7){
            resourceId = R.drawable.bruce_lee_;
            aboutTxt = "About Bruce Lee :";
        }else if(Flag == 8){
            resourceId = R.drawable.m_k2;
            aboutTxt = "About King Martin Luther :";
        }else if(Flag == 9){
            resourceId = R.drawable.thomas_e;
            aboutTxt = "About Thomas Edison :";
        }else if(Flag == 10){
            resourceId = R.drawable.b_g;
            aboutTxt = "About Bill Gates :";
        }
        else if(Flag == 11){
            resourceId = R.drawable.img11a;
            aboutTxt = "About Abraham Lincoln :";
        }else if(Flag == 12){
            resourceId = R.drawable.img12a;
            aboutTxt = "About Alan Watts :";
        }else if(Flag == 13){
            resourceId = R.drawable.img13a;
            aboutTxt = "About Aesop :";
        }else if(Flag == 14){
            resourceId = R.drawable.img14a;
            aboutTxt = "About Albert Camus :";
        }else if(Flag == 15){
            resourceId = R.drawable.img15a;
            aboutTxt = "About Benjamin Franklin :";
        }else if(Flag == 16){
            resourceId = R.drawable.img16a;
            aboutTxt = "About Barack Obama :";
        }else if(Flag == 17){
            resourceId = R.drawable.img17a;
            aboutTxt = "About Charlie Chaplin :";
        }else if(Flag == 18){
            resourceId = R.drawable.img18a;
            aboutTxt = "About Christopher Dawson :";
        }else if(Flag == 19){
            resourceId = R.drawable.img19a;
            aboutTxt = "About Charles Dickens :";
        }else if(Flag == 20){
            resourceId = R.drawable.img20a;
            aboutTxt = "About Antony Robin:";
        }else if(Flag == 21){
            resourceId = R.drawable.img21a;
            aboutTxt = "About Alexander The Great :";
        }else if(Flag == 22){
            resourceId = R.drawable.img22a;
            aboutTxt = "About Christopher Hitchens :";
        }else if(Flag == 23){
            resourceId = R.drawable.img23a;
            aboutTxt = "About Charles Darwin :";
        }else if(Flag == 24){
            resourceId = R.drawable.img24a;
            aboutTxt = "About Bernard Baruch :";
        }else if(Flag == 25){
            resourceId = R.drawable.img25a;
            aboutTxt = "About Swami Vivekananda :";
        }else if(Flag == 26){
            resourceId = R.drawable.img26a;
            aboutTxt = "About Deepak Chopra :";
        }else if(Flag == 27){
            resourceId = R.drawable.img27a;
            aboutTxt = "About Elon Musk :";
        }else if(Flag == 28){
            resourceId = R.drawable.img28a;
            aboutTxt = "About William Shakespeare :";
        }else if(Flag == 29){
            resourceId = R.drawable.img29a;
            aboutTxt = "About Plato :";
        }else if(Flag == 30){
            resourceId = R.drawable.img30a;
            aboutTxt = "About Socrates :";
        }else if(Flag == 31){
            resourceId = R.drawable.img31a;
            aboutTxt = "About Swami Sivananda :";
        }else if(Flag == 32){
            resourceId = R.drawable.img32a;
            aboutTxt = "About Mark Twain :";
        }else if(Flag == 33){
            resourceId = R.drawable.img33a;
            aboutTxt = "About Mahatma Gandhi :";
        }else if(Flag == 34){
            resourceId = R.drawable.img34a;
            aboutTxt = "About Leonardo da Vinci :";
        }else if(Flag == 35){
            resourceId = R.drawable.img35a;
            aboutTxt = "About Usain Bolt :";
        }else if(Flag == 36){
            resourceId = R.drawable.img36a;
            aboutTxt = "About Helen Keller :";
        }else if(Flag == 37){
            resourceId = R.drawable.img37a;
            aboutTxt = "About Karl Marx :";
        }else if(Flag == 38){
            resourceId = R.drawable.img38a;
            aboutTxt = "About Jesus Christ :";
        }else if(Flag == 39){
            resourceId = R.drawable.img39a;
            aboutTxt = "About George Washington :";
        }else if(Flag == 40){
            resourceId = R.drawable.img40a;
            aboutTxt = "About Muhammad :";
        }else if(Flag == 41){
            resourceId = R.drawable.img41a;
            aboutTxt = "About Emily Dickinson :";
        }else if(Flag == 42){
            resourceId = R.drawable.img42a;
            aboutTxt = "About Fyodor Dostoevsky :";
        }else if(Flag == 43){
            resourceId = R.drawable.img43a;
            aboutTxt = "About Jane Austen :";
        }else if(Flag == 44){
            resourceId = R.drawable.img44a;
            aboutTxt = "About Osho :";
        }else if(Flag == 45){
            resourceId = R.drawable.img45a;
            aboutTxt = "About Confucius :";
        }else if(Flag == 46){
            resourceId = R.drawable.img46a;
            aboutTxt = "About Neil Armstrong :";
        }else if(Flag == 47){
            resourceId = R.drawable.img47a;
            aboutTxt = "About Isaac Newton :";
        }else if(Flag == 48){
            resourceId = R.drawable.img48a;
            aboutTxt = "About Tony Robbins :";
        }else if(Flag == 49){
            resourceId = R.drawable.img49a;
            aboutTxt = "About Vincent van Gogh :";
        }else if(Flag == 50){
            resourceId = R.drawable.img50a;
            aboutTxt = "About Warren Buffett :";
        }else if(Flag == 51){
            resourceId = R.drawable.img51a;
            aboutTxt = "About Chanakya :";
        }else if(Flag == 52){
            resourceId = R.drawable.img52a;
            aboutTxt = "About Denis Waitley :";
        }else if(Flag == 53){
            resourceId = R.drawable.img53a;
            aboutTxt = "About Walt Disney :";
        }else if(Flag == 54){
            resourceId = R.drawable.img54a;
            aboutTxt = "About Walt Whitman :";
        }else if(Flag == 55){
            resourceId = R.drawable.img55a;
            aboutTxt = "About Nikola Tesla :";
        }



        Uri imgUri = Uri.parse("android.resource://"+ getPackageName() + "/" + resourceId);
//        System.out.println(imgUri);
        about_image.setImageURI(imgUri);
        about_name_txt.setText(aboutTxt);

        read_info_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                read_info_btn.startAnimation(shake);

                Intent intent = new Intent(MetaInformationActivity.this, ReadActivity.class);
                intent.putExtra("flag", Flag);
                startActivity(intent);
            }
        });

        read_quotes_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                read_quotes_btn.startAnimation(shake);
                Intent intent = new Intent(MetaInformationActivity.this, QuotesActivity.class);
                intent.putExtra("Flag", Flag);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(intent);
                    }
                }, 400);

            }
        });


    }


//    @Override
//    public void onBackPressed() {
//
//        overridePendingTransition(R.anim.right_to_left, R.anim.left_to_right);
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                MetaInformationActivity.super.onBackPressed();
//            }
//        }, 1040);
//    }
}