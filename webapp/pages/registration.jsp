<%--
  Created by IntelliJ IDEA.
  User: serjd
  Date: 06.10.2016
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form name="registrForm" method="get" action="registrServlet">


    FirstName: <input type="text" name="firstname"/><br/>

    SecondName: <input type="text" name="secondname"/><br/>
    Birthday: Year: <input type="text" name="year"/>
              Month: <input type="text" name="month"/>
              Day: <input type="text" name="day"/> <br/>
    Email: <input type="email" name="email"/><br/>
    Password: <input type="password" name="password"/><br/>
    Password2: <input type="password" name="password2"/>
    <input type="submit" value="Registrate">
</form>
</body>
</html>
