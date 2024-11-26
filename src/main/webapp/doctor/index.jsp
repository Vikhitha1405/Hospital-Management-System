<%@page import="com.dao.DoctorDao"%>
<%@page import="com.db.DBConnect"%>
<%@page import="com.entity.Doctor"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.paint-card{
    box-shadow:0 0 10px 0 rgba(0,0,0,0.3);
    }

</style>
<%@include file="../component/allcss.jsp"%>
</head>
<body>
	<c:if test="${empty doctObj}">
		<c:redirect url="../Doctor_login.jsp"></c:redirect>
	</c:if>




<%@include file="navbar.jsp"%>
</body>
<p class="text-center fs-3">Doctor Dashboard</p>

<%  
Doctor d=(Doctor)session .getAttribute("doctObj");

DoctorDao dao=new DoctorDao(DBConnect.getConn());

%>

<div class="container p-5">
	<div class="row">
		<div class="col-md-4 offset-md-2">
			<div class="card paint-card">
				<div class="card-body text-center text-success">
					<i class="fas fa-user-md fa-3x"></i> <br>
					<p class="fs-4 text-center">
						Doctor<br><%=dao.countDoctor() %>
					</p>
				</div>
			</div>
		</div>
		
		<div class="col-md-5 ">
			<div class="card paint-card">
				<div class="card-body text-center text-success">
						<i class="fa-solid fa-calendar-check  fa-3x"></i>  <br>
					<p class="fs-4 text-center">
						Total Appointment<br><%=dao.countAppointmentByDoctorId(d.getId()) %>
					</p>
				</div>
			</div>
		</div>

	</div>
</div>
</html>