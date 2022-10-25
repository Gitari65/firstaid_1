package com.example.firstaid_1;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;

public class ProfileeFragment extends Fragment {
    TextView textviewlogin,textviewexit,textviewcreate,textviewabout;
    Button button1,button2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_profile,container,false);

        button1= view.findViewById(R.id.button_findhelp);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getActivity(),"opening maps...",Toast.LENGTH_SHORT).show();

                Intent intent= new Intent(getActivity(),MapsActivity.class);
                startActivity(intent);
            }
        });

        textviewabout=view.findViewById(R.id.text_about);
        textviewabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getActivity(),AboutActivity.class);
                startActivity(intent);
            }
        });


        button2=view.findViewById(R.id.text_call);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:999"));
                startActivity(intent);
            }
        });

        return view;


    }


}
