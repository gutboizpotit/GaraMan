<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function showUpdateMessage() {
                alert("Chức năng hiện đang được cập nhật");
            }
        </script>
    </head>
    <body>
        <button type='button' onclick="showUpdateMessage()">Quản lý thông tin dịch vụ phụ tùng</button>
        <button type='button' onclick="window.location.href='GDThongKe682.jsp'">Xem báo cáo thống kê</button>
    </body>
</html>
