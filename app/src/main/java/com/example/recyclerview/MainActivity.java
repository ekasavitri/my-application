    package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[], s3[];
    int gambar[] = {R.drawable.beruang,R.drawable.harimau,R.drawable.jerapah,
            R.drawable.kangguru,R.drawable.kelinci,R.drawable.kuda,R.drawable.platipus,
            R.drawable.singa,R.drawable.tupai,R.drawable.gajah};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.binatang);
        s2 = getResources().getStringArray(R.array.deskripsi);
        s3 = getResources().getStringArray(R.array.penjelasan);

        Adapter adapter = new Adapter(this, s1, s2, s3, gambar );

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
