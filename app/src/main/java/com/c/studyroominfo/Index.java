package com.c.studyroominfo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class Index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent i = new Intent(Index.this, Main.class);
                startActivity(i);
                finish();
            }
        }, 1000); // 1000ms

    }

    @Override
    public void onBackPressed() {
        // 인덱스 화면에서 뒤로가기 눌러도 아무 변화 없게 하기 위해
    }
}
