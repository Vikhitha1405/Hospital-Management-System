package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Appointment;

public class AppointmentDAO {
	
	private Connection conn;

	public AppointmentDAO(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public boolean addAppointment(Appointment ap) {
		boolean f = false;
		
		try {
			String sql = "INSERT INTO appointment(user_id, fullname, gender, appoint_date, email, phno, diseases, doctor_id, address, age, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, ap.getUserId());
			ps.setString(2, ap.getFullName());
			ps.setString(3, ap.getGender());
			ps.setString(4, ap.getAppoinDate());
			ps.setString(5, ap.getEmail());
			ps.setString(6, ap.getPhNo());
			ps.setString(7, ap.getDiseases());
			ps.setInt(8, ap.getDoctorId());
			ps.setString(9, ap.getAddress());
			ps.setString(10, ap.getAge());
			ps.setString(11, ap.getStatus());
			
			int i = ps.executeUpdate();
			if(i == 1) {
				f = true;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return f;	
	}
	
	public List<Appointment> getAllAppointmentByLoginUser(int userId) {
		List <Appointment> list = new ArrayList<Appointment>();
		Appointment ap = null;
		try {
			String sql = "SELECT * FROM appointment WHERE user_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, userId);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				ap = new Appointment();
				ap.setId(rs.getInt(1));
				ap.setUserId(rs.getInt(2));
				ap.setFullName(rs.getString(3));
				ap.setGender(rs.getString(4));
				ap.setAppoinDate(rs.getString(5));
				ap.setEmail(rs.getString(6));
				ap.setPhNo(rs.getString(7));
				ap.setDiseases(rs.getString(8));
				ap.setDoctorId(rs.getInt(9));
				ap.setAddress(rs.getString(10));
				ap.setAge(rs.getString(11));
				ap.setStatus(rs.getString(12));
				list.add(ap);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<Appointment> getAppointDate(String appointmentDate) {
		List<Appointment> appointments = new ArrayList<>();
		try {
			String sql = "SELECT * FROM appointment WHERE appoint_date = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, appointmentDate);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Appointment appointment = new Appointment();
				appointment.setId(rs.getInt("id"));
				appointment.setUserId(rs.getInt("user_id"));
				appointment.setFullName(rs.getString("fullname"));
				appointment.setGender(rs.getString("gender"));
				appointment.setAppoinDate(rs.getString("appoint_date"));
				appointment.setEmail(rs.getString("email"));
				appointment.setPhNo(rs.getString("phno"));
				appointment.setDiseases(rs.getString("diseases"));
				appointment.setDoctorId(rs.getInt("doctor_id"));
				appointment.setAddress(rs.getString("address"));
				appointment.setAge(rs.getString("age"));
				appointment.setStatus(rs.getString("status"));
				appointments.add(appointment);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return appointments;
	}
	public List<Appointment> getAllAppointmentByDoctorLogin(int doctorId) {
		List <Appointment> list = new ArrayList<Appointment>();
		Appointment ap = null;
		try {
			String sql = "SELECT * FROM appointment WHERE doctor_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, doctorId);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				ap = new Appointment();
				ap.setId(rs.getInt(1));
				ap.setUserId(rs.getInt(2));
				ap.setFullName(rs.getString(3));
				ap.setGender(rs.getString(4));
				ap.setAppoinDate(rs.getString(5));
				ap.setEmail(rs.getString(6));
				ap.setPhNo(rs.getString(7));
				ap.setDiseases(rs.getString(8));
				ap.setDoctorId(rs.getInt(9));
				ap.setAddress(rs.getString(10));
				ap.setAge(rs.getString(11));
				ap.setStatus(rs.getString(12));
				list.add(ap);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public Appointment getAppointmentById(int id) {
		
		Appointment ap = null;
		try {
			String sql = "SELECT * FROM appointment WHERE id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				ap = new Appointment();
				ap.setId(rs.getInt(1));
				ap.setUserId(rs.getInt(2));
				ap.setFullName(rs.getString(3));
				ap.setGender(rs.getString(4));
				ap.setAppoinDate(rs.getString(5));
				ap.setEmail(rs.getString(6));
				ap.setPhNo(rs.getString(7));
				ap.setDiseases(rs.getString(8));
				ap.setDoctorId(rs.getInt(9));
				ap.setAddress(rs.getString(10));
				ap.setAge(rs.getString(11));
				ap.setStatus(rs.getString(12));
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return ap;
	}
	public boolean updateCommentStatus(int id,int doctId,String comm)
	{
		boolean f=false;
		try {
			String sql="update appointment set status=? where id=? and doctor_id=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, comm);
			ps.setInt(2, id);
			ps.setInt(3, doctId);
			
			int i=ps.executeUpdate();
			if(i==1)
			{
				f=true;
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return f;

	}
	
	public List<Appointment> getAllAppointment() {
		List <Appointment> list = new ArrayList<Appointment>();
		Appointment ap = null;
		try {
			String sql = "SELECT * FROM appointment order by id desc";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				ap = new Appointment();
				ap.setId(rs.getInt(1));
				ap.setUserId(rs.getInt(2));
				ap.setFullName(rs.getString(3));
				ap.setGender(rs.getString(4));
				ap.setAppoinDate(rs.getString(5));
				ap.setEmail(rs.getString(6));
				ap.setPhNo(rs.getString(7));
				ap.setDiseases(rs.getString(8));
				ap.setDoctorId(rs.getInt(9));
				ap.setAddress(rs.getString(10));
				ap.setAge(rs.getString(11));
				ap.setStatus(rs.getString(12));
				list.add(ap);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
