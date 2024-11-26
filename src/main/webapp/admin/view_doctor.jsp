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
		
		
		
			
			
			
			
			
			
		</div>
	</div>
	<div class="col-md-12">
		<div class="card paint-card">
			<div class="card-body">
				<p class="fs-3 text-center"> Doctor Details</p>
				<table class="table">
					<thead>
						<tr>
							<th scope="col">FullName</th>
							<th scope="col">DOB</th>
							<th scope="col">Qualification</th>
							<th scope="col">Specialist</th>
							<th scope="col">Email</th>
							<th scope="col">Mob No</th>
							
						</tr>
					</thead>
					
					
					<tbody>
					
					<%
					
					DoctorDao dao2=new DoctorDao(DBConnect.getConn());
					List<Doctor> list=dao2.getAllDoctor();
					for(Doctor d:list)
					{
						%>
						
						
						<tr>
						<td><%=d. getFullName()%></td>
						<td><%=d.getDob()%></td>
						<td><%=d.getQualification()%></td>
						<td><%=d.getSpecialist()%></td>
						<td><%=d.getEmail()%></td>
						<td><%=d.getMobNo()%></td>
						
						
						<%
					
					}
					%>
					
					
					
					
					
					
					
					
					
					
					
					
					
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>
