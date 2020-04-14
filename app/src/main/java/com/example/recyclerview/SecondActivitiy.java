package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivitiy extends AppCompatActivity {

    ImageView gambar2;
    TextView judul, deskripsi;

    String data1, data3;
    int gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        gambar2 = findViewById(R.id.gambar2);
        judul = findViewById(R.id.judul);
        deskripsi = findViewById((R.id.deskripsi));

        getData();
        setdata();
    }

    private void getData(){
        if(getIntent().hasExtra("data1") && getIntent().hasExtra("data3") &&
        getIntent().hasExtra("gambar")){

            data1 = getIntent().getStringExtra("data1");
            data3 = getIntent().getStringExtra("data3");
            gambar = getIntent().getIntExtra("gambar",1);

        }else{
            Toast.makeText(this, "Tidak ada data", Toast.LENGTH_SHORT).show();
            //kalo engga ada data nanti tampil tidak ada data
        }
    }

    private void setdata(){
        judul.setText(data1);
        deskripsi.setText(data3);
        gambar2.setImageResource(gambar);
    }
}
