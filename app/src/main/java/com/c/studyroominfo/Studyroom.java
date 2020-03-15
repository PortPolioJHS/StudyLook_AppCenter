package com.c.studyroominfo;

import android.graphics.drawable.Drawable;

public class Studyroom {
    private String code = "";
    private String name = "";
    private String etc = "";

    public Studyroom(String code, String name, String etc) {
        super();
        this.code = code;
        this.name = name;
        this.etc = etc;
    }

    public String getCode() { return code; }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEtc() {
        return etc;
    }
    public void setEtc(String etc) {
        this.etc = etc;
    }

}
