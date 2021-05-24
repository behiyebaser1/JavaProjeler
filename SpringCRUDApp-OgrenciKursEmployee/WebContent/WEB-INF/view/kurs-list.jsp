<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Kurslar</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>

<body>

	<div id="wrapper">

		<div id="header">

			<h2>Kurs Listeleme</h2>

		</div>

	</div>

	<div id="container">

		<div id="content">

			<table>

				<thead>

					<tr>

						<th>Id</th>
						<th>Kurs Adı</th>
						<th>Saat</th>
						<th>Öğretmen Id</th>
						<th>İşlem</th>


					</tr>
				</thead>

				<tbody>
					<c:forEach items="${kurslar}" var="k">

						<c:url var="updateLink" value="/kurs/kurs-guncelle">

							<c:param name="kursId" value="${k.kursId}" />

						</c:url>

						<c:url var="deleteLink" value="/kurs/kurs-sil">

							<c:param name="kursId" value="${k.kursId}" />

						</c:url>

						<tr>
							<td>${k.kursId}</td>
							<td>${k.kursAdi}</td>
							<td>${k.saat}</td>
							<td>${k.ogretmen.firstName}</td>
							<td><button onclick="window.location.href='${updateLink}'"
									class="update-button">Güncelle</button>

								<button onclick="if (confirm('Siliyoruz, emin misin?')) window.location.href='${deleteLink}'"
									class="delete-button">Sil</button></td>


						</tr>


					</c:forEach>
				</tbody>


			</table>
			<hr>
			<button class="ekle" onclick="window.location.href='kurs-ekle'">Kurs
				Ekle</button>
				<button class="ekle" onclick="window.location.href='anasayfa'">Anasayfa</button>


		</div>

	</div>


</body>




</html>