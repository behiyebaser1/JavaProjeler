<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Kurs Formu</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
	
	<style>
	 body{
	 font-size: 15px;
	
	 }
	</style>
</head>

<body>

	<div id="wrapper">

		<div id="header">

			<h2>Kurs Formu</h2>
			<br>
			<frm:form action="kurs-kaydet" modelAttribute="kurs" method="POST">
                <frm:hidden path="kursId"/>
				<table>

					<tr>
						<td class="td"><label>Kurs Adı</label></td>
						<td><frm:input path="kursAdi" /></td>

					</tr>

					<tr>
						<td class="td"><label>Saat</label></td>
						<td><frm:input path="saat" /></td>

					</tr>

					<tr>
						<td class="td"><label>Öğretmen</label></td>
						<td><frm:select path="ogretmen.ogretmenId">
								<frm:options items="${ögretmenler}" />
							</frm:select></td>
					</tr>


					<tr>
						<td></td>
						<td><frm:button value="save" name="save">Kaydet</frm:button></td>

					</tr>

				</table>


			</frm:form>

		</div>

	</div>

	<div id="container">

		<div id="content"></div>



	</div>





</body>
</html>