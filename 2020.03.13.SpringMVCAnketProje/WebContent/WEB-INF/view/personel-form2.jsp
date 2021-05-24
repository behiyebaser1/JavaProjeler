<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<img src="/images/ilk.png" />
	<h2 align="center">İŞ BAŞVURU FORMU</h2>
	<h3>Eğitim Bilgileri</h3>
	<f:form action="saveform2" method="get" modelAttribute="personel">

         Basvuru Tarihi :<f:input path="tarih" />
		<br />
		<br />
		 Yabanci Dil:<br />
		 <f:checkbox path="yabanciDil" value="ingilizce" />İngilizce<br />
		<f:checkbox path="yabanciDil" value="almanca" />Almanca<br />
		<f:checkbox path="yabanciDil" value="fransızca" />Fransızca<br />
		<f:checkbox path="yabanciDil" value="italyanca" />Italyanca <br/>  
		<br />
		<br />
		 Duzey : 
		 <f:select path="duzey">

			<f:options items="${personel.duzeyler}" />

		</f:select>
		<br />
		<br />
		 En son mezun oldugunuz okul :<f:textarea path="okul" />
		 <br />
		 <br />
		 Basvurulan Pozisyon : 
		 <f:select path="pozisyon">

			<f:options items="${personel.pozisyonlar}" />

		</f:select>
		<br />
		<br />
		
		<input name="Göster" type="submit" />



	</f:form>

</body>
</html>