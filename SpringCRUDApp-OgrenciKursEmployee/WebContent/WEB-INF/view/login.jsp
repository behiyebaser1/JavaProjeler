<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/login.css" />
	
	<style>
	.error {
	color: white;
	font-size:15px;}
	</style>

</head>
<body>	
<frm:form action="${pageContext.request.contextPath}/user/login-success"
		method="POST" modelAttribute="userLogin">

<div class="outer-box">
    <div class="login-box">
      <h4 class="login-text">LOGIN</h4>
     
      <center>
      <frm:input  placeholder="Email Address" path="email" />
      <frm:errors path="email" cssClass="error"/>
      <frm:input type="password" placeholder="Password" path="password" />
      <frm:errors path="password" cssClass="error"/>

      <frm:button modelAttribute="error" id="btn-login" value="login">Login</frm:button>
     
      </center>
    </div>
  </div>
  
  </frm:form>
  
  
 
	
	
</body>
</html>