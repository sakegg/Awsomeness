<%-- 
 *
 * @Authors Anders Al-saffar, René Andreasen, Farukh Akhtar.
 *
--%>


<%@page import="servlets.MyServlet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css">
        <title>Mikes Minature Models</title>
    </head>
    <body>
      
        
         <%= MyServlet.loginInfo() %>  
        
    </body>
</html>
