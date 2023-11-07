<%-- 
    Document   : GDDatLichHen682
    Created on : 31-10-2023, 13:31:57
    Author     : acer
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 style="text-align: center; display: block">Đặt lịch hẹn</h1>
        <form action="datlich" method="post" style="text-align: center; display: block">
            <table>
                <tr>
                    <td>Ngày đặt lịch:</td>
                    <td><input type="date" name="ngay" required></td>
                </tr>
                <tr>
                    <td>Ghi chú:</td>
                    <td><textarea name="ghichu"></textarea></td>
                </tr>
            </table>
            <input type="submit" value="Đặt lịch">
        </form>
        <button type="button" onclick="window.location.href='GDKhachHang682.jsp'" style="text-align: center; display: block">Quay lại</button>
    </body>
</html>
