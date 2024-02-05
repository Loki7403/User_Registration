<%-- 
    Document   : index
    Created on : 29-Sep-2023, 10:40:20 pm
    Author     : apiiit-rkv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String msg= (String)request.getAttribute("msg");
            if(msg!=null){
                out.print(msg);}
                
        %>
        <form action="user" method="POST">
            <table>
                <tr>
                <td>UserName:</td>
                <td><input type="text" name="name"></td>
                </tr>
                 <tr>
                <td>Email:</td>
                <td><input type="text" name="email"></td>
                </tr>
                 <tr>
                <td>Phone no:</td>
                <td><input type="text" name="phno"></td>
                </tr>
                 <tr>
                
                <td><input type="submit" value="save"></td>
                </tr>
            </table>
            
        </form>
        <a href="user"> view users</a>
        
    </body>
</html>
