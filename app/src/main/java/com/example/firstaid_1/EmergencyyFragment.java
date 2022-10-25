package com.example.firstaid_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class EmergencyyFragment extends Fragment {
    TextView fainting_emergency,fracture_emergency,choking_emergency,nosebleeding_emergency,cutwound_emergency,roadaccident_emergency,burns_emergency,heartattack_emergency,snakebite_emergency,epilepsy_emergency,asthma_emergency;
    Button button1;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_emergency,container,false);
        fainting_emergency= view.findViewById(R.id.fainting_emergency);
        fainting_emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(),FaintingActivity.class);
                startActivity(intent);
            }
        });


        nosebleeding_emergency= view.findViewById(R.id.nosebleeding_emergency);
        nosebleeding_emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(),NosebleedingActivity.class);
                startActivity(intent);
            }
        });

        heartattack_emergency= view.findViewById(R.id.hearatattack_emergency);
        heartattack_emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(),CardiacarrestActivity.class);
                startActivity(intent);
            }
        });


        cutwound_emergency= view.findViewById(R.id.cutwound_emergency);
        cutwound_emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(),CutwoundActivity.class);
                startActivity(intent);
            }
        });
     asthma_emergency= view.findViewById(R.id.asthma_emergency);
        asthma_emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(),AsthmaActivity.class);
                startActivity(intent);
            }
        });
        burns_emergency= view.findViewById(R.id.burn_emergency);
        burns_emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(),BurnsActivity.class);
                startActivity(intent);
            }
        });

        roadaccident_emergency= view.findViewById(R.id.roadaccident_emergency);
        roadaccident_emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(),AccidentActivity.class);
                startActivity(intent);
            }
        });

        snakebite_emergency= view.findViewById(R.id.snakebite_emergency);
        snakebite_emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(),SnakebiteActivity.class);
                startActivity(intent);
            }
        });

        epilepsy_emergency= view.findViewById(R.id.epilepsy_emergency);
        epilepsy_emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(),EpilepsyActivity.class);
                startActivity(intent);
            }
        });
        choking_emergency= view.findViewById(R.id.choking_emergency);
        choking_emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(),ChokingActivity.class);
                startActivity(intent);
            }
        });

        fracture_emergency= view.findViewById(R.id.fracture_emergency);
        fracture_emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(),FractureActivity.class);
                startActivity(intent);
            }
        });


        return  view;

    }
}
