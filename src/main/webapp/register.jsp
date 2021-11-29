<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel="stylesheet" href="login.css">
</head>
<body>
<div class="login">
  <div class="login-triangle"></div>
  
  <h2 class="login-header">Register</h2>

  <form class="login-container" action="/registered">
    <p><input type="text" name="username" placeholder="Username"></p>
    <p><input type="password" name="password" placeholder="Password"></p>
    <p><input type="submit" value="Register"></p>
  </form>
  <br>
  <form action="/">
  	<button type="submit">Login</button>
  </form>
</div>
</body>
</body>
</html>