package com.example.tugasday03;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tvjudulDetail, tvdeskripsiDetail, tvspeedDetail ;
    private ImageView imgDetail;
    private Button btnShare;
    public static final  String KEY_DATA ="key_data";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvjudulDetail = findViewById(R.id.tvjudulDetail);
        tvdeskripsiDetail = findViewById(R.id.tvdeskripsiDetail);
        tvspeedDetail = findViewById(R.id.tvspeedDetail);
        imgDetail = findViewById(R.id.imgDetail);
        btnShare = findViewById(R.id.btnShare);

        DetailProduk detail;
        if (Build.VERSION.SDK_INT>=33){
            detail = getIntent().getParcelableExtra(KEY_DATA,DetailProduk.class);
        }else {
            detail = getIntent().getParcelableExtra(KEY_DATA);

        }

        String SourceGambar = detail.getGambar();
        int sourceGambar = getResources().getIdentifier(SourceGambar,"drawable",getPackageName() );
        imgDetail.setImageResource(sourceGambar);

        String nama = detail.getNama();
        String deskripsi = detail.getDeskripsi();
        String speed = detail.getTopSpeed();
        tvjudulDetail.setText(nama);
        tvdeskripsiDetail.setText(deskripsi);
        tvspeedDetail.setText(speed);
        btnShare.setOnClickListener(this);
    }
    private void shareImageAndText() {
        Bitmap bitmap = ((BitmapDrawable) imgDetail.getDrawable()).getBitmap();
        String text1 = tvjudulDetail.getText().toString();
        String text2 = tvdeskripsiDetail.getText().toString();
        String text3 = tvspeedDetail.getText().toString();
        String gabung = text1 + text2 + text3;

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("image/*");

        Uri uri = getImageUri(this, bitmap);
        intent.putExtra(Intent.EXTRA_STREAM, uri);
        intent.putExtra(Intent.EXTRA_TEXT, gabung);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(Intent.createChooser(intent, "Share melalui"));
        } else {
            Toast.makeText(this, "Tidak ada aplikasi yang dapat menangani intent ini", Toast.LENGTH_SHORT).show();
        }
    }

    private Uri getImageUri(Context context, Bitmap bitmap) {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
        String path = MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, "Title", null);
        return Uri.parse(path);
    }

    @Override
    public void onClick(View v) {
        shareImageAndText();
    }
}