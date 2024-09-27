package com.rajdeep.greatquotesbygreatpersonalities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class SettingActivity extends AppCompatActivity {

    RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10, rb11, rb12, rb13, rb14, rb15, rb16, rb17, rb18, rb19, rb20, rb21;
    LottieAnimationView obq_lottie1, obq_lottie2, obq_lottie3, obq_lottie4, obq_lottie5, obq_lottie6, obq_lottie7,  obq_lottie8, obq_lottie9, obq_lottie10, obq_lottie11, obq_lottie12, obq_lottie13, obq_lottie14, obq_lottie15;
    ImageView obq_image1, obq_image2, obq_image3, obq_image4, obq_image5, obq_image6, obq_image7, obq_image8, obq_image9, obq_image10, obq_image11, obq_image12, obq_image13, obq_image14, obq_image15;
    Button saveSettingsBtn;
    String imageNameNo = "";
    String fontNameNo = "";
    String selectedOption = "";
    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
//        overridePendingTransition(R.anim.left_to_right_second, R.anim.right_to_left_second);

        obq_lottie1 = findViewById(R.id.obq_lottie1);
        obq_lottie2 = findViewById(R.id.obq_lottie2);
        obq_lottie3 = findViewById(R.id.obq_lottie3);
        obq_lottie4 = findViewById(R.id.obq_lottie4);
        obq_lottie5 = findViewById(R.id.obq_lottie5);
        obq_lottie6 = findViewById(R.id.obq_lottie6);
        obq_lottie7 = findViewById(R.id.obq_lottie7);
        obq_lottie8 = findViewById(R.id.obq_lottie8);
        obq_lottie9 = findViewById(R.id.obq_lottie9);
        obq_lottie10 = findViewById(R.id.obq_lottie10);
        obq_lottie11 = findViewById(R.id.obq_lottie11);
        obq_lottie12 = findViewById(R.id.obq_lottie12);
        obq_lottie13 = findViewById(R.id.obq_lottie13);
        obq_lottie14 = findViewById(R.id.obq_lottie14);
        obq_lottie15 = findViewById(R.id.obq_lottie15);

        obq_image1 = findViewById(R.id.obq1);
        obq_image2 = findViewById(R.id.obq2);
        obq_image3 = findViewById(R.id.obq3);
        obq_image4 = findViewById(R.id.obq4);
        obq_image5 = findViewById(R.id.obq5);
        obq_image6 = findViewById(R.id.obq6);
        obq_image7 = findViewById(R.id.obq7);
        obq_image8 = findViewById(R.id.obq8);
        obq_image9 = findViewById(R.id.obq9);
        obq_image10 = findViewById(R.id.obq10);
        obq_image11 = findViewById(R.id.obq11);
        obq_image12 = findViewById(R.id.obq12);
        obq_image13 = findViewById(R.id.obq13);
        obq_image14 = findViewById(R.id.obq14);
        obq_image15 = findViewById(R.id.obq15);
        saveSettingsBtn = findViewById(R.id.saveSettingsButton);

        rb1 = findViewById(R.id.r1);
        rb2 = findViewById(R.id.r2);
        rb3 = findViewById(R.id.r3);
        rb4 = findViewById(R.id.r4);
        rb5 = findViewById(R.id.r5);
        rb6 = findViewById(R.id.r6);
        rb7 = findViewById(R.id.r7);
        rb8 = findViewById(R.id.r8);
        rb9 = findViewById(R.id.r9);
        rb10 = findViewById(R.id.r10);
        rb11 = findViewById(R.id.r11);
        rb12 = findViewById(R.id.r12);
        rb13 = findViewById(R.id.r13);
        rb14 = findViewById(R.id.r14);
        rb15 = findViewById(R.id.r15);
        rb16 = findViewById(R.id.r16);
        rb17 = findViewById(R.id.r17);
        rb18 = findViewById(R.id.r18);
        rb19 = findViewById(R.id.r19);
        rb20 = findViewById(R.id.r20);
        rb21 = findViewById(R.id.r21);



        // finding radio button value...
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // Handle the checked radio button change event
                RadioButton radioButton = findViewById(checkedId);
                selectedOption = radioButton.getText().toString();
                // Use the selectedOption as needed
                flag++;

                // Handle OK button click
                if(selectedOption.equals("Bariol Bold Webfont (Default)")){
                    fontNameNo = "1";
                }
                else if (selectedOption.equals("Arial Regular")){
                    fontNameNo = "2";
                }
                else if(selectedOption.equals("Arial Bold")){
                    fontNameNo = "3";
                }
                else if(selectedOption.equals("Articulat Regular")){
                    fontNameNo = "4";
                }
                else if(selectedOption.equals("Articulat Bold")){
                    fontNameNo = "5";
                }
                else if(selectedOption.equals("Bariol Regular")){
                    fontNameNo = "6";
                }
                else if(selectedOption.equals("Basecoat Regular")){
                    fontNameNo = "7";
                }
                else if(selectedOption.equals("Basecoat Bold")){
                    fontNameNo = "8";
                }
                else if(selectedOption.equals("Casual")){
                    fontNameNo = "9";
                }
                else if(selectedOption.equals("Cursive Great Vibes")){
                    fontNameNo = "10";
                }
                else if(selectedOption.equals("Monospace")){
                    fontNameNo = "11";
                }
                else if(selectedOption.equals("Nunito Regular")){
                    fontNameNo = "12";
                }
                else if(selectedOption.equals("Nunito Bold")){
                    fontNameNo = "13";
                }
                else if(selectedOption.equals("Nunito Black")){
                    fontNameNo = "14";
                }
                else if(selectedOption.equals("Proxima Nova Regular")){
                    fontNameNo = "15";
                }
                else if(selectedOption.equals("Proxima Nova Semibold")){
                    fontNameNo = "16";
                }
                else if(selectedOption.equals("Proxima Nova Bold")){
                    fontNameNo = "17";
                }
                else if(selectedOption.equals("Sans Serif")){
                    fontNameNo = "18";
                }
                else if(selectedOption.equals("Serif")){
                    fontNameNo = "19";
                }
                else if(selectedOption.equals("Cursive Tangerine")){
                    fontNameNo = "20";
                }
                else if(selectedOption.equals("Cursive Cookie")){
                    fontNameNo = "21";
                }
            }
        });



        // Getting Info from database an setting the lottie animation on it and also values...
        DatabaseHelper databaseHelper = new DatabaseHelper(SettingActivity.this);
        int info[] = databaseHelper.getStyleInfo();
        String fontNumber = String.valueOf(info[0]);
        String imageNumber = String.valueOf(info[1]);
        fontNameNo = fontNumber;
        imageNameNo = imageNumber;
//        Toast.makeText(this, fontNumber + " " + imageNumber, Toast.LENGTH_SHORT).show();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                // selecting image
                if(imageNumber.equals("1")){
                    obq_image1.performClick();
                } else if (imageNumber.equals("2")) {
                    obq_image2.performClick();
                } else if (imageNumber.equals("3")) {
                    obq_image3.performClick();
                } else if (imageNumber.equals("4")) {
                    obq_image4.performClick();
                } else if (imageNumber.equals("5")) {
                    obq_image5.performClick();
                } else if (imageNumber.equals("6")) {
                    obq_image6.performClick();
                } else if (imageNumber.equals("7")) {
                    obq_image7.performClick();
                } else if (imageNumber.equals("8")) {
                    obq_image8.performClick();
                } else if (imageNumber.equals("9")) {
                    obq_image9.performClick();
                } else if (imageNumber.equals("10")) {
                    obq_image10.performClick();
                } else if (imageNumber.equals("11")) {
                    obq_image11.performClick();
                } else if (imageNumber.equals("12")) {
                    obq_image12.performClick();
                } else if (imageNumber.equals("13")) {
                    obq_image13.performClick(); // Toast.makeText(this, "kkkkkkk", Toast.LENGTH_SHORT).show();
                } else if (imageNumber.equals("14")) {
                    obq_image14.performClick();
                } else if (imageNumber.equals("15")) {
                    obq_image15.performClick();
                }

                // selecting font   - NOTE: setSelected method just selects but setChecked method makes it  focusable
                if(fontNumber.equals("1")){
                    rb1.setChecked(true);
                } else if (fontNumber.equals("2")) {
                    rb2.setChecked(true);
                } else if (fontNumber.equals("3")) {
                    rb3.setChecked(true);
                } else if (fontNumber.equals("4")) {
                    rb4.setChecked(true);
                } else if (fontNumber.equals("5")) {
                    rb5.setChecked(true);
                } else if (fontNumber.equals("6")) {
                    rb6.setChecked(true);
                } else if (fontNumber.equals("7")) {
                    rb7.setChecked(true);
                } else if (fontNumber.equals("8")) {
                    rb8.setChecked(true);
                } else if (fontNumber.equals("9")) {
                    rb9.setChecked(true);
                } else if (fontNumber.equals("10")) {
                    rb10.setChecked(true);
                } else if (fontNumber.equals("11")) {
                    rb11.setChecked(true);
                } else if (fontNumber.equals("12")) {
                    rb12.setChecked(true);
                } else if (fontNumber.equals("13")) {
                    rb13.setChecked(true);
                } else if (fontNumber.equals("14")) {
                    rb14.setChecked(true);
                } else if (fontNumber.equals("15")) {
                    rb15.setChecked(true);
                } else if (fontNumber.equals("16")) {
                    rb16.setChecked(true);
                } else if (fontNumber.equals("17")) {
                    rb17.setChecked(true);
                } else if (fontNumber.equals("18")) {
                    rb18.setChecked(true);
                } else if (fontNumber.equals("19")) {
                    rb19.setChecked(true);
                } else if (fontNumber.equals("20")) {
                    rb19.setChecked(true);
                } else if (fontNumber.equals("21")) {
                    rb19.setChecked(true);
                }

            }
        }, 250);


        obq_image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obq_lottie1.setVisibility(View.VISIBLE);
                obq_lottie1.playAnimation();

                obq_lottie2.setVisibility(View.INVISIBLE);
                obq_lottie3.setVisibility(View.INVISIBLE);
                obq_lottie4.setVisibility(View.INVISIBLE);
                obq_lottie5.setVisibility(View.INVISIBLE);
                obq_lottie6.setVisibility(View.INVISIBLE);
                obq_lottie7.setVisibility(View.INVISIBLE);
                obq_lottie8.setVisibility(View.INVISIBLE);
                obq_lottie9.setVisibility(View.INVISIBLE);
                obq_lottie10.setVisibility(View.INVISIBLE);
                obq_lottie11.setVisibility(View.INVISIBLE);
                obq_lottie12.setVisibility(View.INVISIBLE);
                obq_lottie13.setVisibility(View.INVISIBLE);
                obq_lottie14.setVisibility(View.INVISIBLE);
                obq_lottie15.setVisibility(View.INVISIBLE);

                imageNameNo = "1";
                flag++;
            }
        });

        obq_image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obq_lottie2.setVisibility(View.VISIBLE);
                obq_lottie2.playAnimation();

                obq_lottie1.setVisibility(View.INVISIBLE);
                obq_lottie3.setVisibility(View.INVISIBLE);
                obq_lottie4.setVisibility(View.INVISIBLE);
                obq_lottie5.setVisibility(View.INVISIBLE);
                obq_lottie6.setVisibility(View.INVISIBLE);
                obq_lottie7.setVisibility(View.INVISIBLE);
                obq_lottie8.setVisibility(View.INVISIBLE);
                obq_lottie9.setVisibility(View.INVISIBLE);
                obq_lottie10.setVisibility(View.INVISIBLE);
                obq_lottie11.setVisibility(View.INVISIBLE);
                obq_lottie12.setVisibility(View.INVISIBLE);
                obq_lottie13.setVisibility(View.INVISIBLE);
                obq_lottie14.setVisibility(View.INVISIBLE);
                obq_lottie15.setVisibility(View.INVISIBLE);

                imageNameNo = "2";
                flag++;
            }
        });

        obq_image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obq_lottie3.setVisibility(View.VISIBLE);
                obq_lottie3.playAnimation();

                obq_lottie2.setVisibility(View.INVISIBLE);
                obq_lottie1.setVisibility(View.INVISIBLE);
                obq_lottie4.setVisibility(View.INVISIBLE);
                obq_lottie5.setVisibility(View.INVISIBLE);
                obq_lottie6.setVisibility(View.INVISIBLE);
                obq_lottie7.setVisibility(View.INVISIBLE);
                obq_lottie8.setVisibility(View.INVISIBLE);
                obq_lottie9.setVisibility(View.INVISIBLE);
                obq_lottie10.setVisibility(View.INVISIBLE);
                obq_lottie11.setVisibility(View.INVISIBLE);
                obq_lottie12.setVisibility(View.INVISIBLE);
                obq_lottie13.setVisibility(View.INVISIBLE);
                obq_lottie14.setVisibility(View.INVISIBLE);
                obq_lottie15.setVisibility(View.INVISIBLE);

                imageNameNo = "3";
                flag++;
            }
        });

        obq_image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obq_lottie4.setVisibility(View.VISIBLE);
                obq_lottie4.playAnimation();

                obq_lottie2.setVisibility(View.INVISIBLE);
                obq_lottie3.setVisibility(View.INVISIBLE);
                obq_lottie1.setVisibility(View.INVISIBLE);
                obq_lottie5.setVisibility(View.INVISIBLE);
                obq_lottie6.setVisibility(View.INVISIBLE);
                obq_lottie7.setVisibility(View.INVISIBLE);
                obq_lottie8.setVisibility(View.INVISIBLE);
                obq_lottie9.setVisibility(View.INVISIBLE);
                obq_lottie10.setVisibility(View.INVISIBLE);
                obq_lottie11.setVisibility(View.INVISIBLE);
                obq_lottie12.setVisibility(View.INVISIBLE);
                obq_lottie13.setVisibility(View.INVISIBLE);
                obq_lottie14.setVisibility(View.INVISIBLE);
                obq_lottie15.setVisibility(View.INVISIBLE);

                imageNameNo = "4";
                flag++;
            }
        });

        obq_image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obq_lottie5.setVisibility(View.VISIBLE);
                obq_lottie5.playAnimation();

                obq_lottie2.setVisibility(View.INVISIBLE);
                obq_lottie3.setVisibility(View.INVISIBLE);
                obq_lottie4.setVisibility(View.INVISIBLE);
                obq_lottie1.setVisibility(View.INVISIBLE);
                obq_lottie6.setVisibility(View.INVISIBLE);
                obq_lottie7.setVisibility(View.INVISIBLE);
                obq_lottie8.setVisibility(View.INVISIBLE);
                obq_lottie9.setVisibility(View.INVISIBLE);
                obq_lottie10.setVisibility(View.INVISIBLE);
                obq_lottie11.setVisibility(View.INVISIBLE);
                obq_lottie12.setVisibility(View.INVISIBLE);
                obq_lottie13.setVisibility(View.INVISIBLE);
                obq_lottie14.setVisibility(View.INVISIBLE);
                obq_lottie15.setVisibility(View.INVISIBLE);

                imageNameNo = "5";
                flag++;
            }
        });

        obq_image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obq_lottie6.setVisibility(View.VISIBLE);
                obq_lottie6.playAnimation();

                obq_lottie2.setVisibility(View.INVISIBLE);
                obq_lottie3.setVisibility(View.INVISIBLE);
                obq_lottie4.setVisibility(View.INVISIBLE);
                obq_lottie5.setVisibility(View.INVISIBLE);
                obq_lottie1.setVisibility(View.INVISIBLE);
                obq_lottie7.setVisibility(View.INVISIBLE);
                obq_lottie8.setVisibility(View.INVISIBLE);
                obq_lottie9.setVisibility(View.INVISIBLE);
                obq_lottie10.setVisibility(View.INVISIBLE);
                obq_lottie11.setVisibility(View.INVISIBLE);
                obq_lottie12.setVisibility(View.INVISIBLE);
                obq_lottie13.setVisibility(View.INVISIBLE);
                obq_lottie14.setVisibility(View.INVISIBLE);
                obq_lottie15.setVisibility(View.INVISIBLE);

                imageNameNo = "6";
                flag++;
            }
        });

        obq_image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obq_lottie7.setVisibility(View.VISIBLE);
                obq_lottie7.playAnimation();

                obq_lottie2.setVisibility(View.INVISIBLE);
                obq_lottie3.setVisibility(View.INVISIBLE);
                obq_lottie4.setVisibility(View.INVISIBLE);
                obq_lottie5.setVisibility(View.INVISIBLE);
                obq_lottie1.setVisibility(View.INVISIBLE);
                obq_lottie9.setVisibility(View.INVISIBLE);
                obq_lottie8.setVisibility(View.INVISIBLE);
                obq_lottie6.setVisibility(View.INVISIBLE);
                obq_lottie10.setVisibility(View.INVISIBLE);
                obq_lottie11.setVisibility(View.INVISIBLE);
                obq_lottie12.setVisibility(View.INVISIBLE);
                obq_lottie13.setVisibility(View.INVISIBLE);
                obq_lottie14.setVisibility(View.INVISIBLE);
                obq_lottie15.setVisibility(View.INVISIBLE);

                imageNameNo = "7";
                flag++;
            }
        });

        obq_image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obq_lottie8.setVisibility(View.VISIBLE);
                obq_lottie8.playAnimation();

                obq_lottie2.setVisibility(View.INVISIBLE);
                obq_lottie3.setVisibility(View.INVISIBLE);
                obq_lottie4.setVisibility(View.INVISIBLE);
                obq_lottie5.setVisibility(View.INVISIBLE);
                obq_lottie1.setVisibility(View.INVISIBLE);
                obq_lottie7.setVisibility(View.INVISIBLE);
                obq_lottie6.setVisibility(View.INVISIBLE);
                obq_lottie9.setVisibility(View.INVISIBLE);
                obq_lottie10.setVisibility(View.INVISIBLE);
                obq_lottie11.setVisibility(View.INVISIBLE);
                obq_lottie12.setVisibility(View.INVISIBLE);
                obq_lottie13.setVisibility(View.INVISIBLE);
                obq_lottie14.setVisibility(View.INVISIBLE);
                obq_lottie15.setVisibility(View.INVISIBLE);

                imageNameNo = "8";
                flag++;
            }
        });

        obq_image9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obq_lottie9.setVisibility(View.VISIBLE);
                obq_lottie9.playAnimation();

                obq_lottie2.setVisibility(View.INVISIBLE);
                obq_lottie3.setVisibility(View.INVISIBLE);
                obq_lottie4.setVisibility(View.INVISIBLE);
                obq_lottie5.setVisibility(View.INVISIBLE);
                obq_lottie1.setVisibility(View.INVISIBLE);
                obq_lottie6.setVisibility(View.INVISIBLE);
                obq_lottie7.setVisibility(View.INVISIBLE);
                obq_lottie8.setVisibility(View.INVISIBLE);
                obq_lottie10.setVisibility(View.INVISIBLE);
                obq_lottie11.setVisibility(View.INVISIBLE);
                obq_lottie12.setVisibility(View.INVISIBLE);
                obq_lottie13.setVisibility(View.INVISIBLE);
                obq_lottie14.setVisibility(View.INVISIBLE);
                obq_lottie15.setVisibility(View.INVISIBLE);

                imageNameNo = "9";
                flag++;
            }
        });

        obq_image10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obq_lottie10.setVisibility(View.VISIBLE);
                obq_lottie10.playAnimation();

                obq_lottie2.setVisibility(View.INVISIBLE);
                obq_lottie3.setVisibility(View.INVISIBLE);
                obq_lottie4.setVisibility(View.INVISIBLE);
                obq_lottie5.setVisibility(View.INVISIBLE);
                obq_lottie1.setVisibility(View.INVISIBLE);
                obq_lottie6.setVisibility(View.INVISIBLE);
                obq_lottie7.setVisibility(View.INVISIBLE);
                obq_lottie8.setVisibility(View.INVISIBLE);
                obq_lottie9.setVisibility(View.INVISIBLE);
                obq_lottie11.setVisibility(View.INVISIBLE);
                obq_lottie12.setVisibility(View.INVISIBLE);
                obq_lottie13.setVisibility(View.INVISIBLE);
                obq_lottie14.setVisibility(View.INVISIBLE);
                obq_lottie15.setVisibility(View.INVISIBLE);

                imageNameNo = "10";
                flag++;
            }
        });

        obq_image11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obq_lottie11.setVisibility(View.VISIBLE);
                obq_lottie11.playAnimation();

                obq_lottie2.setVisibility(View.INVISIBLE);
                obq_lottie3.setVisibility(View.INVISIBLE);
                obq_lottie4.setVisibility(View.INVISIBLE);
                obq_lottie5.setVisibility(View.INVISIBLE);
                obq_lottie1.setVisibility(View.INVISIBLE);
                obq_lottie6.setVisibility(View.INVISIBLE);
                obq_lottie7.setVisibility(View.INVISIBLE);
                obq_lottie8.setVisibility(View.INVISIBLE);
                obq_lottie9.setVisibility(View.INVISIBLE);
                obq_lottie10.setVisibility(View.INVISIBLE);
                obq_lottie12.setVisibility(View.INVISIBLE);
                obq_lottie13.setVisibility(View.INVISIBLE);
                obq_lottie14.setVisibility(View.INVISIBLE);
                obq_lottie15.setVisibility(View.INVISIBLE);

                imageNameNo = "11";
                flag++;
            }
        });

        obq_image12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obq_lottie12.setVisibility(View.VISIBLE);
                obq_lottie12.playAnimation();

                obq_lottie2.setVisibility(View.INVISIBLE);
                obq_lottie3.setVisibility(View.INVISIBLE);
                obq_lottie4.setVisibility(View.INVISIBLE);
                obq_lottie5.setVisibility(View.INVISIBLE);
                obq_lottie1.setVisibility(View.INVISIBLE);
                obq_lottie6.setVisibility(View.INVISIBLE);
                obq_lottie7.setVisibility(View.INVISIBLE);
                obq_lottie8.setVisibility(View.INVISIBLE);
                obq_lottie9.setVisibility(View.INVISIBLE);
                obq_lottie10.setVisibility(View.INVISIBLE);
                obq_lottie11.setVisibility(View.INVISIBLE);
                obq_lottie13.setVisibility(View.INVISIBLE);
                obq_lottie14.setVisibility(View.INVISIBLE);
                obq_lottie15.setVisibility(View.INVISIBLE);

                imageNameNo = "12";
                flag++;
            }
        });

        obq_image13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(SettingActivity.this, "jjjjjjjjjj", Toast.LENGTH_SHORT).show();
                obq_lottie13.setVisibility(View.VISIBLE);
                obq_lottie13.playAnimation();

                obq_lottie2.setVisibility(View.INVISIBLE);
                obq_lottie3.setVisibility(View.INVISIBLE);
                obq_lottie4.setVisibility(View.INVISIBLE);
                obq_lottie5.setVisibility(View.INVISIBLE);
                obq_lottie1.setVisibility(View.INVISIBLE);
                obq_lottie6.setVisibility(View.INVISIBLE);
                obq_lottie7.setVisibility(View.INVISIBLE);
                obq_lottie8.setVisibility(View.INVISIBLE);
                obq_lottie9.setVisibility(View.INVISIBLE);
                obq_lottie10.setVisibility(View.INVISIBLE);
                obq_lottie11.setVisibility(View.INVISIBLE);
                obq_lottie12.setVisibility(View.INVISIBLE);
                obq_lottie14.setVisibility(View.INVISIBLE);
                obq_lottie15.setVisibility(View.INVISIBLE);

                imageNameNo = "13";
                flag++;
            }
        });

        obq_image14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obq_lottie14.setVisibility(View.VISIBLE);
                obq_lottie14.playAnimation();

                obq_lottie2.setVisibility(View.INVISIBLE);
                obq_lottie3.setVisibility(View.INVISIBLE);
                obq_lottie4.setVisibility(View.INVISIBLE);
                obq_lottie5.setVisibility(View.INVISIBLE);
                obq_lottie1.setVisibility(View.INVISIBLE);
                obq_lottie6.setVisibility(View.INVISIBLE);
                obq_lottie7.setVisibility(View.INVISIBLE);
                obq_lottie8.setVisibility(View.INVISIBLE);
                obq_lottie9.setVisibility(View.INVISIBLE);
                obq_lottie10.setVisibility(View.INVISIBLE);
                obq_lottie11.setVisibility(View.INVISIBLE);
                obq_lottie12.setVisibility(View.INVISIBLE);
                obq_lottie13.setVisibility(View.INVISIBLE);
                obq_lottie15.setVisibility(View.INVISIBLE);

                imageNameNo = "14";
                flag++;
            }
        });

        obq_image15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obq_lottie15.setVisibility(View.VISIBLE);
                obq_lottie15.playAnimation();

                obq_lottie2.setVisibility(View.INVISIBLE);
                obq_lottie3.setVisibility(View.INVISIBLE);
                obq_lottie4.setVisibility(View.INVISIBLE);
                obq_lottie5.setVisibility(View.INVISIBLE);
                obq_lottie1.setVisibility(View.INVISIBLE);
                obq_lottie6.setVisibility(View.INVISIBLE);
                obq_lottie7.setVisibility(View.INVISIBLE);
                obq_lottie8.setVisibility(View.INVISIBLE);
                obq_lottie9.setVisibility(View.INVISIBLE);
                obq_lottie10.setVisibility(View.INVISIBLE);
                obq_lottie11.setVisibility(View.INVISIBLE);
                obq_lottie12.setVisibility(View.INVISIBLE);
                obq_lottie13.setVisibility(View.INVISIBLE);
                obq_lottie14.setVisibility(View.INVISIBLE);

                imageNameNo = "15";
                flag++;
            }
        });



        saveSettingsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlertDialog.Builder builder = new AlertDialog.Builder(SettingActivity.this);
                builder.setTitle("Save Changes?");
                builder.setMessage("Are you sure to save any changes if made?");
                builder.setIcon(R.drawable.save);
                builder.setCancelable(false);
                builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        DatabaseHelper databaseHelper = new DatabaseHelper(SettingActivity.this);
                        databaseHelper.styleInfoUpdate(fontNameNo,imageNameNo);
                        SettingActivity.super.onBackPressed();
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Handle Cancel button click
                        dialog.dismiss();
                    }
                });
                builder.setNegativeButton("Don't Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        overridePendingTransition(R.anim.right_to_left, R.anim.left_to_right);
                        SettingActivity.super.onBackPressed();

                        dialog.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });


    }

    @Override
    public void onBackPressed() {

        if (flag >= 3) {
//            Toast.makeText(this, String.valueOf(flag), Toast.LENGTH_SHORT).show();
            AlertDialog.Builder builder = new AlertDialog.Builder(SettingActivity.this);
            builder.setTitle("Save Changes?");
            builder.setMessage("Are you sure to save any changes if made?");
            builder.setIcon(R.drawable.save);
            builder.setCancelable(false);
            builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    DatabaseHelper databaseHelper = new DatabaseHelper(SettingActivity.this);
                    databaseHelper.styleInfoUpdate(fontNameNo, imageNameNo);

                    overridePendingTransition(R.anim.right_to_left, R.anim.left_to_right);
                    SettingActivity.super.onBackPressed();
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    // Handle Cancel button click
                    dialog.dismiss();
                }
            });
            builder.setNegativeButton("Don't Save", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    SettingActivity.super.onBackPressed();

                    dialog.dismiss();
                }
            });

            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else{
            overridePendingTransition(R.anim.right_to_left, R.anim.left_to_right);
            super.onBackPressed();
        }
    }
}