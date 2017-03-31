<%--@elvariable id="ticketId" type="java.lang.String"--%>
<%--@elvariable id="ticket" type="com.wrox.Ticket"--%>

<%
    String ticketId = (String) request.getAttribute("ticketId");
    Ticket ticket = (Ticket) request.getAttribute("ticket");
%>
<html>
<head>
    <title>Customer Support</title>
</head>
<body>
<a href="<c:url value="/login?logout"/>">Logout</a>
<h2>Ticket # ${ticketId} : ${ticket.subject}
</h2>
<i>Customer Name - ${ticket.customerName}
</i><br/><br/>
${ticket.body} <br/><br/>
<%--<%--%>
    <%--if (ticket.getNumberOfAttachments() > 0) {--%>
<%--%>Attachments: <%--%>
    <%--int i = 0;--%>
    <%--for (Attachment a : ticket.getAttachments()) {--%>
        <%--if (i++ > 0)--%>
            <%--out.print(", ");--%>
                <%--%><a href="--%>
                        <%--<c:url value="/tickets">--%>
                        <%--<c:param name="action" value="download" />--%>
                        <%--<c:param name="ticketId" value="${ticketId}" />--%>
                        <%--<c:param name="attachment" value="<%= a.getName() %>"/>--%>
                        <%--</c:url>--%>
                <%--"><%= a.getName() %>--%>
<%--</a><%--%>
    <%--}--%>
<%--%><br/><br/><%--%>
    <%--}--%>
<%--%>--%>

<c:if test="${ticket.numberOfAttachments > 0}">
    Attachments:
    <c:forEach items="${ticket.attachments}" var="attachment" varStatus="status">
    <c:if test="${!status.first}">, </c:if>
    <a href="<c:url value="/tickets">
            <c:param name="action" value="download"/>
            <c:param name="ticketId" value="${ticketId}"/>
            <c:param name="attachment" value="${attachment.name}"/>
            </c:url>"><c:out value="${attachment.name}" /></a>
    </c:forEach><br/><br/>
</c:if>
<a href="<c:url value="/tickets" />">Return to list tickets</a>
</body>
</html>
