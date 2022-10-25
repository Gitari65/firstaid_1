package com.example.firstaid_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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

public class AccidentActivity extends AppCompatActivity {

    Button button6;
    TextView textView4,adView;
    private AdView mAdView;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accident);

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


        textView4=findViewById(R.id.text_accident);
        textView4.setText("FirstAid steps during a road/vehicle accident\n" +"\n"+
                "1)Make sure that you have alerted oncoming traffic that an accident has taken place. This is so that you ensure your own safety first before helping the victim. This prevents further casualties.\n" +
                "2)Your next step would be to turn off the vehicle ignition as there might be spilled fuel or other fire hazards. If this is not the case then make sure to turn on the hazard lights.\n" +
                "3)Shift the victim to a safer area by the road, away from oncoming traffic, glass pieces, and leaking fluids from the vehicle or any other harmful material close by.\n" +
                "4)Contact or have a bystander call the nearest hospital or police station. If the victim is unconscious or is experiencing difficulty in breathing, then your immediate action should be to send the victim to the nearest hospital. Here are a few contact numbers you can use during such emergencies. \n" +
                "call 911\n" +
                "5)Make sure that the victim’s head, neck and back are treated with great care and are not jerked around.\n" +
                "6)Place wooden blocks on either side of the neck. If this is not possible, make sure that nobody moves the victim by shaking them to stay awake.\n" +
                "**Do not try to remove the helmet of a biker victim until he or she has reached the hospital unless the victim is unconscious and not breathing. In these circumstances, mouth-to-mouth resuscitation techniques will benefit the victim.\n" +
                "\n");

        button6=findViewById(R.id.button_backhome_accident);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        });}}