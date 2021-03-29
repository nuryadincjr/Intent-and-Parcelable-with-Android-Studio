package com.abuunity.tugas2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView hasiNpm, hasilNama, hasilKelas, hasilJurusan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Mahasiswa mahasiswa = getIntent().getParcelableExtra("Mahasiswa");

        hasiNpm = findViewById(R.id.tv_hasil1);
        hasilNama = findViewById(R.id.tv_hasil2);
        hasilKelas = findViewById(R.id.tv_hasil3);
        hasilJurusan = findViewById(R.id.tv_hasil4);

        hasiNpm.setText("NPM\t\t\t: "+mahasiswa.getNpm());
        hasilNama.setText("Nama\t\t: "+mahasiswa.getNama());
        hasilKelas.setText("Kelas\t\t\t: "+mahasiswa.getKelas());
        hasilJurusan.setText("Jurusan: "+mahasiswa.getJurusan());
    }
}