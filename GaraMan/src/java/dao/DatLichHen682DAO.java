/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.LichHen682;

/**
 *
 * @author acer
 */
public class DatLichHen682DAO extends DAO {

    public static boolean luuDatLichHen(LichHen682 lichhen, int maNguoiDung) {
        boolean kq = false;
        int mamoi = 1;
        String sql1 = "select count(*) from tbllichhen682";
        String sql2 = "select maKhachHang from tblkhachhang682 where maNguoiDung=?";
        String sql3 = "insert into tbllichhen682 (maDatLich, maKhachHang, ngayDatLich, ghiChu) values (?, ?, ?, ?)";
        try {
            Connection con = getConnection();
            PreparedStatement ps1 = con.prepareStatement(sql1);
            PreparedStatement ps2 = con.prepareStatement(sql2);
            PreparedStatement ps3 = con.prepareStatement(sql3);
            ResultSet rs1 = ps1.executeQuery();
            if (rs1.next()) {
                mamoi = rs1.getInt(1) + 1;
            }
            ps2.setInt(1, maNguoiDung);
            ResultSet rs2 = ps2.executeQuery();
            if (rs2.next()) {
                String maKhachHang = rs2.getString("maKhachHang");
                ps3.setInt(1, mamoi);
                ps3.setString(2, maKhachHang);
                ps3.setDate(3, lichhen.getNgayDatLich());
                ps3.setString(4, lichhen.getGhiChu());
                int success = ps3.executeUpdate();
                lichhen.setMaDatlich(mamoi);
                if (success > 0) {
                    kq = true;
                }
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }
}
