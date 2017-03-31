<%--
  Created by IntelliJ IDEA.
  User: jiangqin
  Date: 17/3/27
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    application.setAttribute("appAttribute","foo");
    pageContext.setAttribute("pageAttribute","bar");
    session.setAttribute("sessionAttribute","sand");
    request.setAttribute("requestAttribute","castle");
%>
<html>
<head>
    <title>Title</title>
</head>
    Remote Address : ${pageContext.request.remoteAddr} <br/>
    Request URL : ${pageContext.request.requestURL}<br/>
    Session ID : ${pageContext.request.session.id}<br/>
    Application Scope : ${applicationScope["appAttribute"]}<br/>
    Page Scope : ${pageScope["pageAttribute"]}<br/>
    Request Scope: ${requestScope["requestAttribute"]} <br/>
    User Parameter : ${param["user"]}<br/>
    Color Multi-Param: ${fn:join(paramValues["colors"],', ' )}<br/>
    Accept Header : ${header["Accept"]}<br/>
    Session ID Cookie Value : ${cookie["JSESSIONID"].value}<br/>
</body>
</html>
