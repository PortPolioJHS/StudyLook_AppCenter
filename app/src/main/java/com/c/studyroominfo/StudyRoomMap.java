package com.c.studyroominfo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class StudyRoomMap extends Fragment {

    private View view;
    private Button btn_00, btn_01, btn_02, btn_03, btn_04, btn_05;
    private Button btn_info;
    private ImageView iv_map;
    private Spinner sp_search;
    private Boolean checked = true; // visible 설정을 위한 부울 변수
    private movePageListener pageListener; // 도서관 버튼을 클릭시 나오는 예약신청을 누를때 예약하는 창으로 움직이게 하는 리스너
    private ViewPager viewPager_main;

    public static StudyRoomMap newInstance() {
        StudyRoomMap fragment = new StudyRoomMap();
        return fragment;
}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_study_room_map, container, false);

        btn_00 = view.findViewById(R.id.btn_00);
        btn_01 = view.findViewById(R.id.btn_01);
        btn_02 = view.findViewById(R.id.btn_02);
        btn_03 = view.findViewById(R.id.btn_03);
        btn_04 = view.findViewById(R.id.btn_04);
        btn_05 = view.findViewById(R.id.btn_05);

        btn_info = view.findViewById(R.id.btn_info);
//        iv_map = view.findViewById(R.id.iv_map);
        sp_search = view.findViewById(R.id.sp_search);

        btn_00.setOnClickListener(onClickListener);
        btn_01.setOnClickListener(onClickListener);
        btn_02.setOnClickListener(onClickListener);
        btn_03.setOnClickListener(onClickListener);
        btn_04.setOnClickListener(onClickListener);
        btn_05.setOnClickListener(onClickListener);

        btn_info.setOnClickListener(onClickListener);
        // 버튼을 눌렀을때 해당 스터디룸에대한 정보를 설명하기 위한 리스너

        viewPager_main = getActivity().findViewById(R.id.viewPager);

        // 스피너로 객체를 클릭하게 되면 해당 정보를 가진 버튼이 실행되게 하여 설명이 나오게 된다.
        sp_search.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 1: {
                        btn_04.performClick();
                        break;
                    }
                    case 2: {
                        btn_05.performClick();
                        break;
                    }
                    case 3: {
                        btn_03.performClick();
                        break;
                    }
                    case 4: {
                        btn_00.performClick();
                        break;
                    }
                    case 5: {
                        btn_01.performClick();
                        break;
                    }
                    case 6: {
                        btn_02.performClick();
                        break;
                    }
                }
                sp_search.setSelection(0);
            }
            // 어떤 버튼을 의미하는지에 대한 설명
            // btn_00 27호관
            // btn_01 28호관
            // btn_02 29호관
            // btn_03 11호관
            // btn_04 01호관
            // btn_05 06호관

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                //null
            }
        });

        return view;

    }


    // 버튼 리스너 구현, 버튼을 누르면 스터디룸에 대한 설명이 나온다.
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_00 : {

                    BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(getActivity());
                    bottomSheetDialog.setContentView(R.layout.bottom_sheet_27);
                    bottomSheetDialog.setCanceledOnTouchOutside(true);

                    bottomSheetDialog.show();
                    break;

//                    AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
//                     왜 이렇게 되는지 모르겠는데 Layout불러오려면 이렇게 해야함
//                    LayoutInflater inflater = LayoutInflater.from(getActivity());
//                    View view1 = inflater.inflate(R.layout.study_room_eleven_explanation, null);
//                    builder.setView(view1);
//                    builder.show();
//                    break;
                }

                case R.id.btn_01 : {
                    BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(getActivity());
                    bottomSheetDialog.setContentView(R.layout.bottom_sheet_28);
                    bottomSheetDialog.setCanceledOnTouchOutside(true);

                    bottomSheetDialog.show();
                    break;
                }

                case R.id.btn_02 : {
                    BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(getActivity());
                    bottomSheetDialog.setContentView(R.layout.bottom_sheet_29);
                    bottomSheetDialog.setCanceledOnTouchOutside(true);

                    bottomSheetDialog.show();
                    break;
                }

                case R.id.btn_03 : {
                    BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(getActivity());
                    bottomSheetDialog.setContentView(R.layout.bottom_sheet_11);
                    bottomSheetDialog.setCanceledOnTouchOutside(true);

                    bottomSheetDialog.show();
                    break;
                }

                case R.id.btn_04 : {
                    BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(getActivity());
                    bottomSheetDialog.setContentView(R.layout.bottom_sheet_1);
                    bottomSheetDialog.setCanceledOnTouchOutside(true);

                    bottomSheetDialog.show();
                    break;
                }

                case R.id.btn_05 : {
                    final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(getActivity());
                    bottomSheetDialog.setContentView(R.layout.bottom_sheet_6);
                    bottomSheetDialog.setCanceledOnTouchOutside(true);

                    Button btn_reserve = bottomSheetDialog.findViewById(R.id.btn_reserve);
                    btn_reserve.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            viewPager_main.setCurrentItem(2);
                            bottomSheetDialog.dismiss();
                        }
                    });

                    bottomSheetDialog.show();
                    break;
                }

                case R.id.btn_info : {
                    InfoActivity infoActivity = new InfoActivity(getActivity());
//                    infoActivity.setCancelable(false);
                    // 버튼 안누르면 취소 페이지 못 나가게
                    infoActivity.show();
                    break;
                }
            }
        }
    };



}