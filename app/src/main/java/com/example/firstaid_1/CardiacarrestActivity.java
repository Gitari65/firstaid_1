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

public class CardiacarrestActivity extends AppCompatActivity {

    private AdView mAdView;
    Button button6;
    TextView textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardiacarrest);


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


        textView4=findViewById(R.id.text_cardiacarrest);
        textView4.setText("CARDIAC ARREST FIRSTAID STEPS:\n" +
                "\n" +
                "1)Ensure scene safety.\n" +
                "2)Check for response.\n" +
                "3)Shout for help. Tell someone nearby to call 911 or your emergency response number. Ask that person or another bystander to bring you an AED (automated external defibrillator), if there’s one on hand. Tell them to hurry – time is critical. If you’re alone with an adult who has signs of cardiac arrest, call 911 and get an AED (if one is available).\n" +
                "4)Check for no breathing or only gasping. If the person isn’t breathing or is only gasping, begin CPR with compressions.\n" +
                "5)Begin high quality CPR. Push down at least two inches in the center of the chest at a rate of 100 to 120 pushes a minute. Allow the chest to come back up to its normal position after each push.\n" +
                "Use an AED. As soon as it arrives, turn it on and follow the prompts.\n" +
                "6)Continue CPR. Administer it until the person starts to breathe or move, or until someone with more advanced training, such as an EMS team member, takes over.");

        button6=findViewById(R.id.button_backhome_cardiacarrest);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        });}}