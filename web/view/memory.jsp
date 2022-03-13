<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 28.02.2022
  Time: 18:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body class="w3-sand">
<div class="w3-container w3-orange w3-right-align">
    <h1>Memory</h1>
</div>
<div class="w3-container w3-left-align w3-margin-bottom w3-padding">
    <div class="w3-card-4">
        <div class="w3-container w3-dark-grey">
            <h2>Calculations</h2>
        </div>
        <%
            ArrayList<String> memory = (ArrayList<String>) request.getAttribute("memory");
            if (memory != null && !memory.isEmpty()) {
                out.println("<ui class=\"w3-u1\">");
                for (String s : memory) {
                    out.println("<li class=\"w3-hover-sand\">" + s + "</li>");
                }
                out.println("</ui>");
            }else out.println("<div class=\"w3-panel w3-red w3-display-container w3-card-4 w3-round\">\n"
                    +
                    "   <span onclick=\"this.parentElement.style.display='none'\"\n" +
                    "   class=\"w3-button w3-margin-right w3-display-right w3-round-large w3-hover-red w3-border w3-border-red w3-hover-border-grey\">×</span>\n" +
                    "   <h5>There are no calculations!</h5>\n" +
                    "</div>");
        %>
    </div>

</div>

<div class="w3-container w3-orange w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-round-large" onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>
