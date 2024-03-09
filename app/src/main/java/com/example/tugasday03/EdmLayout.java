package com.example.tugasday03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EdmLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_edm_layout);
        CardView cardAudi = findViewById(R.id.cardAudi);
        TextView tvaudiJudul = findViewById(R.id.tvaudiJudul);
        TextView tvaudiDeskripsi = findViewById(R.id.tvaudiDeskripsi);
        TextView tvaudiSpeed = findViewById(R.id.tvaudiSpeed);


        cardAudi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DetailProduk detail = new DetailProduk();
                Intent intent;
                if (v.getId() == R.id.cardAudi) {
                    detail.setNama((String) tvaudiJudul.getText());
                    detail.setDeskripsi((String) tvaudiDeskripsi.getText());
                    detail.setTopSpeed((String) tvaudiSpeed.getText());
                    detail.setGambar("audi");
                    intent = new Intent(EdmLayout.this, DetailActivity.class);
                    intent.putExtra(DetailActivity.KEY_DATA, detail);
                    startActivity(intent);
                }

            }
        });
        CardView cardBmw = findViewById(R.id.cardBmw);
        TextView tvbmwJudul = findViewById(R.id.tvbmwJudul);
        TextView tvbmwDeskripsi = findViewById(R.id.tvbmwDeskripsi);
        TextView tvbmwSpeed = findViewById(R.id.tvbmwSpeed);
        cardBmw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DetailProduk detail = new DetailProduk();
                Intent intent;
                if (v.getId() == R.id.cardBmw) {
                    detail.setNama((String) tvbmwJudul.getText());
                    detail.setDeskripsi((String) tvbmwDeskripsi.getText());
                    detail.setTopSpeed((String) tvbmwSpeed.getText());
                    detail.setGambar("bmw");
                    intent = new Intent(EdmLayout.this, DetailActivity.class);
                    intent.putExtra(DetailActivity.KEY_DATA, detail);
                    startActivity(intent);
                }

            }
        });
        CardView cardMercedes = findViewById(R.id.cardMercedes);
        TextView tvmercedesJudul = findViewById(R.id.tvmercedesJudul);
        TextView tvmercedesDeskripsi = findViewById(R.id.tvmercedesDeskripsi);
        TextView tvmercedesSpeed = findViewById(R.id.tvmercedesSpeed);
        cardMercedes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DetailProduk detail = new DetailProduk();
                Intent intent;
                if (v.getId() == R.id.cardMercedes) {
                    detail.setNama((String) tvmercedesJudul.getText());
                    detail.setDeskripsi((String) tvmercedesDeskripsi.getText());
                    detail.setTopSpeed((String) tvmercedesSpeed.getText());
                    detail.setGambar("mercedes");
                    intent = new Intent(EdmLayout.this, DetailActivity.class);
                    intent.putExtra(DetailActivity.KEY_DATA, detail);
                    startActivity(intent);
                }

            }
        });
        CardView cardRenault = findViewById(R.id.cardRenault);
        TextView tvrenaultJudul = findViewById(R.id.tvrenaultJudul);
        TextView tvrenaultDeskripsi = findViewById(R.id.tvrenaultDeskripsi);
        TextView tvrenaultSpeed = findViewById(R.id.tvrenaultSpeed);
        cardRenault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DetailProduk detail = new DetailProduk();
                Intent intent;
                if (v.getId() == R.id.cardRenault) {
                    detail.setNama((String) tvrenaultJudul.getText());
                    detail.setDeskripsi((String) tvrenaultDeskripsi.getText());
                    detail.setTopSpeed((String) tvrenaultSpeed.getText());
                    detail.setGambar("renault");
                    intent = new Intent(EdmLayout.this, DetailActivity.class);
                    intent.putExtra(DetailActivity.KEY_DATA, detail);
                    startActivity(intent);
                }
            }
        });
        CardView cardPeugeot = findViewById(R.id.cardPeugeot);
        TextView tvpeugeotJudul = findViewById(R.id.tvpeugeotJudul);
        TextView tvpeugeotDeskripsi = findViewById(R.id.tvpeugeotDeskripsi);
        TextView tvpeugeotSpeed = findViewById(R.id.tvpeugeotSpeed);
        cardPeugeot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DetailProduk detail = new DetailProduk();
                Intent intent;
                if (v.getId() == R.id.cardPeugeot) {
                    detail.setNama((String) tvpeugeotJudul.getText());
                    detail.setDeskripsi((String) tvpeugeotDeskripsi.getText());
                    detail.setTopSpeed((String) tvpeugeotSpeed.getText());
                    detail.setGambar("peugeot");
                    intent = new Intent(EdmLayout.this, DetailActivity.class);
                    intent.putExtra(DetailActivity.KEY_DATA, detail);
                    startActivity(intent);
                }

            }
        });
    }
}