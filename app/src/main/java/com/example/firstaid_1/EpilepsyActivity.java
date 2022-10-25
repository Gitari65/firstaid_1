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

public class EpilepsyActivity extends AppCompatActivity {
Button button6;
TextView textView4;
private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epilepsy);


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


        textView4=findViewById(R.id.text_epilepsy);
        textView4.setText("Keep The Person SAFE.\n\n" +
                "-Move or guide away from harmful or sharp objects.\n" +
                "-If a person is wandering or confused, help steer them clear of dangerous situations. For example, gently guide them away from traffic, train or subway platforms, heights, or sharp objects.\n"
                );

        button6=findViewById(R.id.button_backhome_epilepsy);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        });}}