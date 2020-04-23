package com.example.dicodingpemula;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    ImageView mImageview;
    TextView mTittle,mDescription;
    ItemClickListener itemClickListener;

    public MyHolder(@NonNull View itemView) {
        super(itemView);
        this.mImageview = itemView.findViewById(R.id.imageView);
        this.mTittle = itemView.findViewById(R.id.tittle);
        this.mDescription = itemView.findViewById(R.id.desc);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClickListener(v,getLayoutPosition());
    }
    public void setItemClickListener(ItemClickListener icl){
        this.itemClickListener=icl;
    }
}
