<%-- 
    Document   : GDDangNhap682.jsp
    Created on : 30-10-2023, 23:01:49
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng nhập</title>
    </head>
    <body>
        <%
             if(request.getParameter("err") !=null && request.getParameter("err").equalsIgnoreCase("timeout")){
        %> <h4>Hết phiên làm việc. Làm ơn đăng nhập lại!</h4><%
             }else if(request.getParameter("err") !=null && request.getParameter("err").equalsIgnoreCase("fail")){
        %> <h4 color="red">Sai tên đăng nhập/mật khẩu!</h4><%
             }
        %>
        <h2 style="text-align: center; display: block"> Đăng nhập </h2>
        <form action="dangnhap"  method="post" >
            <table border="0" style="align-items: center; display: block">
                <tr>
                    <td>Tên đăng nhập:</td>
                    <td><input type="text" name="taikhoan" id="taikhoan" required /></td>
                </tr>
                <tr>
                    <td>Mật khẩu:</td>
                    <td><input type="password" name="matkhau" id="matkhau"
                               required /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Đăng nhập" /></td>
                </tr>
            </table>
        </form>
    </body>
</html>
