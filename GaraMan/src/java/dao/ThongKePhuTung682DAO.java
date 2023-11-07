package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.ThongKePhuTung682;

public class ThongKePhuTung682DAO extends DAO {

    public static List<ThongKePhuTung682> getTKPhuTung(String startDate, String endDate) {
        List<ThongKePhuTung682> result = new ArrayList<>();

        String sql = "SELECT maPhuTung, COUNT(*) AS soLanDat, SUM(doanhThu) AS tongDoanhThu " +
                     "FROM tableDoanhThuPhuTung " +
                     "WHERE ngay BETWEEN ? AND ? " +
                     "GROUP BY maPhuTung";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, startDate);
            ps.setString(2, endDate);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String maPhuTung = rs.getString("maPhuTung");
                int soLanDat = rs.getInt("soLanDat");
                int tongDoanhThu = rs.getInt("tongDoanhThu");
                ThongKePhuTung682 thongKe = new ThongKePhuTung682(maPhuTung, soLanDat, tongDoanhThu);
                result.add(thongKe);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
