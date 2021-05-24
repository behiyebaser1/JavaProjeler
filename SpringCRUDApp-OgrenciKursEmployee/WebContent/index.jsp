<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hosgeldiniz</title>
<link type="text/css" rel="stylesheet"/>
<style type="text/css">
body {
  background:#6f92dc;
  text-align:center;
}

@import url(https://fonts.googleapis.com/css?family=Open+Sans:700);



button {
  position:relative;
  margin-top:4%;
  background:#6f92dc;
  border:1px solid white;
  padding:20px;
  font-size:0.9em;
  color:white;
  box-shadow:4px 4px 0px 0px white;
  font-family: 'Open Sans', sans-serif;
  font-weight:700;
  letter-spacing:5px;
  text-transform:uppercase;
  transition: all 300ms ease-in-out;
  left:0; 
  top:0;
}
p{

font-family: 'Open Sans', sans-serif;
 color:white;
 font-weight:700;
  letter-spacing:5px;
  margin-top:15%;
  font-size: 3em;
}

button:hover {
  left:4px;
  top:4px;
  box-shadow:0 0 0 0 white;
}
	</style>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/login"
		method="GET" >


	<p>WELCOME</p>
	<button value="log">LOGIN</button>
	
	</form>
	
	
</body>
</html>