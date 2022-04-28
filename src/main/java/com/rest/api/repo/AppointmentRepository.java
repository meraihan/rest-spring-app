package com.rest.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.api.entity.Appointments;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointments, Integer> {

}
