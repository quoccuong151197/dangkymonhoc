package com.example.model;

import java.io.Serializable;

public class MonHoc implements Serializable {
    private String maMH;
    private String TenMH;
    private int soTC;
    private boolean chon;
    private boolean tinhTrang;

    public MonHoc(String maMH, String tenMH, int soTC, boolean chon, boolean tinhTrang) {
        this.maMH = maMH;
        TenMH = tenMH;
        this.soTC = soTC;
        this.chon = chon;
        this.tinhTrang = tinhTrang;
    }

    public MonHoc() {
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return TenMH;
    }

    public void setTenMH(String tenMH) {
        TenMH = tenMH;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    public boolean isChon() {
        return chon;
    }

    public void setChon(boolean chon) {
        this.chon = chon;
    }

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return TenMH;
    }
}
