<%-- 
 *
 * @Authors Anders Al-saffar, René Andreasen, Farukh Akhtar.
 *
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css">
        <title>Mikes Minature Model</title>
    </head>
    <body>
        <h1>Login Page.</h1>

        <form name="input" action="MyServlet" method="post">
            Username:<br/> <input type="text" name="LoginName" /> 
            <br/>
            Password:<br/> <input type="password" name="LoginPassword" />
            <br/>
            Benyt cookie: <input type="checkbox" name="checkboxCookie" checked="checked" />
            <br/>
            <input type="submit" value="Login" />
            <br/>         
        </form> 
    </body>
</html>
