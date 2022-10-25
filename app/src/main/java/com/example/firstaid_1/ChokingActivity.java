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

public class ChokingActivity extends AppCompatActivity {
TextView textView1;
Button button2;
private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choking);


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


        textView1=findViewById(R.id.text_choking);
textView1.setText("STEPS\n" +"1)Stand behind the person who's choking.\n" +
        "2)Place your arms around their waist and bend them forward.\n" +
        "3)Clench 1 fist and place it right above their belly button.\n" +
        "4)Put the other hand on top of your fist and pull sharply inwards and upwards.\n" +
        "5)Repeat this movement up to 5 times.\n" +
        "6)If the person's airway is still blocked after trying back blows and abdominal thrusts, get help immediately:\n");

        button2=findViewById(R.id.button_backhome);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

    }
});}}