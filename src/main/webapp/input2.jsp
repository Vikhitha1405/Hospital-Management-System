<%@page import="com.db.DBConnect" %>
<%@page import="java.sql.Connection" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index Page</title>
<%@include file="component/allcss.jsp"%>


<style type="text/css">
.paint-card{
    box-shadow:0 0 10px 0 rgba(0,0,0,0.3);
    }

</style>



</head>
<body>
<%@include file="component/navbar.jsp"%>




<div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
  </div>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="img/pic1.jpg" class="d-block w-100" alt="..." height="500px">
    </div>
    <div class="carousel-item">
      <img src="img/pic1a.jpg" class="d-block w-100" alt="..." height="500px">
    </div>
    <div class="carousel-item">
      <img src="img/pic2.jpg" class="d-block w-100" alt="..." height="500px">
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>



<div class="container p-3">
<p class="text-center fs-2"> Key Features of our Hospital</p>

<div class="row">
<div class="col-md-8 p-5">
<div class="row">
<div class="col-md-6">
<div class="card paint-card">
<div class="card-body">
<p class="fs-5">Specialized Services</p>
<p>Expert medical care tailored to specific areas such as family medicine,
dermatology,and pediatrics,ensuring clients receive specialized treatment for their needs.</p>
</div>
</div>
</div>

<div class="col-md-6">
<div class="card paint-card">
<div class="card-body">
<p class="fs-5">Experienced Providers</p>
<p>Highly qualified healthcare professionals dedicated to delivering compassionate
care and expertise,ensuring clients are in capable hands.</p>
</div>
</div>
</div>

<div class="col-md-6">
<div class="card paint-card">
<div class="card-body">
<p class="fs-5">Advanced Technology and Facilities</p>
<p>State-of-the-art equipment and modern facilities supporting accurate
diagnoses and effective treatments,providing clients with cutting-edge healthcare solutions.</p>
</div>
</div>
</div>

<div class="col-md-6">
<div class="card paint-card">
<div class="card-body">
<p class="fs-5">Appointment Scheduling</p>
<p>Online booking system enabling clients to schedule appointments conveniently
,minimizing wait times and simplifying the appointment process</p>
</div>
</div>
</div>

</div>


</div>


<div class="col-md-4">
<img alt="" src=" img/B1.jpg ">
</div>


</div>




</div>

<hr>
<div class="container p-2">
<p class="text-center fs-2">Our Team</p>
<div class="row">
<div class="col-md-3">
<div class="card paint-card">
<div class="card-body text-center">
<img src="img/bottom1.jpg" width="250px" height="300px">
<p class="fw-bold fs-5">Dr.Ayra</p>
<p class="fs-7">(CEO & Chairman)</p>

</div>

</div>

</div>
<div class="col-md-3">
<div class="card paint-card">
<div class="card-body text-center">
<img src="img/m1.jpg" width="250px" height="300px">
<p class="fw-bold fs-5">Dr.Siva Kumar</p>
<p class="fs-7">Chief Doctor</p>

</div>

</div>

</div>

<div class="col-md-3">
<div class="card paint-card">
<div class="card-body text-center">
<img src="img/bottom3.jpg" width="250px" height="300px">
<p class="fw-bold fs-5">Dr.Anu</p>
<p class="fs-7">Chief Doctor</p>
</div>
</div>
</div>
<div class="col-md-3">
<div class="card paint-card">
<div class="card-body text-center">
<img src="img/bottom4.jpg" width="250px" height="300px">
<p class="fw-bold fs-5">Dr.Vijesh Kumar</p>
<p class="fs-7">Chief Doctor</p>
</div>
</div>
</div>



</div>
</div>
<%@include file="component/Footer.jsp"%>


	

</body>
</html>