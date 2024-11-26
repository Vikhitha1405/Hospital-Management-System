package com.dao;

import com.entity.Doctor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DoctorDao {
    private Connection conn;

    public DoctorDao(Connection conn) {
        this.conn = conn;
    }
    
    public boolean registerDoctor(Doctor d) {
        boolean f = false;
        try {
            String sql = "INSERT INTO doctor(full_name, dob, qualification, specialist, email, mobno, password) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, d.getFullName());
            ps.setString(2, d.getDob());
            ps.setString(3, d.getQualification());
            ps.setString(4, d.getSpecialist());
            ps.setString(5, d.getEmail());
            ps.setString(6, d.getMobNo());
            ps.setString(7, d.getPassword());
            int i = ps.executeUpdate();
            if (i == 1) {
                f = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public List<Doctor> getAllDoctor() {
        List<Doctor> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM doctor ORDER BY id DESC";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Doctor d = new Doctor();
                d.setId(rs.getInt(1));
                d.setFullName(rs.getString(2));
                d.setDob(rs.getString(3));
                d.setQualification(rs.getString(4));
                d.setSpecialist(rs.getString(5));
                d.setEmail(rs.getString(6));
                d.setMobNo(rs.getString(7));
                d.setPassword(rs.getString(8));
                list.add(d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Doctor login(String email, String psw) {
        Doctor d = null;
        try {
            String sql = "SELECT * FROM doctor WHERE email=? AND password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, psw);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                d = new Doctor();
                d.setId(rs.getInt(1));
                d.setFullName(rs.getString(2));
                d.setDob(rs.getString(3));
                d.setQualification(rs.getString(4));
                d.setSpecialist(rs.getString(5));
                d.setEmail(rs.getString(6));
                d.setMobNo(rs.getString(7));
                d.setPassword(rs.getString(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return d;
    }
    
    public Doctor getDoctorById(int doctorId) {
        Doctor doctor = null;
        String sql = "SELECT * FROM doctor WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, doctorId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                doctor = new Doctor();
                doctor.setId(rs.getInt("id"));
                doctor.setFullName(rs.getString("full_name"));
                doctor.setDob(rs.getString("dob"));
                doctor.setQualification(rs.getString("qualification"));
                doctor.setSpecialist(rs.getString("specialist"));
                doctor.setEmail(rs.getString("email"));
                doctor.setMobNo(rs.getString("mobno"));
                doctor.setPassword(rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return doctor;
    }
    
    
    public int countDoctor()
    {
    	int i=0;
    	try
    	{
    		
    		String sql="select * from  doctor";
    		PreparedStatement ps=conn.prepareStatement(sql);
    		ResultSet rs=ps.executeQuery();
    		while(rs.next())
    		{
    			i++;
    		}
    		
    	} catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    	
    	return i;
    }
    
    public int countAppointment()
    {
    	int i=0;
    	try
    	{
    		
    		String sql="select * from  appointment";
    		PreparedStatement ps=conn.prepareStatement(sql);
    		ResultSet rs=ps.executeQuery();
    		while(rs.next())
    		{
    			i++;
    		}
    		
    	} catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    	
    	return i;
    }
    
    
    public int countAppointmentByDoctorId(int did)
    {
    	int i=0;
    	try
    	{
    		
    		String sql="select * from  appointment where doctor_id=?";
    		PreparedStatement ps=conn.prepareStatement(sql);
    		ps.setInt(1, did);
    		ResultSet rs=ps.executeQuery();
    		while(rs.next())
    		{
    			i++;
    		}
    		
    	} catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    	
    	return i;
    }
    public int countUser()
    {
    	int i=0;
    	try
    	{
    		
    		String sql="select * from user_details ";
    		PreparedStatement ps=conn.prepareStatement(sql);
    		ResultSet rs=ps.executeQuery();
    		while(rs.next())
    		{
    			i++;
    		}
    		
    	} catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    	
    	return i;
    }
    
}
