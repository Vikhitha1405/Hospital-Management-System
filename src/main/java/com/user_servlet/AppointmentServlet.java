package com.user_servlet;
import java.io.IOException;

import com.dao.AppointmentDAO;
import com.dao.UserDAO;
import com.db.DBConnect;
import com.entity.Appointment;
import com.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/appAppointment")

public class AppointmentServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int userId=Integer.parseInt(req.getParameter("userid"));
		String fullname=req.getParameter("fullname");
		String gender=req.getParameter("gender");
		String appoint_date=req.getParameter("appoint_date");
		String email=req.getParameter("email");
		String phno =req.getParameter("phno");
		String diseases=req.getParameter("Diseases");
		int doctor_id=Integer.parseInt(req.getParameter("doct"));
		String address=req.getParameter("address");
		String age=req.getParameter("age");
		
		
		Appointment ap=new Appointment(userId,fullname,gender,appoint_date,email,phno,diseases, doctor_id,address,age,"pending");
		AppointmentDAO dao=new AppointmentDAO (DBConnect.getConn());
		HttpSession session =req.getSession();
		
		if(dao.addAppointment(ap))
		{
			session.setAttribute("sucMsg", "Appointment is booked Successfully");
			resp.sendRedirect("user_appointment.jsp");
		}
		else
		{
			session.setAttribute("errorMsg", "something went wrong");
			resp.sendRedirect("user_appointment.jsp");
		}
		
		
	}
	

}
