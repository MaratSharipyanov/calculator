<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 02.03.2022
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body class="w3-sand">
<div class="w3-container w3-lime w3-right-align">
    <h1>Calculator</h1>
</div>
<div class="w3-container w3-padding">
    <div class="w3-card-4">
        <div class="w3-container w3-left-align w3-dark-grey">
            <h2>Add numbers</h2>
        </div>

        <form method="post" class="w3-selection w3-sand w3-padding">
            <label>Number 1:
                <input type="text" name="first" class="w3-input w3-border w3-round-large" style="width: 30%"><br/>
            </label>

            <label>Function type:
                <input type="text" name="function" class="w3-input w3-border w3-round-large" style="width: 30%"><br/>
            </label>

            <label>Number 2:
                <input type="text" name="second" class="w3-input w3-border w3-round-large" style="width: 30%"><br/>
            </label>

            <button type="submit" class="w3-btn w3-lime w3-round-large w3-margin-bottom">Calculate</button>
        </form>
    </div>

    <%
        if (request.getAttribute("answer") != null) {
            out.println("<div class=\"w3-panel w3-dark-grey w3-display-container w3-card-4 w3-round\">\n" +
                    "   <span onclick=\"this.parentElement.style.display='none'\"\n" +
                    "   class=\"w3-button w3-margin-right w3-display-right w3-round-large w3-hover-dark-grey w3-border w3-border-sand w3-hover-border-lime\">×</span>\n" +
                    "   <h5>"+ request.getAttribute("answer") +"</h5>\n" +
                    "</div>");
        }
    %>
</div>

<div class="w3-container w3-lime w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-round-large" onclick="location.href='/'">Back to main</button>
</div>

</body>
</html>
