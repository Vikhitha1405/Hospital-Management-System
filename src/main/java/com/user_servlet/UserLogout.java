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

@WebServlet("/UserLogout")
public class UserLogout extends HttpServlet {
	
	
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logout(req, resp);
    }

   

	 @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        logout(req, resp);
	    }



	private void logout(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            HttpSession session = req.getSession(false); // Don't create a new session if it doesn't exist
            if (session != null) {
                session.removeAttribute("userObj");
                session.invalidate(); // Invalidate the session
            }
            // Set a success message
            req.setAttribute("sucMsg", "User Logout successfully");
        } catch (Exception e) {
            // Handle any exceptions gracefully
            e.printStackTrace();
            req.setAttribute("errorMsg", "An error occurred during logout");
        }
        // Redirect to admin login page
        resp.sendRedirect("User_login.jsp");
    }
}

	
	
	
	
	
	
	
	

