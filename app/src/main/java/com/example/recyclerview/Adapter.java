package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    String data1[], data2[], data3[];
    int gambar[];
    Context konteks;

    public Adapter(Context kt, String s1[],String s2[],String s3[],int foto[]){
        konteks = kt;
        data1 = s1;
        data2 = s2;
        data3 = s3;
        gambar = foto;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(konteks);
        View view = inflater.inflate(R.layout.baris, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.teks1.setText(data1[position]);
        holder.teks2.setText(data2[position]);
        holder.gambar1.setImageResource(gambar[position]);

        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(konteks, SecondActivitiy.class);
                intent.putExtra("data1", data1[position]);
                intent.putExtra("data3", data3[position]);
                intent.putExtra("gambar", gambar[position]);
                konteks.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return gambar.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView teks1,teks2;
        ImageView gambar1;
        ConstraintLayout mainLayout;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                teks1 = itemView.findViewById(R.id.Text1);
                teks2 = itemView.findViewById(R.id.Text2);
                gambar1 = itemView.findViewById(R.id.imageView); //ini untuk inisiasi variabel di baris.xml
                mainLayout = itemView.findViewById(R.id.mainLayout);
            }
        }
}
