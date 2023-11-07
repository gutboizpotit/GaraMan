<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <script>
            function showUpdateMessage() {
                alert("Chức năng hiện đang được cập nhật");
            }
        </script>
    <body>
        <button type='button' onclick="window.location.href='GDThongKeDichVuPhuTung682.jsp'">Thống kê dịch vụ, phụ tùng</button>
        <button type='button' onclick="showUpdateMessage()">Thống kê khách hàng</button>
        <button type='button' onclick="showUpdateMessage()">Thống kê nhà cung cấp</button>
    </body>
</html>
