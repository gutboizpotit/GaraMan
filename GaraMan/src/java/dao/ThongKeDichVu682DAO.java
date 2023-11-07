/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.ThongKeDichVu682;

/**
 *
 * @author acer
 */
public class ThongKeDichVu682DAO extends DAO {

    public static List<ThongKeDichVu682> getTKDichVu(String startDate, String endDate) {
        List<ThongKeDichVu682> result = new ArrayList<>();

        String sql = "SELECT maDichVu, COUNT(*) AS soLanDat, SUM(giaTien) AS tongDoanhThu "
                + "FROM tbldichvudadat "
                + "WHERE ngay BETWEEN ? AND ? "
                + "GROUP BY maDichVu";

        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, startDate);
            ps.setString(2, endDate);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String maDichVu = rs.getString("maDichVu");
                int soLanDat = rs.getInt("soLanDat");
                int tongDoanhThu = rs.getInt("tongDoanhThu");
                ThongKeDichVu682 thongKe = new ThongKeDichVu682(maDichVu,soLanDat,tongDoanhThu);
                result.add(thongKe);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
