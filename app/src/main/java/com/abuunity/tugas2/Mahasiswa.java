package com.abuunity.tugas2;

import android.os.Parcel;
import android.os.Parcelable;

public class Mahasiswa implements Parcelable {
    private final String npm;
    private final String nama;
    private final String kelas;
    private final String jurusan;

    public Mahasiswa(String npm, String nama, String kelas, String jurusan) {
        this.npm = npm;
        this.nama = nama;
        this.kelas = kelas;
        this.jurusan = jurusan;
    }


    protected Mahasiswa(Parcel in) {
        npm = in.readString();
        nama = in.readString();
        kelas = in.readString();
        jurusan = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(npm);
        dest.writeString(nama);
        dest.writeString(kelas);
        dest.writeString(jurusan);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Mahasiswa> CREATOR = new Creator<Mahasiswa>() {
        @Override
        public Mahasiswa createFromParcel(Parcel in) {
            return new Mahasiswa(in);
        }

        @Override
        public Mahasiswa[] newArray(int size) {
            return new Mahasiswa[size];
        }
    };

    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public String getJurusan() {
        return jurusan;
    }
}
