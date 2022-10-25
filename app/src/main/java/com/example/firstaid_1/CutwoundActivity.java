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

public class CutwoundActivity extends AppCompatActivity {
    private AdView mAdView;
    Button button6;
    TextView textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cutwound);


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


        textView4=findViewById(R.id.text_cutwound);
        textView4.setText("FIRSTAID STEPS\n" +
                "\n" +
                "1)Wash your hands. This helps avoid infection.\n" +
                "2)Stop the bleeding. Minor cuts and scrapes usually stop bleeding on their own. If needed, apply gentle pressure with a clean bandage or cloth and elevate the wound until bleeding stops.\n" +
                "3)Clean the wound. Rinse the wound with water. Keeping the wound under running tap water will reduce the risk of infection. Wash around the wound with soap. But don't get soap in the wound. And don't use hydrogen peroxide or iodine, which can be irritating. Remove any dirt or debris with a tweezers cleaned with alcohol. See a doctor if you can't remove all debris.\n" +
                "4)Apply an antibiotic or petroleum jelly. Apply a thin layer of an antibiotic ointment or petroleum jelly to keep the surface moist and help prevent scarring. Certain ingredients in some ointments can cause a mild rash in some people. If a rash appears, stop using the ointment.\n" +
                "5)Cover the wound. Apply a bandage, rolled gauze or gauze held in place with paper tape. Covering the wound keeps it clean. If the injury is just a minor scrape or scratch, leave it uncovered.\n" +
                "6)Change the dressing. Do this at least once a day or whenever the bandage becomes wet or dirty.\n" +
                "7)Get a tetanus shot. Get a tetanus shot if you haven't had one in the past five years and the wound is deep or dirty.\n" +
                "*Watch for signs of infection. See a doctor if you see signs of infection on the skin or near the wound, such as redness, increasing pain, drainage, warmth or swelling.");

        button6=findViewById(R.id.button_backhome_cutwound);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        });}}