<%--
  Created by IntelliJ IDEA.
  User: jiangqin
  Date: 17/3/15
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%!
    private static final String DEFAULT_USER = "Guest";
%>

<%
    String user = request.getParameter("user");
    if (user == null)
        user = DEFAULT_USER;
%>
<html>
<head>
    <title></title>
</head>
<body>
Hello, <%= user %>!<br/> <br/>
xxxx

<form action="greeting.jsp" method="post">
    Enter your name :<br/>
    <input type="text" name="user"/><br/>
    <input type="submit" value="Submit">
</form>
</body>
</html>
