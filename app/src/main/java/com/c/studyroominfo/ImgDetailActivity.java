package com.c.studyroominfo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ImgDetailActivity extends AppCompatActivity {

    private int img;
    private Intent intent;
    private ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_detail);

        intent = getIntent();
        imageView = (ImageView) findViewById(R.id.imageView);

       int image_id = intent.getIntExtra("img",0);
       if (image_id != 0) {
           imageView.setImageResource(image_id);
       }

    }
}