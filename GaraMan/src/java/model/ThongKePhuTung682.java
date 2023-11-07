/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author acer
 */
public class ThongKePhuTung682{
    private String maPhuTung;
    private int soLanDat;
    private int tongTien;

    public String getMaPhuTung() {
        return maPhuTung;
    }

    public void setMaPhuTung(String maPhuTung) {
        this.maPhuTung = maPhuTung;
    }

    public int getSoLanDat() {
        return soLanDat;
    }

    public void setSoLanDat(int soLanDat) {
        this.soLanDat = soLanDat;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public ThongKePhuTung682(String maPhuTung, int soLanDat, int tongTien) {
        this.maPhuTung = maPhuTung;
        this.soLanDat = soLanDat;
        this.tongTien = tongTien;
    }

}
