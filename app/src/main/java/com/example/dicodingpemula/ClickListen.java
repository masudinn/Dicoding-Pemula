package com.example.dicodingpemula;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ClickListen extends AppCompatActivity {

    TextView tvTittle,tvDesc;
    ImageView iImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        tvTittle = findViewById(R.id.tittle);
        tvDesc = findViewById(R.id.desc);
        iImage = findViewById(R.id.imageView);

        Intent intent = getIntent();
        String Tittle = intent.getStringExtra("Tittle");
        String Description = intent.getStringExtra("Desc");
        byte[] Byte = getIntent().getByteArrayExtra("Image");

        Bitmap bitmap = BitmapFactory.decodeByteArray(Byte,0,Byte.length);
        tvTittle.setText(Tittle);
        tvDesc.setText(Description);
        iImage.setImageBitmap(bitmap);
    }
}
