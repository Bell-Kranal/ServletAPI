<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/hello" method="POST">
    <input type="text" placeholder="Name" name="name">
    <input type="text" placeholder="Password" name="password">
    <input type="submit" value="Sign in">
    <button><a href="${pageContext.request.contextPath}/registration.jsp">Sign up</a></button>
  </form>
  </body>
</html>
