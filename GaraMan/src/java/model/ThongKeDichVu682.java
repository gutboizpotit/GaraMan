/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author acer
 */
public class ThongKeDichVu682{
    private String maDichVu;
    private int soLanDat;
    private int tongTien;

    public ThongKeDichVu682(String maDichVu, int soLanDat, int tongTien) {
        this.maDichVu = maDichVu;
        this.soLanDat = soLanDat;
        this.tongTien = tongTien;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
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
}
