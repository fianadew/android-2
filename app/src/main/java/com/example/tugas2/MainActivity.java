package com.example.tugas2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText angka;
    private Button sin, cos, tan, secan, cosecan, cotan, log;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka = findViewById(R.id.angka);
        sin = findViewById(R.id.sin);
        cos = findViewById(R.id.cos);
        tan = findViewById(R.id.tan);
        cosecan = findViewById(R.id.cosecan);
        secan = findViewById(R.id.sec);
        cotan = findViewById(R.id.cotan);
        log = findViewById(R.id.logaritma);
        hasil = findViewById(R.id.jum);


        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sangka = angka.getText().toString();
                    double Angka = Double.parseDouble(sangka);
                    double jumlah = Math.sin(Math.toRadians(Angka));
                    String shasil = String.valueOf(jumlah);
                    hasil.setText(shasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }

            }
        });

        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sangka = angka.getText().toString();
                    double Angka = Double.parseDouble(sangka);
                    double jumlah = Math.cos(Math.toRadians(Angka));
                    String shasil = String.valueOf(jumlah);
                    hasil.setText(shasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }

            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sangka = angka.getText().toString();
                    double Angka = Double.parseDouble(sangka);
                    double jumlah = Math.tan(Math.toRadians(Angka));
                    String shasil = String.valueOf(jumlah);
                    hasil.setText(shasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }

            }
        });
        secan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sangka = angka.getText().toString();
                    double Angka = Double.parseDouble(sangka);
                    double jumlah = 1 / (Math.cos(Math.toRadians(Angka)));
                    String shasil = String.valueOf(jumlah);
                    hasil.setText(shasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }

            }
        });

        cosecan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sangka = angka.getText().toString();
                    double Angka = Double.parseDouble(sangka);
                    double jumlah = 1 / (Math.sin(Math.toRadians(Angka)));
                    String shasil = String.valueOf(jumlah);
                    hasil.setText(shasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }

            }
        });
        cotan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sangka = angka.getText().toString();
                    double Angka = Double.parseDouble(sangka);
                    double jumlah = 1 / (Math.tan(Math.toRadians(Angka)));
                    String shasil = String.valueOf(jumlah);
                    hasil.setText(shasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }

            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sangka = angka.getText().toString();
                    double Angka = Double.parseDouble(sangka);
                    double jumlah = Math.log10(Angka);
                    String shasil = String.valueOf(jumlah);
                    hasil.setText(shasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
