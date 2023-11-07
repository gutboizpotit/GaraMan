/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.NguoiDung682;

/**
 *
 * @author acer
 */
public class NguoiDung682DAO extends DAO {
    public NguoiDung682DAO() {
        super();
    }

    public static boolean kiemtraDangnhap(NguoiDung682 NguoiDung) {
        boolean kq = false;
        String sql = "select * from tblnguoidung682 where taiKhoan = ? and matKhau = ?";
        try {
            Connection con = null;
            con = getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, NguoiDung.getTaiKhoan());
            ps.setString(2, NguoiDung.getMatKhau());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                NguoiDung.setMaNguoiDung(rs.getInt("maNguoiDung"));
                NguoiDung.setVaiTro(rs.getString("vaiTro"));
                NguoiDung.setHoTen(rs.getString("hoTen"));
                kq = true;
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            kq = false;
        }
        return kq;
    }
}
