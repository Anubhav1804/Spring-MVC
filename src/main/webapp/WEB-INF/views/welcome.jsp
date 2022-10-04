<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
   <title>Tennis Player Application</title>
</head>

<body>
<h1>Welcome to Application.</h1>
<h2>Player Name : <i> ${PlayerName} </i> </h2>

<%@page import="java.time.LocalDate"%>
<%
       System.out.println("Hello, This is from JSP, "+ request.getAttribute("PlayerName"));
       LocalDate getCutrrentDate = LocalDate.now();
       System.out.println(getCutrrentDate);
%>

<h1>Tody Date: <%=  getCutrrentDate%></h1>


<form action="/player.do" method="post">
    <label>Player Name</label>
        <input type="text" name="playername" />
        <input type="submit" value="Enter" />
</form>

</body>
</html>



