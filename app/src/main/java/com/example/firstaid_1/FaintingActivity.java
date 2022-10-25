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

public class FaintingActivity extends AppCompatActivity {
TextView textView2;
Button button2;
private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fainting);

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


        setContentView(R.layout.activity_fainting);
        textView2=findViewById(R.id.text_fainting);
        textView2.setText("STEPS\n" +
                "1)Check for other injuries. They may have hurt themselves falling down, so look for head injuries and any other wounds. Treat as appropriate.\n" +
                "\n" +
                "2)Kneel down next to them and raise their legs, supporting their ankles on your shoulders to help blood flow back to the brain.\n" +
                "\n" +
                "3)Make sure that they have plenty of fresh air. Ask other people to move away and if you’re inside then ask someone to open a window.\n" +
                "\n" +
                "4)Reassure the casualty and help them to sit up slowly. \n" +
                "\n" +
                "5)If they begin to feel faint again, lie them down again.\n" +
                "6)If they stay unresponsive, open their airway, check their breathing and prepare to treat someone who is unresponsive.");


    button2=findViewById(R.id.button_backhome);
    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        }
    });

    }
}