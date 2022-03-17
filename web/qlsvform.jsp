<%-- 
    Document   : qlsvform
    Created on : Mar 14, 2022, 10:06:02 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quan ly sinh vien </title>
    </head>
    <body>
        <form action="svlqlSV" method="post">
            Ma sinh vien <input type='text' name='parmasv'><br>
           Ho dem: <input type='text' name='parhodem'><br>
            ten <input type='text' name='parten'><br>
            dien thoai <input type='text' name='pardt'><br>
            email: <input type='email' name='paremail'><br>
            <input type='submit' name='btnluusv' value='Luu thong tin sinh vien'>
        </form>
    </body>
</html>
