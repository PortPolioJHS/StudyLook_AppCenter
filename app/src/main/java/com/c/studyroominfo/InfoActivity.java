package com.c.studyroominfo;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class InfoActivity extends Dialog {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    InfoAdapter infoAdapter;
    ArrayList<InfoData> arrayList;
    Button btn_info_check;

    public InfoActivity(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_main);

        recyclerView = findViewById(R.id.rv_info);
        linearLayoutManager = new LinearLayoutManager(getOwnerActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        arrayList = new ArrayList<>();

        infoAdapter = new InfoAdapter(arrayList);
        recyclerView.setAdapter(infoAdapter);

        InfoData infoData1 = new InfoData(R.drawable.first_exp, "초기화면");
        InfoData infoData2 = new InfoData(R.drawable.second_exp, "건물정보를 클릭시 나타나는 화면");
        InfoData infoData3 = new InfoData(R.drawable.third_exp, "해당 건물에 대한 정보를 확인하실 수 있습니다.");
        InfoData infoData4 = new InfoData(R.drawable.fourth_exp, "모든 스터디룸에 대한 정보입니다.");
        InfoData infoData5 = new InfoData(R.drawable.fifth_exp, "원하는 스터디룸을 검색하실 수 있습니다.");
        InfoData infoData6 = new InfoData(R.drawable.sixth_exp, "해당 리스트 클릭시 스터디룸 설명을 볼 수 있습니다.");
        InfoData infoData7 = new InfoData(R.drawable.seventh_exp, "도서관 예약서비스를 제공합니다.");
        arrayList.add(infoData1);
        arrayList.add(infoData2);
        arrayList.add(infoData3);
        arrayList.add(infoData4);
        arrayList.add(infoData5);
        arrayList.add(infoData6);
        arrayList.add(infoData7);
        infoAdapter.notifyDataSetChanged();

        btn_info_check = findViewById(R.id.btn_info_check);
        btn_info_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
    }
}
