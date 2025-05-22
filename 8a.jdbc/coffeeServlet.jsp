/*8a. Q1. Read all the existing records from the table coffee which is from the database test and insert a
new coffee product into it [Create a table coffee with fields ( id,coffee_name,price)] using HTML and
JSP to get the fields and display the results respectively*/

<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.math.BigDecimal" %>

<%
    String jdbcURL = "jdbc:mysql://localhost:3306/test12";
    String dbUser = "root";
    String dbPassword = "";

    String coffeeName = request.getParameter("coffee_name");
    String priceStr = request.getParameter("price");

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

        // Insert only if data is provided
        if (coffeeName != null && priceStr != null &&
            !coffeeName.trim().isEmpty() && !priceStr.trim().isEmpty()) {
            String insertSQL = "INSERT INTO coffee (coffee_name, price) VALUES (?, ?)";
            pst = conn.prepareStatement(insertSQL);
            pst.setString(1, coffeeName);
            pst.setBigDecimal(2, new BigDecimal(priceStr));
            pst.executeUpdate();
            pst.close();
        }

        // Retrieve and display all coffee records
        String selectSQL = "SELECT * FROM coffee";
        pst = conn.prepareStatement(selectSQL);
        rs = pst.executeQuery();
%>

<!DOCTYPE html>
<html>
<head>
    <title>Coffee Products List</title>
</head>
<body>
    <h2>Coffee Products in Database</h2>
    <table border="1" cellpadding="5" cellspacing="0">
        <tr>
            <th>ID</th>
            <th>Coffee Name</th>
            <th>Price</th>
        </tr>
        <%
            while (rs.next()) {
        %>
        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getString("coffee_name") %></td>
            <td><%= rs.getBigDecimal("price") %></td>
        </tr>
        <%
            }
        %>
    </table>
    <br>
    <a href="index.html">Add another coffee</a>
</body>
</html>

<%
    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (pst != null) pst.close(); } catch (Exception e) {}
        try { if (conn != null) conn.close(); } catch (Exception e) {}
    }
%>
