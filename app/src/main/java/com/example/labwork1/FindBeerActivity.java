package com.example.labwork1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FindBeerActivity extends AppCompatActivity {

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickFindBeer(v);
            }
        });
    }

    @SuppressLint("SetTextI18n")
    public void onClickFindBeer(View view) {
        TextView brandsField = findViewById(R.id.textView);

        Spinner color = findViewById(R.id.spinner);
        String beerColor = String.valueOf(color.getSelectedItem());
        String brandsText = expert.getBrands(beerColor);

        brandsField.setText(brandsText);
    }
}