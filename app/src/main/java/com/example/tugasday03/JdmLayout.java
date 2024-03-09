package com.example.tugasday03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class JdmLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jdm_layout);


        CardView cardSkyline = findViewById(R.id.cardSkyline);
        TextView tvskylineJudul = findViewById(R.id.tvskylineJudul);
        TextView tvskylineDeskripsi = findViewById(R.id.tvskylineDeskripsi);
        TextView tvskylineSpeed = findViewById(R.id.tvskylineSpeed);


        cardSkyline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DetailProduk detail = new DetailProduk();
                Intent intent;
                if (v.getId() == R.id.cardSkyline) {
                    detail.setNama((String) tvskylineJudul.getText());
                    detail.setDeskripsi((String) tvskylineDeskripsi.getText());
                    detail.setTopSpeed((String) tvskylineSpeed.getText());
                    detail.setGambar("skyline");
                    intent = new Intent(JdmLayout.this, DetailActivity.class);
                    intent.putExtra(DetailActivity.KEY_DATA, detail);
                    startActivity(intent);
                }

            }
        });
        CardView cardRx7 = findViewById(R.id.cardRx7);
        TextView tvrx7Judul = findViewById(R.id.tvrx7Judul);
        TextView tvrx7Deskprisi = findViewById(R.id.tvrx7Deskripsi);
        TextView tvrx7Speed = findViewById(R.id.tvrx7Speed);
        cardRx7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DetailProduk detail = new DetailProduk();
                Intent intent;
                if (v.getId() == R.id.cardRx7) {
                    detail.setNama((String) tvrx7Judul.getText());
                    detail.setDeskripsi((String) tvrx7Deskprisi.getText());
                    detail.setTopSpeed((String) tvrx7Speed.getText());
                    detail.setGambar("rx7");
                    intent = new Intent(JdmLayout.this, DetailActivity.class);
                    intent.putExtra(DetailActivity.KEY_DATA, detail);
                    startActivity(intent);
                }
            }
        });
        CardView cardSupra = findViewById(R.id.cardSupra);
        TextView tvsupraJudul = findViewById(R.id.tvsupraJudul);
        TextView tvsupraDeskprisi = findViewById(R.id.tvsupraDeskripsi);
        TextView tvsupraSpeed = findViewById(R.id.tvsupraSpeed);
        cardSupra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DetailProduk detail = new DetailProduk();
                Intent intent;
                if (v.getId() == R.id.cardSupra) {
                    detail.setNama((String) tvsupraJudul.getText());
                    detail.setDeskripsi((String) tvsupraDeskprisi.getText());
                    detail.setTopSpeed((String) tvsupraSpeed.getText());
                    detail.setGambar("supramk4");
                    intent = new Intent(JdmLayout.this, DetailActivity.class);
                    intent.putExtra(DetailActivity.KEY_DATA, detail);
                    startActivity(intent);
                }
            }
        });
        CardView cardSubaru = findViewById(R.id.cardSubaru);
        TextView tvsubaruJudul = findViewById(R.id.tvsubaruJudul);
        TextView tvsubaruDeskprisi = findViewById(R.id.tvsubaruDeskripsi);
        TextView tvsubaruSpeed = findViewById(R.id.tvsubaruSpeed);
        cardSubaru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DetailProduk detail = new DetailProduk();
                Intent intent;
                if (v.getId() == R.id.cardSubaru) {
                    detail.setNama((String) tvsubaruJudul.getText());
                    detail.setDeskripsi((String) tvsubaruDeskprisi.getText());
                    detail.setTopSpeed((String) tvsubaruSpeed.getText());
                    detail.setGambar("subaru");
                    intent = new Intent(JdmLayout.this, DetailActivity.class);
                    intent.putExtra(DetailActivity.KEY_DATA, detail);
                    startActivity(intent);
                }
            }
        });

        CardView cardNsx = findViewById(R.id.cardNsx);
        TextView tvnsxJudul = findViewById(R.id.tvnsxJudul);
        TextView tvnsxDeskprisi = findViewById(R.id.tvnsxDeskripsi);
        TextView tvnsxSpeed = findViewById(R.id.tvnsxSpeed);
        cardNsx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DetailProduk detail = new DetailProduk();
                Intent intent;
                if (v.getId() == R.id.cardNsx) {
                    detail.setNama((String) tvnsxJudul.getText());
                    detail.setDeskripsi((String) tvnsxDeskprisi.getText());
                    detail.setTopSpeed((String) tvnsxSpeed.getText());
                    detail.setGambar("nsx");
                    intent = new Intent(JdmLayout.this, DetailActivity.class);
                    intent.putExtra(DetailActivity.KEY_DATA, detail);
                    startActivity(intent);
                }
            }
        });
    }
}