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

public class NosebleedingActivity extends AppCompatActivity {
    private AdView mAdView;
    Button button6;
    TextView textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nosebleeding);


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


        textView4=findViewById(R.id.text_nosebleeding);
        textView4.setText("Steps to stop A Nose-bleed\n\n" +
                "1)Firmly pinch the entire soft part of the nose just above the nostrils.\n" +
                "2)Sit and lean forward (this will ensure that blood and other secretions do not go down your throat).\n" +
                "3)Breathe through your mouth.\n" +
                "4)Hold this position for 5 minutes. If bleeding continues, hold the position for an additional 10 minutes. If bleeding does not stop, go to the emergency department.\n" +
                "\n");

        button6=findViewById(R.id.button_backhome_nosebleeding);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        });}}