package com.rest.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.api.entity.Doctors;

@Repository
public interface DoctorsRepository extends JpaRepository<Doctors, Integer> {

}
