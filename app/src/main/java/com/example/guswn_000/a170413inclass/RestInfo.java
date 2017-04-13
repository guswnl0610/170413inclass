package com.example.guswn_000.a170413inclass;

/**
 * Created by guswn_000 on 2017-04-13.
 */

public class RestInfo
{
    private String name;
    private String tel;
    private int imgno = 0;

    public RestInfo(String name, String tel, int imgno) {
        this.name = name;
        this.tel = tel;
        this.imgno = imgno;
    }

    public void setData(String name, String tel, int imgno) {
        this.name = name;
        this.tel = tel;
        this.imgno = imgno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getImgno() {
        return imgno;
    }

    public void setImgno(int imgno) {
        this.imgno = imgno;
    }
}
