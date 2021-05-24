<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


  
    
    İsim: ${personel.ad}<br>
    Soyisim : ${personel.soyad}<br>
    Cinsiyet : ${personel.cinsiyet}<br>
    Email : ${personel.email}<br>
    Adres : ${personel.adres}<br>
    Ehliyet : ${personel.ehliyet}<br>
    
    Başlama tarihi : ${personel.tarih}<br>
    Yabancı dil :<ul>
    <c:forEach var="rec" items="${personel.yabanciDil}">
    <li>${rec }</li>
    </c:forEach>
    
    </ul> <br>
    düzey : ${personel.duzey}<br>
    Okul : ${personel.okul}<br>
    Başvurulan Pozisyon : ${personel.pozisyon}<br>
   
    
   
    
</body>
</html>