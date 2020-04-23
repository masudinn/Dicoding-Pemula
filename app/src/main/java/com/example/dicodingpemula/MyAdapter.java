package com.example.dicodingpemula;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {
    Context c;
    ArrayList<Model> models;

    public MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row,null);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder myholder, int i) {
    myholder.mTittle.setText(models.get(i).getTittle());
    myholder.mDescription.setText(models.get(i).getDescription());
    myholder.mImageview.setImageResource(models.get(i).getImg());

    myholder.setItemClickListener(new ItemClickListener() {
        @Override
        public void onItemClickListener(View v, int position) {
            if(models.get(position).getTittle().equals("BUMI")){

            }
            if(models.get(position).getTittle().equals("BULAN")){

            }
            if(models.get(position).getTittle().equals("PLUTO")){

            }
            if(models.get(position).getTittle().equals("JUPITER")){

            }
            if(models.get(position).getTittle().equals("MARS")){

            }
            if(models.get(position).getTittle().equals("MERKURIUS")){

            }
            if(models.get(position).getTittle().equals("NEPTUNUS")){

            }
            if(models.get(position).getTittle().equals("SATURNUS")){

            }
            if(models.get(position).getTittle().equals("URANUS")){

            }
            if(models.get(position).getTittle().equals("VENUS")){

            }
            if(models.get(position).getTittle().equals("MATAHARI")){

            }
        }
    });

    myholder.setItemClickListener(new ItemClickListener() {
        @Override
        public void onItemClickListener(View v, int position) {
           String Tittle = models.get(position).getTittle();
           String Desc = models.get(position).getDescription();
           BitmapDrawable Img = (BitmapDrawable)myholder.mImageview.getDrawable();
           Bitmap bitmap = Img.getBitmap();
           ByteArrayOutputStream stream = new ByteArrayOutputStream();
           bitmap.compress(Bitmap.CompressFormat.PNG,100,stream);
           byte[] bytes = stream.toByteArray();

           Intent intent = new Intent(c,ClickListen.class);
           intent.putExtra("Tittle",Tittle);
           intent.putExtra("Desc",Desc);
           intent.putExtra("Image",bytes);
           c.startActivity(intent);
        }
    });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
