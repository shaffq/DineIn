package com.example.dine;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private AdapterAllPlace.RecyclerViewClickListener listener;
    RecyclerView allPlace;
    AdapterAllPlace aAdapter;
    String place[]={"Pokok.kl","Jibby & Co", "JungleBird", "Vantador"};
    String location[]={"MAHSA Avenue","Empire", "Bukit Damansara", "Desa Sri Hartamas"};
    int image[]={(R.drawable.pokok), (R.drawable.jibby), (R.drawable.junglebird), (R.drawable.vantador)};

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setOnClickListener();
        allPlace = findViewById(R.id.all);
        allPlace.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        allPlace.setLayoutManager((layoutManager));

        ArrayList<DataPlace> dataPlaces = getData();

        aAdapter = new AdapterAllPlace(dataPlaces,this, listener);
        allPlace.setAdapter(aAdapter);

    }

    private void setOnClickListener() {
        listener = new AdapterAllPlace.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(),Booking.class);
                startActivity(intent);
            }
        };
    }

    private ArrayList<DataPlace> getData() {
        ArrayList<DataPlace> placeArrayList = new ArrayList<>();
        for ( int i = 0; i<place.length;i++){
            DataPlace dataPlace = new DataPlace();
            dataPlace.setPlaceName(place[i]);
            dataPlace.setLocation((location[i]));
            dataPlace.setImg(image[i]);
            placeArrayList.add(dataPlace);
        }
        return placeArrayList;
    }

}