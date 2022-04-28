package com.rest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.entity.Appointments;
import com.rest.api.entity.Doctors;
import com.rest.api.entity.Users;
import com.rest.api.exception.EntityException;
import com.rest.api.repo.AppointmentRepository;
import com.rest.api.repo.DoctorsRepository;
import com.rest.api.repo.UsersRepository;

@RestController
@RequestMapping("/api")
public class MainController {

	@Autowired
	private UsersRepository usersRepo;
	@Autowired
	private DoctorsRepository doctorsRepo;
	@Autowired
	private AppointmentRepository appointmentRepo;

	// Get All users
	@GetMapping("/users")
	public List<Users> getAllUsers() {
		return usersRepo.findAll();

	}

	// Get All doctors
	@GetMapping("/doctors")
	public List<Doctors> getAllDoctors() {
		return doctorsRepo.findAll();

	}

	// Get All appointments
	@GetMapping("/appointments")
	public List<Appointments> getAllAppointments() {
		return appointmentRepo.findAll();

	}

	// Create a new Users
	@PostMapping("/users")
	public Users createUser(@RequestBody Users user) {
		return usersRepo.save(user);
	}

	// Create a new Doctors
	@PostMapping("/doctors")
	public Doctors createDoctor(@RequestBody Doctors doctor) {
		return doctorsRepo.save(doctor);
	}

	// Create a new Appointment
	@PostMapping("/appointments")
	public Appointments createAppointment(@RequestBody Appointments app) {
		return appointmentRepo.save(app);
	}

	// Get a Single user
	@GetMapping("/users/{id}")
	public Users getUserById(@PathVariable(value = "id") int id) {
		return usersRepo.findById(id).orElseThrow(() -> new EntityException("Users", "id", id));
	}

	// Get a Single doctor
	@GetMapping("/doctors/{id}")
	public Doctors getDoctorById(@PathVariable(value = "id") int id) {
		return doctorsRepo.findById(id).orElseThrow(() -> new EntityException("Doctors", "id", id));
	}

	// Get a Single appointment
	@GetMapping("/appointments/{id}")
	public Appointments getAppointmentById(@PathVariable(value = "id") int id) {
		return appointmentRepo.findById(id).orElseThrow(() -> new EntityException("Appoinments", "id", id));
	}

	// Update a user
	@PutMapping("/users/{id}")
	public Users updateUser(@PathVariable(value = "id") int id, @RequestBody Users usersDetails) {

		Users user = usersRepo.findById(id).orElseThrow(() -> new EntityException("Users", "id", id));
		user.setFirstName(usersDetails.getFirstName());
		user.setLastName(usersDetails.getLastName());
		user.setAge(usersDetails.getAge());
		user.setDateOfBirth(usersDetails.getDateOfBirth());
		user.setInsuranceProvider(usersDetails.getInsuranceProvider());
		user.setInsuranceNumber(usersDetails.getInsuranceNumber());
		user.setAllergies(usersDetails.getAllergies());
		user.setMedications(usersDetails.getMedications());
		user.setAddress(usersDetails.getAddress());
		user.setLungCharts(usersDetails.getLungCharts());
		user.setHeartCharts(usersDetails.getHeartCharts());
		user.setMedicalHistory(usersDetails.getMedicalHistory());
		user.setCurrentIssues(usersDetails.getCurrentIssues());
		user.setPhoneNumber(usersDetails.getPhoneNumber());

		Users updatedUser = usersRepo.save(user);
		return updatedUser;
	}

	// Update a doctor
	@PutMapping("/doctors/{id}")
	public Doctors updateDoctor(@PathVariable(value = "id") int id, @RequestBody Doctors doctorsDetails) {

		Doctors doctor = doctorsRepo.findById(id).orElseThrow(() -> new EntityException("Doctors", "id", id));
		doctor.setFirstName(doctorsDetails.getFirstName());
		doctor.setLastName(doctorsDetails.getLastName());
		doctor.setAddress(doctorsDetails.getAddress());
		doctor.setPhoneNumber(doctorsDetails.getPhoneNumber());

		Doctors updatedDoctor = doctorsRepo.save(doctor);
		return updatedDoctor;
	}

	// Update a appointment
	@PutMapping("/appointments/{id}")
	public Appointments updateAppointment(@PathVariable(value = "id") int id, @RequestBody Appointments details) {

		Appointments appointment = appointmentRepo.findById(id)
				.orElseThrow(() -> new EntityException("Appointments", "id", id));
		appointment.setDoctorId(details.getDoctorId());
		appointment.setUserId(details.getUserId());
		appointment.setAppointmentDate(details.getAppointmentDate());

		Appointments updatedAppointment = appointmentRepo.save(appointment);
		return updatedAppointment;
	}

	// Delete a user
	@DeleteMapping("/users/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable(value = "id") int id) {
		Users user = usersRepo.findById(id).orElseThrow(() -> new EntityException("Users", "id", id));

		usersRepo.delete(user);

		return ResponseEntity.ok().build();
	}

	// Delete a doctor
	@DeleteMapping("/doctors/{id}")
	public ResponseEntity<?> deleteDoctor(@PathVariable(value = "id") int id) {
		Doctors doctor = doctorsRepo.findById(id).orElseThrow(() -> new EntityException("Doctors", "id", id));

		doctorsRepo.delete(doctor);

		return ResponseEntity.ok().build();
	}

	// Delete a appointment
	@DeleteMapping("/appointments/{id}")
	public ResponseEntity<?> deleteAppointment(@PathVariable(value = "id") int id) {
		Appointments app = appointmentRepo.findById(id)
				.orElseThrow(() -> new EntityException("Appointments", "id", id));

		appointmentRepo.delete(app);

		return ResponseEntity.ok().build();
	}
}