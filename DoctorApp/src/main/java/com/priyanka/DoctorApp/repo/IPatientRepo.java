package com.priyanka.DoctorApp.repo;

import com.priyanka.DoctorApp.model.Patient;
import com.priyanka.DoctorApp.model.enums.BloodGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPatientRepo extends JpaRepository<Patient,Integer> {


    Patient findFirstByPatientEmail(String newEmail);

    List<Patient> findByPatientBloodGroup(BloodGroup bloodGroup);
}
