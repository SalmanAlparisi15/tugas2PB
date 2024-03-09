package com.example.tugasday03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView Jdm = findViewById(R.id.imgJdm);
        ImageView Usdm = findViewById(R.id.imgUsdm);
        ImageView Edm = findViewById(R.id.imgEdm);

        Jdm.setOnClickListener(this);
        Usdm.setOnClickListener(this);
        Edm.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imgJdm) {
            Intent Jdm = new Intent(MainActivity.this, JdmLayout.class);
            startActivity(Jdm);
        }
        if (v.getId() == R.id.imgUsdm) {
            Intent Usdm = new Intent(MainActivity.this, UsdmLayout.class);
            startActivity(Usdm);
        }
        if (v.getId() == R.id.imgEdm) {
            Intent Edm = new Intent(MainActivity.this, EdmLayout.class);
            startActivity(Edm);
        }
    }
}