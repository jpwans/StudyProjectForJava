<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: jiangqin
  Date: 17/3/20
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Cart</title>
</head>
<body>
<h2>View Cart</h2>

<a href="<c:url value="/shop"/>">Product List</a><br/><br/>
<%
    @SuppressWarnings("unchecked")
    Map<Integer,String> products = (Map<Integer,String>)request.getAttribute("products");
    @SuppressWarnings("unchecked")
    Map<Integer, Integer> cart = (Map<Integer, Integer>)session.getAttribute("cart");

    if (cart == null || cart.size() == 0)
        out.println("Your cart is empty");
    else {
        for (int id : cart.keySet())
        {
            out.println(products.get(id) + " (qty: "+cart.get(id)+")<br/>");
        }
    }
%>

<a href="<c:url value="/shop?action=emptyCart" />">Empty Cart</a>
<br /><br /></body>
</html>
