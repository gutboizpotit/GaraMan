<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thống kê dịch vụ và phụ tùng</title>
    </head>
    <body>
        <h1>Thống kê dịch vụ và phụ tùng</h1>

        <form id="thongKeForm" method="post" action="tkdvpt">
            <!-- Chọn ngày bắt đầu -->
            Ngày bắt đầu: <input type="date" id="startDate" name="startDate">

            <!-- Chọn ngày kết thúc -->
            Ngày kết thúc: <input type="date" id="endDate" name="endDate">

            <!-- Nút thực hiện thống kê -->
            <button type="submit">Thực hiện thống kê</button>
        </form>

        <!-- Bảng thống kê dịch vụ -->
        <h2>Thống kê dịch vụ</h2>
        <table border="1">
            <thead>
                <tr>
                    <th>STT</th>
                    <th>Mã dịch vụ</th>
                    <th>Số lần đặt</th>
                    <th>Tổng doanh thu</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="dichVu" items="${dichVuList}" varStatus="loop">
                <tr>
                    <td><c:out value="${loop.index + 1}" /></td>
                <td><c:out value="${dichVu.maDichVu}" /></td>
                <td><c:out value="${dichVu.soLanDat}" /></td>
                <td><c:out value="${dichVu.tongDoanhThu}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <!-- Bảng thống kê phụ tùng -->
    <h2>Thống kê phụ tùng</h2>
    <table border="1">
        <thead>
            <tr>
                <th>STT</th>
                <th>Mã phụ tùng</th>
                <th>Số lần đặt</th>
                <th>Tổng doanh thu</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="phuTung" items="${phuTungList}" varStatus="loop">
            <tr>
                <td><c:out value="${loop.index + 1}" /></td>
            <td><c:out value="${phuTung.maPhuTung}" /></td>
            <td><c:out value="${phuTung.soLanDat}" /></td>
            <td><c:out value="${phuTung.tongDoanhThu}" /></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
