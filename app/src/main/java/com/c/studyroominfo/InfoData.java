package com.c.studyroominfo;

public class InfoData {
    int iv_info_pic;
    String tv_info_exp;

    public InfoData(int iv_info_pic, String tv_info_exp) {
        this.iv_info_pic = iv_info_pic;
        this.tv_info_exp = tv_info_exp;
    }

    public int getIv_info_pic() {
        return iv_info_pic;
    }

    public void setIv_info_pic(int iv_info_pic) {
        this.iv_info_pic = iv_info_pic;
    }

    public String getTv_info_exp() {
        return tv_info_exp;
    }

    public void setTv_info_exp(String tv_info_exp) {
        this.tv_info_exp = tv_info_exp;
    }
}
