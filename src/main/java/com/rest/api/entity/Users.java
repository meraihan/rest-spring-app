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
@Table(name =  "users")
public class Users implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "age")
	private int age;
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	@Column(name = "insurance_provider")
	private String insuranceProvider;
	@Column(name = "insurance_number")
	private int insuranceNumber;
	@Column(name = "allergies")
	private String allergies;
	@Column(name = "medications")
	private String medications;
	@Column(name = "immunizations")
	private String immunizations;
	@Column(name = "address")
	private String address;
	@Column(name = "lung_charts")
	private String lungCharts;
	@Column(name = "heart_charts")
	private String heartCharts;
	@Column(name = "medical_history")
	private String medicalHistory;
	@Column(name = "current_issues")
	private String currentIssues;
	@Column(name = "phone_number")
	private String phoneNumber;

	public Users() {
		// TODO Auto-generated constructor stub
	}

	public Users(int id, String firstName, String lastName, int age, Date dateOfBirth, String insuranceProvider,
			int insuranceNumber, String allergies, String medications, String immunizations, String address,
			String lungCharts, String heartCharts, String medicalHistory, String currentIssues, String phoneNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.insuranceProvider = insuranceProvider;
		this.insuranceNumber = insuranceNumber;
		this.allergies = allergies;
		this.medications = medications;
		this.immunizations = immunizations;
		this.address = address;
		this.lungCharts = lungCharts;
		this.heartCharts = heartCharts;
		this.medicalHistory = medicalHistory;
		this.currentIssues = currentIssues;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getInsuranceProvider() {
		return insuranceProvider;
	}

	public void setInsuranceProvider(String insuranceProvider) {
		this.insuranceProvider = insuranceProvider;
	}

	public int getInsuranceNumber() {
		return insuranceNumber;
	}

	public void setInsuranceNumber(int insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public String getMedications() {
		return medications;
	}

	public void setMedications(String medications) {
		this.medications = medications;
	}

	public String getImmunizations() {
		return immunizations;
	}

	public void setImmunizations(String immunizations) {
		this.immunizations = immunizations;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLungCharts() {
		return lungCharts;
	}

	public void setLungCharts(String lungCharts) {
		this.lungCharts = lungCharts;
	}

	public String getHeartCharts() {
		return heartCharts;
	}

	public void setHeartCharts(String heartCharts) {
		this.heartCharts = heartCharts;
	}

	public String getMedicalHistory() {
		return medicalHistory;
	}

	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}

	public String getCurrentIssues() {
		return currentIssues;
	}

	public void setCurrentIssues(String currentIssues) {
		this.currentIssues = currentIssues;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", dateOfBirth=" + dateOfBirth + ", insuranceProvider=" + insuranceProvider + ", insuranceNumber="
				+ insuranceNumber + ", allergies=" + allergies + ", medications=" + medications + ", immunizations="
				+ immunizations + ", address=" + address + ", lungCharts=" + lungCharts + ", heartCharts=" + heartCharts
				+ ", medicalHistory=" + medicalHistory + ", currentIssues=" + currentIssues + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	
}
