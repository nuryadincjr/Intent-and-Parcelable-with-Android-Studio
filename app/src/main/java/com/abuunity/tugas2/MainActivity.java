package com.abuunity.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private EditText editNPM, editNama, editKelas, editJurusan;
    private String npm, nama, kelas, jurusan;
    private Button btnKirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNPM = findViewById(R.id.edit_npm);
        editNama = findViewById(R.id.edit_nama);
        editKelas = findViewById(R.id.edit_kelas);
        editJurusan = findViewById(R.id.edit_jurusan);

        btnKirim = findViewById(R.id.btn_kirim);
        btnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                npm = editNPM.getText().toString();
                nama = editNama.getText().toString();
                kelas = editKelas.getText().toString();
                jurusan = editJurusan.getText().toString();

                Mahasiswa mahasiswa = new Mahasiswa(npm, nama, kelas, jurusan);
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Mahasiswa", mahasiswa);
                startActivity(intent);
            }
        });
    }
}