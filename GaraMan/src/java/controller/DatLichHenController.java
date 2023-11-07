/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import com.sun.java.swing.plaf.windows.resources.windows;
import static dao.DAO.getConnection;
import dao.DatLichHen682DAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.LichHen682;

/**
 *
 * @author acer
 */
public class DatLichHenController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        try ( PrintWriter out = response.getWriter()) {
//            out.println(request.getParameter("ngay"));
//            out.println(request.getParameter("ghichu"));
//            HttpSession session = request.getSession();
//            int maNguoiDung = (int) session.getAttribute("maNguoiDung");
//            out.println(maNguoiDung);
//            String sql2 = "select maKhachHang from tblkhachhang682 where maNguoiDung=?";
//            try {
//                Connection con = getConnection();
//                PreparedStatement ps2 = con.prepareStatement(sql2);
//                ps2.setInt(1, maNguoiDung);
//                ResultSet rs2 = ps2.executeQuery();
//                String maKhachHang = rs2.getString("maKhachHang");
//                out.println(maNguoiDung);
//                con.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
        try {
            HttpSession session = request.getSession();
            int maNguoiDung = (int) session.getAttribute("maNguoiDung");
            LichHen682 lichhen = new LichHen682();
            Date ngayDatLich = null;
            String ngay = request.getParameter("ngay");
            if (ngay != null && !ngay.isEmpty()) {
                ngayDatLich = Date.valueOf(ngay);
            }
            String ghiChu = request.getParameter("ghichu");
            lichhen.setNgayDatLich(ngayDatLich);
            lichhen.setGhiChu(ghiChu);
            boolean kq = DatLichHen682DAO.luuDatLichHen(lichhen,maNguoiDung);
            if (kq) {
                String script = "<script>alert('Ban da dat lich thanh cong! Ma dat lich cua ban la: " + lichhen.getMaDatlich() + "'); window.location.href='GDKhachHang682.jsp';</script>";
                response.getWriter().print(script);
            } else {
                String script = "<script>alert('Dat lich khong thanh cong! Vui long thu lai sau!'); window.location.href='GDKhachHang682.jsp';</script>";
                response.getWriter().print(script);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
