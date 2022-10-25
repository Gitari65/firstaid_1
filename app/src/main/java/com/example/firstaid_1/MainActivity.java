package com.example.firstaid_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        if (savedInstanceState == null) {
            bottomNavigationView.setSelectedItemId(R.id.emergency); // change to whichever id should be default
        }

    }
    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener=
            item -> {
                Fragment selectedFragmwnt=null;
                switch (item.getItemId()){
                    case R.id.emergency:
                        selectedFragmwnt= new EmergencyyFragment();
                        break;
                    case R.id.kit:
                        selectedFragmwnt= new KittFragment();
                        break;
                    case R.id.profile:
                        selectedFragmwnt= new ProfileeFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_view_tag,selectedFragmwnt).commit();
                return true;
            };
}