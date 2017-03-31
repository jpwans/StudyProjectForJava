<%@ taglib prefix="fm" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: jiangqin
  Date: 17/3/27
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%--@elvariable id="contacts" type="java.util.Set<com.wrox.Contact>"--%>

<html>
<head>
    <title><fm:message key="title.brower" /></title>
</head>
<body>

<h2><fm:message key="titile.page"/></h2>
<c:choose>
    <c:when test="${fn:length(contacts) == 0}">
        <i><fmt:message key="message.noContacts"/></i>
    </c:when>
    <c:otherwise>
        <c:forEach items="${contacts}" var="contact">
            <b><c:out value="${contact.lastName}, ${contact.firstName}"></c:out></b><br/>
            <c:out value="${contact.address}" ></c:out><br/>
            <c:out value="${contact.phoneNumber}"></c:out><br/>
            <c:if test="${contact.birthday != null}">
                <fm:message key="label.birthday"/>:
                ${contact.birthday.month.getDisplayName('FULL',pageContext.response.locale)}
                &nbsp;
                ${contact.birthday.dayOfMonth}
                <br/>
            </c:if>
            <fm:message key="label.creationDate" />:
            <fm:formatDate value="${contact.oldDateCreated}" type="both" dateStyle="long" timeStyle="long"/>
             <br/><br/>
        </c:forEach>
    </c:otherwise>
</c:choose>
</body>
</html>
