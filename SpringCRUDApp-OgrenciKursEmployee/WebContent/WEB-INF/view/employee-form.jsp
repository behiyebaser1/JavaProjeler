<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Form</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />

<style>
.error {
	color: red;
}

.white{

background-color: #4267B2; 
border:1px solid #4267B2 ;
font-size: 12px;
text-align: left;

}

body{
font-size: 15px;
background-color:  #4267B2;

}
</style>
</head>

<body>

	<div id="wrapper">

		<div id="header">

			<h2>Employee Form</h2>
			<br>
			<frm:form action="calısan-kaydet" modelAttribute="employee"
				method="POST">
				<frm:hidden path="employeeId" />
				<table>

					<tr>
						<td class="td"><label>First Name</label></td>
						<td><frm:input placeholder="First Name" path="firstName" /></td>
						<td class="white"><f:errors path="firstName" cssClass="error"/></td>
					   

					</tr>

					<tr>
						<td class="td"><label>Last Name</label></td>
						<td><frm:input placeholder="Last Name" path="lastName" /></td>
						<td class="white"><f:errors path="lastName" cssClass="error"/></td>

					</tr>

					<tr>

						<td class="td"><label>Email</label></td>
						<td><frm:input placeholder="example@gmail.com" path="email" /></td>
						<td class="white"><f:errors path="email" cssClass="error"/></td>
					</tr>


					<tr>

						<td class="td"><label>Phone Number</label></td>
						<td><frm:input placeholder="xxx.xxx.xxxx" path="phoneNumber" /></td>
						<td class="white"><f:errors path="phoneNumber" cssClass="error"/></td>
						
					</tr>
					<tr>

						<td class="td"><label>Hire Date</label></td>
						<td><frm:input placeholder="dd/mm/yyyy" path="hireDate" /></td>
						<td class="white"><f:errors path="hireDate" cssClass="error"/></td>
					</tr>

					<tr>
						<td class="td"><label>Job</label></td>
						<td><frm:select path="job.jobId">
								<frm:options items="${jobs}" />
							</frm:select></td>
					</tr>

					<tr>

						<td class="td"><label>Salary</label></td>
						<td><frm:input path="salary" /></td>
						<td class="white"><f:errors path="salary" cssClass="error"/></td>
						
					</tr>

					<tr>

						<td class="td"><label>Commission Percent</label></td>
						<td><frm:input path="commissionPercent" /></td>
						<td class="white"><f:errors path="commissionPercent" cssClass="error"/></td>
					</tr>

					<tr>
						<td class="td"><label>Manager</label></td>
						<td><frm:select path="manager.employeeId">
								<frm:options items="${managers}" />
							</frm:select></td>
					</tr>


					<tr>
						<td class="td"><label>Department</label></td>
						<td><frm:select path="department.departmentId">
								<frm:options items="${departments}" />
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