<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee List</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Employee List</h2>
		</div>

	</div>


	<div id="conteiner">
		<div id="content">
		
		   <form action="<c:url value="/employee/search"></c:url>">
		   <input type="text" name="freeText" placeholder="Enter Text to Search">
		   <button>Search</button>
		   </form>
		   <br>
		
		</form>
			<table>
				<thead>
					<tr>
						<th>Employee Id</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
						<th>Phone Number</th>
						<th>Hire Date</th>
						<th>Job</th>
						<th>Salary</th>
						<th>Commission Percent</th>
						<th>Manager</th>
						<th>Department</th>
						<th>İşlem</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${employee}" var="employee">
					
					<c:url var="updateLink" value="/employee/calısan-guncelle">

							<c:param name="employeeId" value="${employee.employeeId}" />

						</c:url>

						<c:url var="deleteLink" value="/employee/calısan-sil">

							<c:param name="employeeId" value="${employee.employeeId}" />

						</c:url>

						<tr>
							<td>${employee.employeeId}</td>
							<td>${employee.firstName}</td>
							<td>${employee.lastName}</td>
							<td>${employee.email}</td>
							<td>${employee.phoneNumber}</td>
							<td>${employee.hireDate}</td>
							<td>${employee.job.jobTitle}</td>
							<td>${employee.salary}</td>
							<td>${employee.commissionPercent}</td>
							<td>${employee.manager.firstName}</td>
							<td>${employee.department.departmentName}</td>
                            <td>
                            
                            <button onclick="window.location.href='${updateLink}'"
									class="update-button">Güncelle</button>

								<button
									onclick="if (confirm('Siliyoruz, emin misin?')) window.location.href='${deleteLink}'"
									class="delete-button">Sil</button></td>
								

						</tr>
					</c:forEach>
				</tbody>
			</table>
			<br>
			
			<button class="ekle" onclick="window.location.href='calısan-ekle'">Çalışan Ekle</button>
			<button class="ekle" onclick="window.location.href='anasayfa'">Anasayfa</button>
		</div>

	</div>
</body>
</html>