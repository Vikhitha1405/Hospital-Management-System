package com.doctor.servlet;
import java.io.IOException;

import com.dao.DoctorDao;
import com.dao.UserDAO;
import com.db.DBConnect;
import com.entity.Doctor;
import com.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/DoctorLogout")



public class DoctorLogout  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(); 
		session.removeAttribute("doctObj");
		 req.setAttribute("sucMsg", "Doctor Logout successfully");
		 System.out.println("Success message set: Doctor Logout successfully");
		 resp.sendRedirect("Doctor_login.jsp");
	}
	

}
