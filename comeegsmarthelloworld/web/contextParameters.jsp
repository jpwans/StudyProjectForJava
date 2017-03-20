<%--
  Created by IntelliJ IDEA.
  User: jiangqin
  Date: 17/3/16
  Time: 09:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello User Application</title>
</head>
<body>
    settingOne:<%= application.getInitParameter("settingOne")%>,
    settingTwo:<%= application.getInitParameter("settingTwo")%>
</body>
</html>
