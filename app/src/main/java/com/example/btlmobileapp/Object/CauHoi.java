package com.example.btlmobileapp.Object;

import java.util.ArrayList;

public class CauHoi {
    private int id;
    private String noiDung;
    private String dapAnDung;
    //private ArrayList<String> DapAnSai;
    private String dapAnSai1;
    private String dapAnSai2;
    private String dapAnSai3;
    private int Nhom;

    public String getDapAnSai2() {
        return dapAnSai2;
    }

    public void setDapAnSai2(String dapAnSai2) {
        this.dapAnSai2 = dapAnSai2;
    }

    public String getDapAnSai3() {
        return dapAnSai3;
    }

    public void setDapAnSai3(String dapAnSai3) {
        this.dapAnSai3 = dapAnSai3;
    }

    public String getDapAnSai1() {
        return dapAnSai1;
    }

    public void setDapAnSai1(String dapAnSai1) {
        this.dapAnSai1 = dapAnSai1;
    }



    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getDapAnDung() {
        return dapAnDung;
    }

    public void setDapAnDung(String dapAnDung) {
        this.dapAnDung = dapAnDung;
    }

//    public ArrayList<String> getDapAnSai() {
//        return DapAnSai;
//    }

//    public void setDapAnSai(ArrayList<String> dapAnSai) {
//        this.DapAnSai = dapAnSai;
//    }

    public int getNhom() {
        return Nhom;
    }

    public void setNhom(int nhom) {
        this.Nhom = nhom;
    }
}
