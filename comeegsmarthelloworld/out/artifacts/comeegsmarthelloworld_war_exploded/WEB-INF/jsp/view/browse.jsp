<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: jiangqin
  Date: 17/3/20
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Product List</h2>
<a href="<c:url value="/shop?action=viewCart" />">View Cart</a><br /><br />
<%
    @SuppressWarnings("unchecked")
    Map<Integer, String> products =
            (Map<Integer, String>)request.getAttribute("products");

    for(int id : products.keySet())
    {
%><a href="<c:url value="/shop">
                    <c:param name="action" value="addToCart" />
                    <c:param name="productId" value="<%= Integer.toString(id) %>"/>
                </c:url>"><%= products.get(id) %></a><br /><%
    }
%>
</body>
</html>
