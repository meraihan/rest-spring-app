package com.rest.api.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name =  "appointments")
public class Appointments implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int doctorId;
	@Column(name = "user_id")
	private int userId;
	@Column(name = "appointment_date")
	private Date appointmentDate;
	public Appointments() {
		// TODO Auto-generated constructor stub
	}
	public Appointments(int doctorId, int userId, Date appointmentDate) {
		super();
		this.doctorId = doctorId;
		this.userId = userId;
		this.appointmentDate = appointmentDate;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	@Override
	public String toString() {
		return "Appointments [doctorId=" + doctorId + ", userId=" + userId + ", appointmentDate=" + appointmentDate
				+ "]";
	}

}
