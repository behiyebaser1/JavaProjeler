<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Başarılı</title>
<style type="text/css">
body {
  background:#6f92dc;
  text-align:center;
}

@import url(https://fonts.googleapis.com/css?family=Open+Sans:700);

p{

   color:white;
  font-family: 'Open Sans', sans-serif;
  font-weight:700;
 
   margin-top:7%;
   text-align: center;

}

a {
  position:relative;
  margin-top:5%;
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
  display: inline-block;
  text-decoration: none;
  
}

a:hover {
  left:4px;
  top:4px;
  box-shadow:0 0 0 0 white;
}
	</style>

</head>
<body>

	<p>Lütfen işlem yapmak istediğiniz tabloyu seçiniz.</p> 
	
	<br>
	<a href="/SpringCRUDApp-OgrenciKursEmployee/ogrenci/list">ÖĞRENCİ</a>
	<br>
	<a href="/SpringCRUDApp-OgrenciKursEmployee/kurs/list">KURS</a>
<br>
	<a href="/SpringCRUDApp-OgrenciKursEmployee/employee/list">EMPLOYEE</a>
</body>
</html>