package com.example.firstaid_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class BurnsActivity extends AppCompatActivity {
    Button button6;
    TextView textView4;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burns);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        AdView adView = new AdView(this);


        adView.setAdSize(AdSize.BANNER);

        adView.setAdUnitId("ca-app-pub-2066495785020114/6489749512");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        textView4=findViewById(R.id.text_burns);
        textView4.setText("\n" +
                "For All Burns\n" +
                "1. Stop Burning Immediately\n" +
                "\n" +
                "Put out fire or stop the person's contact with hot liquid, steam, or other material.\n" +
                "Help the person \"stop, drop, and roll\" to smother flames.\n" +
                "Remove smoldering material from the person.\n" +
                "Remove hot or burned clothing. If clothing sticks to skin, cut or tear around it.\n" +
                "2. Remove Constrictive Clothing Immediately\n" +
                "\n" +
                "Take off jewelry, belts, and tight clothing. Burns can swell quickly.\n" +
                "Then take the following steps:\n" +
                "\n" +
                "For First-Degree Burns (Affecting Top Layer of Skin)\n" +
                "1. Cool Burn\n" +
                "\n" +
                "Hold burned skin under cool (not cold) running water or immerse in cool water until the pain subsides.\n" +
                "Use compresses if running water isn't available.\n" +
                "\n" +
                "2. Protect Burn\n" +
                "\n" +
                "Cover with sterile, non-adhesive bandage or clean cloth.\n" +
                "Do not apply butter, oil, lotions, or creams (especially if they contain fragrance). Apply a petroleum-based ointment two to three times per day.\n" +
                "3. Treat Pain\n" +
                "\n" +
                "Give over-the-counter pain reliever such as acetaminophen (Panadol, Tylenol), ibuprofen (Advil, Motrin, Nuprin), or naproxen (Aleve, Naprosyn).\n" +
                "\n" +
                "Seek medical help if:\n" +
                "\n" +
                "You see signs of infection, like increased pain, redness, swelling, fever, or oozing.\n" +
                "The person needs tetanus or booster shot, depending on date of last injection. Tetanus booster should be given every 10 years.\n" +
                "The burn blister is larger than two inches or oozes.\n" +
                "Redness and pain last more than a few hours.\n" +
                "The pain gets worse.\n" +
                "The hands, feet, face, or genitals are burned.\n");
        button6=findViewById(R.id.button_backhome_burns);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        });}}