<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: jiangqin
  Date: 17/3/23
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>


<%--@elvariable id="numberOfSessions" type="java.lang.Integer"--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%!
    private static String toString(long timeInterval)
    {
        if (timeInterval < 1_000)
            return "less than one second";
        if (timeInterval < 60_000)
            return (timeInterval / 1_000) + " seconds";
        return "about "+ (timeInterval/60_000)+ " minutes";
    }
%>

<%
    int numberOfsessions = (Integer)request.getAttribute("numberOfSessions");
    @SuppressWarnings("unckecked")
    List<HttpSession> sessions = (List<HttpSession>)request.getAttribute("sessionList");

%>
<html>
<head>
    <title>Customer Support</title>
</head>
<body>
    <a href="<c:url value="/login?logout" />">Logout</a>
    <h2>Sessions</h2>
    There are a total of ${numberOfSessions} active sessions in this application.<br/><br/>
    <%
        long timestamp = System.currentTimeMillis();
        for (HttpSession aSession : sessions){
            out.print(aSession.getId() + " - " + aSession.getAttribute("username"));
            if (aSession.getId().equals(session.getId()))
                out.print(" (you)");
            out.print("- last active "+ toString(timestamp - aSession.getLastAccessedTime()));
            out.println(" ago<br/>");
        }
    %>
</body>
</html>
