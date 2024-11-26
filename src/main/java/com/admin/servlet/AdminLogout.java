package com.admin.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/adminLogout")
public class AdminLogout extends HttpServlet {
	
	

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
                session.removeAttribute("adminObj");
                session.invalidate(); // Invalidate the session
            }
            // Set a success message
            req.setAttribute("sucMsg", "Admin Logout successfully");
        } catch (Exception e) {
            // Handle any exceptions gracefully
            e.printStackTrace();
            req.setAttribute("errorMsg", "An error occurred during logout");
        }
        // Redirect to admin login page
        resp.sendRedirect("admin_login.jsp");
    }
}
