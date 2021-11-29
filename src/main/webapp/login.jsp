<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="login.css">
</head>
<body>
<div class="login">
  <div class="login-triangle"></div>
  
  <h2 class="login-header">Log in</h2>

  <form class="login-container" action="/login">
    <p><input type="text" name="username" placeholder="Username" required/></p>
    <p><input type="password" name="password" placeholder="Password" required/></p>
    <p><input type="submit" value="Log in"></p>
  </form>
  <br>
  <form action="/register">
  	<button type="submit">Register</button>
  </form>
</div>
</body>
</body>
</html>