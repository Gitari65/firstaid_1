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

public class SnakebiteActivity extends AppCompatActivity {
    TextView textView1;
    private AdView mAdView;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snakebite);


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



        textView1=findViewById(R.id.text_snakebite);
        textView1.setText("STEPS TO TAKE AFTER A SNAKE BITE\n" +
                "1)Seek medical attention as soon as possible (dial 911 or call local Emergency Medical Services [EMS]).\n" +
                "2)Antivenom is the treatment for serious snake envenomation. The sooner antivenom can be started, the sooner irreversible damage from venom can be stopped.\n" +
                "3)Driving oneself to the hospital is not advised because people with snakebites can become dizzy or pass out.\n" +
                "4)Take a photograph of the snake from a safe distance if possible. 5)Identifying the snake can help with treatment of the snakebite.\n" +
                "Keep calm.\n" +
                "6)Inform your supervisor.\n" +
                "7)Apply first aid while waiting for EMS staff to get you to the hospital.\n" +
                "8)Lay or sit down with the bite in a neutral position of comfort.\n" +
                "9)Remove rings and watches before swelling starts.\n" +
                "10)Wash the bite with soap and water.\n" +
                "11)Cover the bite with a clean, dry dressing.\n" +
                "12)Mark the leading edge of tenderness/swelling on the skin and write the time alongside it.\n" +
                "\n" +
                "!!! Do NOT do any of the following:\n" +
                "\n" +
                "Do not pick up the snake or try to trap it. NEVER handle a venomous snake, not even a dead one or its decapitated head.\n" +
                "Do not wait for symptoms to appear if bitten, get medical help right away.\n" +
                "Do not apply a tourniquet.\n" +
                "Do not slash the wound with a knife or cut it in any way.\n" +
                "Do not try to suck out the venom.\n" +
                "Do not apply ice or immerse the wound in water.\n" +
                "Do not drink alcohol as a painkiller.\n" +
                "Do not take pain relievers (such as aspirin, ibuprofen, naproxen).\n" +
                "Do not apply electric shock or folk therapies.");

        button3=findViewById(R.id.button_backhomes);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        });}}