<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<style>
  .error{color:red;}

</style>
</head>
<body>
	<img src="/images/ilk.png" /> 
	<h2 align="center">İŞ BAŞVURU FORMU</h2>
	<h3>Kişisel Bilgiler</h3>
	<f:form action="saveform" method="get" modelAttribute="personel">

         İsim:<f:input path="ad" /><f:errors path="ad" cssClass="error"/>
		 <br />
		 <br />
		 Soyisim:<f:input path="soyad" />
		 <br />
		 <br />
		 Cinsiyet:<f:radiobutton path="cinsiyet" value="K" />Kadin
		 <f:radiobutton path="cinsiyet" value="E" />Erkek
		<br />
		<br />
		 Email:<f:input path="email" />
		 <br />
		 <br />
		 Adres:<f:textarea path="adres" />
		 <br />
		 <br />
		 Ehliyet:<f:radiobutton path="ehliyet" value="V" />Var
		 <f:radiobutton path="ehliyet" value="Y" />Yok
		 <br />
		 <br />
		 
		 <input name="İleri" type="submit" />
		 
		

	</f:form>
	
</body>
</html>