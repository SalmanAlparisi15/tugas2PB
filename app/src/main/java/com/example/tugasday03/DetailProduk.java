package com.example.tugasday03;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class DetailProduk implements Parcelable {
    public String Nama;
    public String Deskripsi;
    public String topSpeed;
    public String Gambar;
    public DetailProduk() {
    }

    protected DetailProduk(Parcel in) {
        Nama = in.readString();
        Deskripsi = in.readString();
        topSpeed = in.readString();
        Gambar = in.readString();
    }

    public static final Creator<DetailProduk> CREATOR = new Creator<DetailProduk>() {
        @Override
        public DetailProduk createFromParcel(Parcel in) {
            return new DetailProduk(in);
        }

        @Override
        public DetailProduk[] newArray(int size) {
            return new DetailProduk[size];
        }
    };

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        Deskripsi = deskripsi;
    }

    public String getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(String topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getGambar() {
        return Gambar;
    }

    public void setGambar(String Gambar) {
        this.Gambar = Gambar;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(Nama);
        dest.writeString(Deskripsi);
        dest.writeString(topSpeed);
        dest.writeString(Gambar);
    }
}
