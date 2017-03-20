<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String[] fruits = request.getParameterValues("fruit");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Hello User Application</title>
</head>
<body>
<h2>Your Selections
</h2>
<%
    if(fruits == null)
    {
%>You did not select any fruits.<%
    }
    else
    {
%><ul><%
    for (String fruit : fruits)
        {
//          out.println("<li>"+fruit+"</li>");
            out.println("<li>"+fruit+"</li>");
        }
%></ul><%
    }
%>

<form action="checkboxesSubmit.jsp" method="POST">
    Select the fruits you like to eat:<br />
    <input type="checkbox" name="fruit" value="Banana" /> Banana<br />
    <input type="checkbox" name="fruit" value="Apple" /> Apple<br />
    <input type="checkbox" name="fruit" value="Orange" /> Orange<br />
    <input type="checkbox" name="fruit" value="Guava" /> Guava<br />
    <input type="checkbox" name="fruit" value="Kiwi" /> Kiwi<br />
    <input type="submit" value="Submit" />
</form>
</body>
</html>
