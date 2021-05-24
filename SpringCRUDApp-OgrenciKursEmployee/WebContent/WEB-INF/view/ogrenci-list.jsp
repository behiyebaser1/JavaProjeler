<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Öğrenciler</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>

<body>

	<div id="wrapper">

		<div id="header">

			<h2>Öğrenci Listeleme</h2>

		</div>

	</div>

	<div id="container">

		<div id="content">

			<table>

				<thead>

					<tr>

						<th>Id</th>
						<th>İsim</th>
						<th>Soyisim</th>
						<th>Ogrenci No</th>
						<th>İşlem</th>


					</tr>
				</thead>

				<tbody>
					<c:forEach items="${ogrenciler}" var="ogrnci">

						<c:url var="updateLink" value="/ogrenci/ogrenci-guncelle">

							<c:param name="ogrenciId" value="${ogrnci.id}" />

						</c:url>

						<c:url var="deleteLink" value="/ogrenci/ogrenci-sil">

							<c:param name="ogrenciId" value="${ogrnci.id}" />

						</c:url>

						<tr>
							<td>${ogrnci.id}</td>
							<td>${ogrnci.isim}</td>
							<td>${ogrnci.soyisim}</td>
							<td>${ogrnci.ogrenciNo}</td>
							<td><button onclick="window.location.href='${updateLink}'"
									class="update-button">Güncelle</button>

								<button onclick="if (confirm('Siliyoruz, emin misin?')) window.location.href='${deleteLink}'"
									class="delete-button">Sil</button></td>


						</tr>


					</c:forEach>
				</tbody>


			</table>
			<hr>
			<button  class="ekle" onclick="window.location.href='ogrenci-ekle'">Öğrenci
				Ekle</button>
				
				<button class="ekle" onclick="window.location.href='anasayfa'">Anasayfa</button>


		</div>

	</div>


</body>




</html>