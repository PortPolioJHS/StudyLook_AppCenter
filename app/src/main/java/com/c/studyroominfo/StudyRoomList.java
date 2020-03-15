package com.c.studyroominfo;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.SearchView;

import androidx.fragment.app.Fragment;

public class StudyRoomList extends Fragment implements
        SearchView.OnQueryTextListener, SearchView.OnCloseListener{

    private View view;
    private SearchView search;
    private ImageButton home;
    private SrListAdapter listAdapter;
    private ExpandableListView srList;
    private ArrayList<Building> buildingList = new ArrayList<Building>();

    public StudyRoomList () {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_study_room_list, null);

        SearchManager searchManager = (SearchManager) StudyRoomList.super.getActivity().getSystemService(Context.SEARCH_SERVICE);
        search = (SearchView) view.findViewById(R.id.search);
        search.setSearchableInfo(searchManager.getSearchableInfo(StudyRoomList.super.getActivity().getComponentName()));
        search.setIconifiedByDefault(false);
        search.setOnQueryTextListener(this);
        search.setOnCloseListener(this);

        displayList();
        return view;
    }
    //method to expand all groups
    private void expandAll() {
        int count = listAdapter.getGroupCount();
        for (int i = 0; i < count; i++){
            srList.expandGroup(i);
        }
    }


    private void displayList() {

        //display the list
        loadSomeData();

        srList = (ExpandableListView) view.findViewById(R.id.expandableList);
        listAdapter = new SrListAdapter(getActivity(),buildingList);
        srList.setAdapter(listAdapter);
    }

    private void loadSomeData() {

        ArrayList<Studyroom> studyroomList = new ArrayList<Studyroom>();
        Studyroom studyroom = new Studyroom("S101호","창업동아리실","1호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("S102호","창업동아리실","1호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("S103호","창업동아리실","1호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("S104호","창업동아리실","1호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("S105호","창업동아리실","1호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("S106호","창업동아리실","1호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("S107호","창업동아리실","1호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("S201호","창업동아리실","1호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("S202호","창업동아리실","1호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("S203호","창업동아리실","1호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("S301호","창업동아리실","1호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("S302호","창업동아리실","1호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("S401호","창업동아리실","1호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("S501호","창업동아리실","1호관");
        studyroomList.add(studyroom);

        Building building = new Building("1호관 대학본부", studyroomList);
        buildingList.add(building);

        studyroomList = new ArrayList<Studyroom>();
        studyroom = new Studyroom("205호","8인실(5인이상)","6호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("206호","8인실(5인이상)","6호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("207호","4인실(3인이상)","6호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("208호","4인실(3인이상)","6호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("209호","8인실(5인이상)","6호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("305호","14인실(6인이상)","6호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("306호","14인실(6인이상)","6호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("307호","14인실(6인이상), 대학원생전용","6호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("308호","6인실(4인이상)","6호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("309호","6인실(4인이상)","6호관");
        studyroomList.add(studyroom);

        building = new Building("6호관 학산도서관", studyroomList);
        buildingList.add(building);


        studyroomList = new ArrayList<Studyroom>();
        //studyroom = new Studyroom("208호","소극장","11호관");
        //studyroomList.add(studyroom);
        studyroom = new Studyroom("302호","세미나실","11호관");
        studyroomList.add(studyroom);
        //studyroom = new Studyroom("307호","세미나실-거울방","11호관");
        //studyroomList.add(studyroom);
        //studyroom = new Studyroom("308호","세미나실-거울방","11호관");
        //studyroomList.add(studyroom);
        //studyroom = new Studyroom("309호","세미나실-거울방","11호관");
        //studyroomList.add(studyroom);
        studyroom = new Studyroom("315호","스터디룸","11호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("316호","스터디룸","11호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("317호","스터디룸","11호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("318호","스터디룸","11호관");
        studyroomList.add(studyroom);

        building = new Building("11호관 복지회관", studyroomList);
        buildingList.add(building);


        studyroomList = new ArrayList<Studyroom>();
        studyroom = new Studyroom("102A호","스터디룸","27호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("102A호-2","스터디룸","27호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("102B호","스터디룸","27호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("102B호-2","스터디룸","27호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("102C호","스터디룸","27호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("102C호-2","스터디룸","27호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("102D호","스터디룸","27호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("102D호-2","스터디룸","27호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("203호","스터디룸","27호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("401호","세미나실","27호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("402호","세미나실","27호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("404호","세미나실-거울방","27호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("405호","세미나실-거울방","27호관");
        studyroomList.add(studyroom);

        building = new Building("27호관 스터디룸 및 세미나실", studyroomList);
        buildingList.add(building);


        studyroomList = new ArrayList<Studyroom>();
        studyroom = new Studyroom("107호","세미나실","28호관");
        studyroomList.add(studyroom);

        building = new Building("28호관 스터디룸 및 세미나실", studyroomList);
        buildingList.add(building);


        studyroomList = new ArrayList<Studyroom>();
        studyroom = new Studyroom("101A호","스터디룸","29호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("101B호-1","스터디룸","29호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("101B호-2","스터디룸","29호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("미유1호방","미유카페_스터디룸","29호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("미유2호방","미유카페_스터디룸","29호관");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("미유3호방","미유카페_스터디룸","29호관");
        studyroomList.add(studyroom);

        building = new Building("29호관 스터디룸", studyroomList);
        buildingList.add(building);


        studyroomList = new ArrayList<Studyroom>();
        studyroom = new Studyroom("제201호관","미래관","etc");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("제202호관","동북아E-biz센터","etc");
        studyroomList.add(studyroom);

        building = new Building("그외 스터디룸", studyroomList);
        buildingList.add(building);

        studyroomList = new ArrayList<Studyroom>();
        studyroom = new Studyroom("미유카페","운영안내","참고자료");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("27호관","운영안내","참고자료");
        studyroomList.add(studyroom);
        studyroom = new Studyroom("11호관","운영안내","참고자료");
        studyroomList.add(studyroom);

        building = new Building("참고자료", studyroomList);
        buildingList.add(building);

    }

    @Override
    public boolean onClose() {
        listAdapter.filterData("");
        expandAll();
        return false;
    }

    @Override
    public boolean onQueryTextChange(String query) {
        listAdapter.filterData(query);
        expandAll();
        return false;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        listAdapter.filterData(query);
        expandAll();
        return false;
    }
}
