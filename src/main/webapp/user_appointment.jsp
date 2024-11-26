<%@page import="com.entity.Doctor"%>
<%@page import="com.dao.DoctorDao"%>
<%@page import="com.db.DBConnect"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Appointment</title>
<%@include file="component/allcss.jsp"%>
<style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}

.backImg {
	background: linear-gradient(rgba(0, 0, 0, .4), rgba(0, 0, 0, .4)),
		url("img/A1.jpg");
	height: 30vh;
	width: 100%;
	background-size: cover;
	background-repeat: no-repeat;
}
</style>
<style>
body, html {
	margin: 0;
	padding: 0;
	height: 100%;
}

.background {
	background-image: url("img/A2.jpg");
	background-size: cover;
	background-position: center;
	height: 100%;
	display: flex;
	justify-content: center;
	align-items: center;
}

.content {
	text-align: center;
	color: white;
}
</style>
</head>
<body>
	<%@include file="user/navbar1.jsp"%>
	<div class="container-fluid backImg p-5">
		<p class="text-center fs-2 text-white"></p>
	</div>
	<div class="col-md-6">
		<div class="card paint-card">
			<div class="card-body">
				<p class="text-center fs-3">User Appointment</p>
				<c:if test="${not empty sucMsg }">
<p class="text=center text=success fs-3">${sucMsg}</p>
<c:remove var="sucMsg" scope="session"/>
</c:if>

<c:if test="${not empty errorMsg }">
<p class="text=center text=danger fs-3">${errorMsg}</p>
<c:remove var="errorMsg" scope="session"/>
</c:if>
				
				<form class="row g-3" action="appAppointment" method="post">
					<input type="hidden" name="userid" value="${userObj.id }">
					<div class="col-md-6">
						<label for="inputEmail4" class="form-label">Full Name</label> <input
							required type="text" class="form-control" name="fullname">
					</div>
					<div class="col-md-6">
						<label>Gender</label> <select class="form-control" name="gender"
							required>
							<option value="male">Male</option>
							<option value="female">Female</option>
						</select>
					</div>
					
					<div class="col-md-6">
						<label for="inputEmail4" class="form-label">Appointment
							Date</label> <input required type="date" class="form-control"
							name="appoint_date">
					</div>
					<div class="col-md-6">
						<label for="inputEmail4" class="form-label">Email</label> <input
							required type="email" class="form-control" name="email">
					</div>
					<div class="col-md-6">
						<label for="inputEmail4" class="form-label">Phone No</label> <input
							required maxlength="10" type="number" class="form-control"
							name="phno">
					</div>
					<div class="col-md-6">
						<label for="inputEmail4" class="form-label">Diseases</label> <input
							required type="text" class="form-control" name="Diseases">
					</div>
					<div class="col-md-6">
						<label for="inputPassword4" class="form-label">Doctor</label> <select
							class="form-control" name="doct" required>
							<option value="">--Select--</option>


							<%
							DoctorDao dao = new DoctorDao(DBConnect.getConn());
							List<Doctor> list = dao.getAllDoctor();
							for (Doctor d : list) {
							%>
							<option value="<%=d.getId()%>"><%=d.getFullName()%>  {<%=d.getSpecialist() %>}</option>

							<%
							}
							%>
						</select>
					</div>
					<div class="col-md-6">
						<label>Full Address</label>
						<textarea required name="address" class="form-control" rows="3"
							cols=""></textarea>
					</div>
					<div class="col-md-6">
						<label for="inputEmail4" class="form-label">Age</label> <input
							required type="number" class="form-control" name="age">
					</div>
					
					<c:if test="${not empty userObj }">
					<button class="col-md-6 offset-md-3 btn btn-success">Submit</button>
					</c:if>
				</form>
			</div>
		</div>
	</div>
	<%@include file="component/Footer.jsp"%>
</body>
</html>
