
package com.user_servlet;
import java.io.IOException;

import com.dao.UserDAO;
import com.db.DBConnect;
import com.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/user_register")
public class UserRegister extends HttpServlet {


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		try
		{
			String fullname=req.getParameter("fullname");
			String email=req.getParameter("email");
			String password=req.getParameter("password");
			
			
			User u=new User(fullname,email,password);
			
			
			
		
	
		UserDAO DAO=new UserDAO(DBConnect.getConn());
		
		HttpSession session=req.getSession();
		
	boolean f=	DAO.Register(u);
	
	
	
	if(f)
	{
		session.setAttribute("sucMsg", "Register Successfully");
		resp.sendRedirect("signup.jsp");
		
	}
	else
	{
		session.setAttribute("errorMsg", "something went wrong");
		resp.sendRedirect("signup.jsp");
		
	}
		
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}

	
}
}
