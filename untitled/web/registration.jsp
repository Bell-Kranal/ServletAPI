<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/" method="POST">
    <input type="text" placeholder="Name" name="name" maxlength="45" required>
    <input type="text" placeholder="Password" name="password" maxlength="45" required>
    <input type="submit" value="Sign up">
  </form>
  </body>
</html>
