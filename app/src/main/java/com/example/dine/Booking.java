package com.example.dine;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class Booking extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    TextView value;
    int count = 0;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        value = (TextView) findViewById(R.id.value);

        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);

        String []option = {"12:00 P.M." , "1:00 P.M." , "2:00 P.M." ,  "3:00 P.M." ,  "4:00 P.M." ,  "5:00 P.M." , };
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.time_array, option);

        autoCompleteTextView.setAdapter(arrayAdapter);

    }

    public void increment (View v){
        count++;
        value.setText(""+count);
    }

    public void  decrement (View v){
        if (count <= 0) count = 0;
        else count--;
        value.setText(""+count);
    }
}
