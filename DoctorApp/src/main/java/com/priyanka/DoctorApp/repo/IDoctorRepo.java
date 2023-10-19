package com.priyanka.DoctorApp.repo;

import com.priyanka.DoctorApp.model.Doctor;
import com.priyanka.DoctorApp.model.enums.Qualification;
import com.priyanka.DoctorApp.model.enums.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IDoctorRepo extends JpaRepository<Doctor,Integer> {
    List<Doctor> findByDocQualificationOrDocSpecialization(Qualification qual, Specialization spec);
}
