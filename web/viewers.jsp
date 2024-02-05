<%-- 
    Document   : viewers
    Created on : 29-Sep-2023, 11:23:53 pm
    Author     : apiiit-rkv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="index.jsp"> add one more</a>
        <table border="1">
            <thead>
                <tr>
                    <td>S.NO</td>
                     <td>Name</td>
                     <td>Email</td>
                     <td>Phone no</td>
                     <td>Action</td>

                </tr>
            </thead>
            <tbody>
           <c:forEach items="${users}" var="user" varStatus="index">
    <tr>
        <td>${index.count}</td>
        <td>${user.userName}</td>
        <td>${user.userEmail}</td>
        <td>${user.userPh}</td>
        <td>
            <a href="#">Edit</a> &nbsp;
            <a href="#">Delete</a>
        </td>
    </tr>
</c:forEach>

            </tbody>
        </table>
    </body>
</html>
