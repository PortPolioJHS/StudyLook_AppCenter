package com.c.studyroominfo;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SrListAdapter extends BaseExpandableListAdapter {

    private Context context;
    private ArrayList<Building> buildingList;
    private ArrayList<Building> originalList;

    private int image_id;


    public SrListAdapter(Context context, ArrayList<Building> buildingList) {
        this.context = context;
        this.buildingList = new ArrayList<Building>();
        this.buildingList.addAll(buildingList);
        this.originalList = new ArrayList<Building>();
        this.originalList.addAll(buildingList);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        ArrayList<Studyroom> studyroomList = buildingList.get(groupPosition).getStudyroomList();
        return studyroomList.get(childPosition);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(final int groupPosition, final int childPosition, boolean isLastChild,
                             View view, ViewGroup parent) {

        final Studyroom studyroom = (Studyroom) getChild(groupPosition, childPosition);
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.child_row, null);
        }

        TextView code = (TextView) view.findViewById(R.id.code);
        TextView name = (TextView) view.findViewById(R.id.name);
        TextView etc = (TextView) view.findViewById(R.id.etc);

        code.setText(studyroom.getCode().trim());
        name.setText(studyroom.getName().trim());
        etc.setText(studyroom.getEtc().trim());


        //클릭했을시 **
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.custom_dialog);
                dialog.setTitle(studyroom.getEtc());
                TextView tv_sr = (TextView) dialog.findViewById(R.id.tv_sr);
                tv_sr.setText(studyroom.getCode());
                TextView tv_info = (TextView) dialog.findViewById(R.id.info);
                tv_info.setText("");

                final ImageView img = (ImageView) dialog.findViewById(R.id.srimg);
                img.setImageResource(R.drawable.none);
                image_id = 0;

                switch (studyroom.getEtc()) {
                    case "6호관":
                        switch (studyroom.getCode()) {

                            case "205호":
                                image_id = R.drawable.lib_205;
                                img.setImageResource(image_id);
                                tv_info.setText("칠판, 콘센트, 프로젝터 구비 \n다만 rgb 케이블은 도서관 관계자분께 문의");
                                break;

                            case "206호":
                                image_id = R.drawable.lib_206;
                                img.setImageResource(image_id);
                                tv_info.setText("칠판, 콘센트, 프로젝터 구비 \n다만 rgb 케이블은 도서관 관계자분께 문의");
                                break;

                            case "207호":
                                image_id = R.drawable.lib_207;
                                img.setImageResource(image_id);
                                tv_info.setText("프로젝터가 준비되지 않았지만 \n콘센트와 칠판은 준비되어있음");
                                break;

                            case "208호":
                                image_id = R.drawable.lib_208;
                                img.setImageResource(image_id);
                                tv_info.setText("칠판, 콘센트, 프로젝터 구비 \n다만 rgb 케이블은 도서관 관계자분께 문의");
                                break;

                            case "209호":
                                image_id = R.drawable.lib_209;
                                img.setImageResource(image_id);
                                tv_info.setText("칠판, 콘센트, 프로젝터 구비 \n다만 rgb 케이블은 도서관 관계자분께 문의");
                                break;

                            case "305호":
                                image_id = R.drawable.lib_305;
                                img.setImageResource(image_id);
                                tv_info.setText("칠판, 콘센트, 프로젝터 구비 \n다만 rgb 케이블은 도서관 관계자분께 문의");
                                break;

                            case "306호":
                                image_id = R.drawable.lib_306;
                                img.setImageResource(image_id);
                                tv_info.setText("칠판, 콘센트, 프로젝터 구비 \n다만 rgb 케이블은 도서관 관계자분께 문의");
                                break;

                            case "307호":
                                image_id = R.drawable.lib_307;
                                img.setImageResource(image_id);
                                tv_info.setText("대학원생 전용 스터디룸이라 예약 불가능");
                                break;

                            case "308호":
                                image_id = R.drawable.lib_308;
                                img.setImageResource(image_id);
                                tv_info.setText("서가 안쪽에 위치 \n칠판, 콘센트, 프로젝터 구비 \n다만 rgb 케이블은 도서관 관계자분께 문의");
                                break;

                            case "309호":
                                image_id = R.drawable.lib_309;
                                img.setImageResource(image_id);
                                tv_info.setText("서가 안쪽에 위치 \n칠판, 콘센트, 프로젝터 구비 \n다만 rgb 케이블은 도서관 관계자분께 문의");
                                break;
                        }
                        break;
                    case "11호관":
                        switch (studyroom.getCode()) {

                            case "302호":
                                image_id = R.drawable.wf_302;
                                img.setImageResource(image_id);
                                tv_info.setText("단체 세미나실이지만 스터디도 가능 \n칠판, 콘센트, 프로젝터 구비 \n다만 rgb 케이블은 대여 or 각자 구비");
                                break;

                            case "315호":
                                image_id = R.drawable.wf_315;
                                img.setImageResource(image_id);
                                tv_info.setText("창고로 사용중이므로 사용불가");
                                break;

                            case "316호":
                                image_id = R.drawable.wf_316;
                                img.setImageResource(image_id);
                                tv_info.setText("칠판, 콘센트, 프로젝터 구비 \n다만 rgb 케이블은 대여 or 각자 구비");
                                break;

                            case "317호":
                                image_id = R.drawable.wf_317;
                                img.setImageResource(image_id);
                                tv_info.setText("칠판, 콘센트, 프로젝터 구비 \n다만 rgb 케이블은 대여 or 각자 구비");
                                break;

                            case "318호":
                                image_id = R.drawable.wf_318;
                                img.setImageResource(image_id);
                                tv_info.setText("칠판, 콘센트, 프로젝터 구비 \n다만 rgb 케이블은 대여 or 각자 구비");
                                break;
                        }
                        break;
                    case "27호관":
                        switch (studyroom.getCode()) {

                            case "102A호":
                                image_id = R.drawable.ts_102a;
                                img.setImageResource(image_id);
                                tv_info.setText("칠판, 콘센트, 프로젝터 구비 \n다만 rgb 케이블은 대여 or 각자 구비");
                                break;

                            case "102A호-2":
                                image_id = R.drawable.ts_102a2;
                                img.setImageResource(image_id);
                                tv_info.setText("칠판, 콘센트, 프로젝터 구비 \n다만 rgb 케이블은 대여 or 각자 구비");
                                break;

                            case "102B호":
                                image_id = R.drawable.ts_102b;
                                img.setImageResource(image_id);
                                tv_info.setText("칠판, 콘센트, 프로젝터 구비 \n다만 rgb 케이블은 대여 or 각자 구비");
                                break;

                            case "102B호-2":
                                image_id = R.drawable.ts_102b2;
                                img.setImageResource(image_id);
                                tv_info.setText("칠판, 콘센트, 프로젝터 구비 \n다만 rgb 케이블은 대여 or 각자 구비");
                                break;

                            case "102C호":
                                image_id = R.drawable.ts_102c;
                                img.setImageResource(image_id);
                                tv_info.setText("칠판, 콘센트, 프로젝터 구비 \n다만 rgb 케이블은 대여 or 각자 구비");
                                break;

                            case "102C호-2":
                                image_id = R.drawable.ts_102c2;
                                img.setImageResource(image_id);
                                tv_info.setText("칠판, 콘센트, 프로젝터 구비 \n다만 rgb 케이블은 대여 or 각자 구비");
                                break;

                            case "102D호":
                                image_id = R.drawable.ts_102d;
                                img.setImageResource(image_id);
                                tv_info.setText("칠판, 콘센트, 프로젝터 구비 \n다만 rgb 케이블은 대여 or 각자 구비");
                                break;

                            case "102D호-2":
                                image_id = R.drawable.ts_102d2;
                                img.setImageResource(image_id);
                                tv_info.setText("칠판, 콘센트, 프로젝터 구비 \n다만 rgb 케이블은 대여 or 각자 구비");
                                break;

                            case "203호":
                                image_id = R.drawable.ts_203;
                                img.setImageResource(image_id);
                                tv_info.setText("칠판, 콘센트, 프로젝터 구비 \n다만 rgb 케이블은 대여 or 각자 구비");
                                break;


                            case "401호":
                                image_id = R.drawable.ts_401;
                                img.setImageResource(image_id);
                                tv_info.setText("춤연습으로 자주 대여하는 장소이므로 \n책상정리가 되어있지 않음");
                                break;

                            case "402호":
                                image_id = R.drawable.ts_402;
                                img.setImageResource(image_id);
                                tv_info.setText("춤연습으로 자주 대여하는 장소이므로 \n책상정리가 되어있지 않음");
                                break;

                            case "404호":
                                image_id = R.drawable.ts_404;
                                img.setImageResource(image_id);
                                tv_info.setText("거울방 \n책상이랑 의자가 없음");
                                break;

                            case "405호":
                                image_id = R.drawable.ts_405;
                                img.setImageResource(image_id);
                                tv_info.setText("거울방 \n책상이랑 의자가 없음");
                                break;

                        }
                        break;
                    case "28호관":
                        switch (studyroom.getCode()) {

                            case "107호":
                                image_id = R.drawable.te_107;
                                img.setImageResource(image_id);
                                tv_info.setText("추후 재촬영 예정");
                                break;
                        }
                        break;
                    case "29호관":
                        switch (studyroom.getCode()) {

                            case "101A호":
                                image_id = R.drawable.tn_101a;
                                img.setImageResource(image_id);
                                tv_info.setText("칠판, 콘센트, 프로젝터 구비 \n다만 rgb 케이블은 대여 or 각자 구비");
                                break;

                            case "101B호-1":
                                image_id = R.drawable.tn_101b1;
                                img.setImageResource(image_id);
                                tv_info.setText("칠판, 콘센트, 프로젝터 구비 \n다만 rgb 케이블은 대여 or 각자 구비 \n입구가 건물 외부에 있음");
                                break;

                            case "101B호-2":
                                image_id = R.drawable.tn_101b2;
                                img.setImageResource(image_id);
                                tv_info.setText("칠판, 콘센트, 프로젝터 구비 \n다만 rgb 케이블은 대여 or 각자 구비 \n입구가 건물 외부에 있음");
                                break;

                            case "미유1호방":
                                image_id = R.drawable.miyu_1;
                                img.setImageResource(image_id);
                                tv_info.setText("수기로 예약 \n테이블만 준비되어 있음 \n칠판, 프로젝터는 없지만 콘센트는 있음 \n1일 최대 4시간, 4인 이상 예약 가능");
                                break;

                            case "미유2호방":
                                image_id = R.drawable.miyu_2;
                                img.setImageResource(image_id);
                                tv_info.setText("수기로 예약 \n테이블만 준비되어 있음 \n칠판, 프로젝터는 없지만 콘센트는 있음 \n1일 최대 4시간, 4인 이상 예약 가능");
                                break;

                            case "미유3호방":
                                image_id = R.drawable.miyu_3;
                                img.setImageResource(image_id);
                                tv_info.setText("수기로 예약 \n테이블만 준비되어 있음 \n칠판, 프로젝터는 없지만 콘센트는 있음 \n1일 최대 4시간, 4인 이상 예약 가능");
                                break;
                        }
                        break;

                    case "참고자료":
                        switch (studyroom.getCode()) {

                            case "미유카페":
                                image_id = R.drawable.re_miyu;
                                img.setImageResource(image_id);
                                tv_info.setText("");
                                break;

                            case "11호관":
                                image_id = R.drawable.re_11;
                                img.setImageResource(image_id);
                                tv_info.setText("");
                                break;

                            case "27호관":
                                image_id = R.drawable.re_27;
                                img.setImageResource(image_id);
                                tv_info.setText("");
                                break;
                        }
                        break;

                }
                img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if (image_id != 0){
                            Intent intent = new Intent(dialog.getContext(),ImgDetailActivity.class);

                            intent.putExtra("img", image_id);
                            context.startActivity(intent);
                        }
//                        intent.putExtra("img", Integer.toString(dialog..get(position).getImg()));
                    }
                });
                dialog.show();


                }
        });

        return view;
    }

    @Override
    public int getChildrenCount(int groupPosition) {

        ArrayList<Studyroom> studyroomList = buildingList.get(groupPosition).getStudyroomList();
        return studyroomList.size();

    }

    @Override
    public Object getGroup(int groupPosition) {
        return buildingList.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return buildingList.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isLastChild, View view,
                             ViewGroup parent) {

        Building building = (Building) getGroup(groupPosition);
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.group_row, null);
        }

        TextView heading = (TextView) view.findViewById(R.id.heading);
        heading.setText(building.getName().trim());

        return view;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

    public void filterData(String query){

        query = query.toLowerCase();
        Log.v("SrListAdapter", String.valueOf(buildingList.size()));
        buildingList.clear();

        if(query.isEmpty()){
            buildingList.addAll(originalList);
        }
        else {

            for(Building building : originalList){

                ArrayList<Studyroom> studyroomList = building.getStudyroomList();
                ArrayList<Studyroom> newList = new ArrayList<Studyroom>();
                for(Studyroom studyroom : studyroomList){
                    if(studyroom.getCode().toLowerCase().contains(query) ||
                            studyroom.getName().toLowerCase().contains(query)){
                        newList.add(studyroom);
                    }
                }
                if(newList.size() > 0){
                    Building nBuilding = new Building(building.getName(),newList);
                    buildingList.add(nBuilding);
                }
            }
        }

        Log.v("SrListAdapter", String.valueOf(buildingList.size()));
        notifyDataSetChanged();

    }

}