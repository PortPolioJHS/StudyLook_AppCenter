package com.c.studyroominfo;

import java.util.ArrayList;

public class Building {
    private String name="";
    private ArrayList<Studyroom> studyroomList = new ArrayList<Studyroom>();

    public Building(String name, ArrayList<Studyroom> studyroomList) {
        super();
        this.name = name;
        this.studyroomList = studyroomList;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Studyroom> getStudyroomList() {
        return studyroomList;
    }
    public void setStudyroomList(ArrayList<Studyroom> studyroomList) {
        this.studyroomList = studyroomList;
    };


}
