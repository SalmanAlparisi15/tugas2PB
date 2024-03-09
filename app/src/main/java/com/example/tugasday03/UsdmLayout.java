package com.example.tugasday03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class UsdmLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usdm_layout);


        CardView cardMustang = findViewById(R.id.cardMustang);
        TextView tvmustangJudul = findViewById(R.id.tvmustangJudul);
        TextView tvMustangDeskripsi = findViewById(R.id.tvmustangDeskripsi);
        TextView tvMustangSpeed = findViewById(R.id.tvmustangSpeed);


        cardMustang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DetailProduk detail = new DetailProduk();
                Intent intent;
                if (v.getId() == R.id.cardMustang) {
                    detail.setNama((String) tvmustangJudul.getText());
                    detail.setDeskripsi((String) tvMustangDeskripsi.getText());
                    detail.setTopSpeed((String) tvMustangSpeed.getText());
                    detail.setGambar("mustang");
                    intent = new Intent(UsdmLayout.this, DetailActivity.class);
                    intent.putExtra(DetailActivity.KEY_DATA, detail);
                    startActivity(intent);
                }

            }
        });
        CardView cardTesla = findViewById(R.id.cardTesla);
        TextView tvteslaJudul = findViewById(R.id.tvteslaJudul);
        TextView tvteslaDeskprisi = findViewById(R.id.tvteslaDeskripsi);
        TextView tvteslaSpeed = findViewById(R.id.tvteslaSpeed);
        cardTesla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DetailProduk detail = new DetailProduk();
                Intent intent;
                if (v.getId() == R.id.cardTesla) {
                    detail.setNama((String) tvteslaJudul.getText());
                    detail.setDeskripsi((String) tvteslaDeskprisi.getText());
                    detail.setTopSpeed((String) tvteslaSpeed.getText());
                    detail.setGambar("tesla");
                    intent = new Intent(UsdmLayout.this, DetailActivity.class);
                    intent.putExtra(DetailActivity.KEY_DATA, detail);
                    startActivity(intent);
                }
            }
        });
        CardView cardChevrolet = findViewById(R.id.cardChevrolet);
        TextView tvchevroletJudul = findViewById(R.id.tvchevroletJudul);
        TextView tvchevroletDeskprisi = findViewById(R.id.tvchevroletDeskripsi);
        TextView tvchevroletSpeed = findViewById(R.id.tvchevroletSpeed);
        cardChevrolet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DetailProduk detail = new DetailProduk();
                Intent intent;
                if (v.getId() == R.id.cardChevrolet) {
                    detail.setNama((String) tvchevroletJudul.getText());
                    detail.setDeskripsi((String) tvchevroletDeskprisi.getText());
                    detail.setTopSpeed((String) tvchevroletSpeed.getText());
                    detail.setGambar("chevrolet");
                    intent = new Intent(UsdmLayout.this, DetailActivity.class);
                    intent.putExtra(DetailActivity.KEY_DATA, detail);
                    startActivity(intent);
                }
            }
        });
        CardView cardCadilac = findViewById(R.id.cardCadilac);
        TextView tvcadilacJudul = findViewById(R.id.tvcadilacJudul);
        TextView tvcadilacDeskprisi = findViewById(R.id.tvcadilacDeskripsi);
        TextView tvcadilacSpeed = findViewById(R.id.tvcadilacSpeed);
        cardCadilac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DetailProduk detail = new DetailProduk();
                Intent intent;
                if (v.getId() == R.id.cardCadilac) {
                    detail.setNama((String) tvcadilacJudul.getText());
                    detail.setDeskripsi((String) tvcadilacDeskprisi.getText());
                    detail.setTopSpeed((String) tvcadilacSpeed.getText());
                    detail.setGambar("cadilac");
                    intent = new Intent(UsdmLayout.this, DetailActivity.class);
                    intent.putExtra(DetailActivity.KEY_DATA, detail);
                    startActivity(intent);
                }
            }
        });


        CardView cardDodge = findViewById(R.id.cardDodge);
        TextView tvdodgeJudul = findViewById(R.id.tvdodgeJudul);
        TextView tvdodgeDeskprisi = findViewById(R.id.tvdodgeDeskripsi);
        TextView tvdodgeSpeed = findViewById(R.id.tvdodgeSpeed);
        cardDodge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DetailProduk detail = new DetailProduk();
                Intent intent;
                if (v.getId() == R.id.cardDodge) {
                    detail.setNama((String) tvdodgeJudul.getText());
                    detail.setDeskripsi((String) tvdodgeDeskprisi.getText());
                    detail.setTopSpeed((String) tvdodgeSpeed.getText());
                    detail.setGambar("dodge");
                    intent = new Intent(UsdmLayout.this, DetailActivity.class);
                    intent.putExtra(DetailActivity.KEY_DATA, detail);
                    startActivity(intent);
                }
            }
        });
    }
}