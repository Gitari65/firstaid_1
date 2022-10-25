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

public class AsthmaActivity extends AppCompatActivity {
    private AdView mAdView;
    Button button6;
    TextView textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asthma);




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


        textView4=findViewById(R.id.text_asthma);
        textView4.setText("\n" +
                "Steps to carryout during an Asthma Attack\n" +
                "\n" +
                "Step 1: Sit the person upright\n" +
                "Be calm and reassuring.\n" +
                "Do not leave them alone.\n" +
                "Step 2: Give 4 separate puffs of blue/grey reliever puffer\n" +
                "Shake the puffer.\n" +
                "Put 1 puff into the spacer.\n" +
                "Take 4 breaths from the spacer. Repeat until 4 puffs have been taken. (If you don’t have a spacer, simply inhale 4 puffs directly by mouth).\n" +
                "Remember: Shake, 1 puff, 4 breaths OR give 2 separate doses of a Bricanyl inhaler (age 6 and over) or a Symbicort inhaler (over 12).\n" +
                "\n" +
                "Step 3: Wait 4 minutes\n" +
                "Wait 4 minutes. If there is no improvement, give 4 more separate puffs of blue/grey reliever, as with Step 2 OR give 1 more dose of Bricanyl or Symbicort inhaler.\n" +
                "\n" +
                "Step 4: If there is still no improvement dial triple zero (000) for an ambulance\n" +
                "Keep giving the person 4 separate puffs every 4 minutes until emergency assistance arrives.\n");

        button6=findViewById(R.id.button_backhome_asthma);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        });}}