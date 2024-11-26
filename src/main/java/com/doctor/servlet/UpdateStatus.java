package com.doctor.servlet;
import java.io.IOException;

import com.dao.AppointmentDAO;
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
@WebServlet("/UpdateStatus")


public class UpdateStatus extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            int did = Integer.parseInt(request.getParameter("did"));
            String comm = request.getParameter("comm");
            
            AppointmentDAO dao = new AppointmentDAO(DBConnect.getConn());
            HttpSession session = request.getSession();
            
            if (dao.updateCommentStatus(id, did, comm)) {
                session.setAttribute("sucMsg", "Comment Updated");
                response.sendRedirect("doctor/patient.jsp");
            } else {
                session.setAttribute("errorMsg", "Something went wrong on Server");
                response.sendRedirect("doctor/patient.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Handle exception properly, maybe set an error message in session and redirect to error page
            HttpSession session = request.getSession();
            session.setAttribute("errorMsg", "An error occurred while processing your request");
            response.sendRedirect("error.jsp");
        }
    }
}