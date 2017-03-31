<%@ page import="java.util.ArrayList" %>
<%@ page import="com.wrox.User" %><%--
  Created by IntelliJ IDEA.
  User: jiangqin
  Date: 17/3/27
  Time: 13:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    ArrayList<User> users = new ArrayList<>();
    users.add(new User(19384L,"Coder314","John","Smith"));
    users.add(new User(19383L,"geek12","Joe","Smith"));
    users.add(new User(19382L,"jack123","Jack","Johnson"));
    users.add(new User(19385L,"farmer-dude","Adam","Finsher"));
    request.setAttribute("users",users);
%>


<html>
<head>
    <title>Collections and Streams</title>
</head>
<body>
${users.stream()
        .filter(u -> fn:contains(u.username, '1'))
        .sorted((u1, u2) -> (x = u1.lastName.compareTo(u2.lastName);
        x == 0 ? u1.firstName.compareTo(u2.firstName) : x))
        .map(u -> {'username':u.username, 'first':u.firstName,
        'last':u.lastName})
        .toList()}
</body>
</html>
