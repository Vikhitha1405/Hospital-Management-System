<%@ page import="com.entity.Doctor"%>
<%@ page import="java.util.List"%>
<%@ page import="com.db.DBConnect"%>
<%@page import="com.dao.DoctorDao"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="../component/allcss.jsp"%>

<style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
</style>
</head>
<body>
	<%@include file="navbar.jsp"%>
	<div class="container-fluid p-5">
		<div class="row justify-content-center">
			<div class="col-md-5">
				<div class="card paint-card">
					<div class="card-body">
						<p class="fs-3 text-center">Add Doctor</p>
						<c:if test="${not empty errorMsg}">
							<p class="fs-3 text-center text-danger">${errorMsg}</p>
							<c:remove var="errorMsg" scope="session" />
						</c:if>
						<c:if test="${not empty sucMsg}">
							<div class="fs-3 text-center text-success" role="alert">${sucMsg}</div>
							<c:remove var="sucMsg" scope="session" />
						</c:if>
						<form action="../addDoctor" method="post">
							<div class="mb-3">
								<label class="form-label">Full Name</label> <input type="text" required name="fullname" class="form-control">
							</div>
							<div class="mb-3">
								<label class="form-label">DOB</label> <input type="date" required name="dob" class="form-control">
							</div>
							<div class="mb-3">
								<label class="form-label">Qualification</label> <input required name="qualification" type="text" class="form-control">
							</div>
							<div class="mb-3">
								<label class="form-label">Specialist</label> <select name="specialist" required class="form-control">
									<option>-- select--</option>
									<option>Dermatologist</option>
									<option>Ophthalmologist</option>
									<option>Orthopedic Surgeon</option>
									<option>Gastroenterologist</option>
									<option>Endocrinologist</option>
									<option>Pediatrician</option>
									<option>Psychiatrist</option>
									<option>Gynecologist</option>
									<option>Urologist</option>
									<option>Rheumatologist</option>
								</select>
							</div>
							<div class="mb-3">
								<label class="form-label">Email</label> <input type="text" required name="email" class="form-control">
							</div>
							<div class="mb-3">
								<label class="form-label">Mob No</label> <input type="text" required name="mobNo" class="form-control">
							</div>
							<div class="mb-3">
								<label class="form-label">Password</label> <input type="password" required name="password" class="form-control">
							</div>
							<button type="submit" class="btn bg-success text-white col-md-12">Submit</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>
