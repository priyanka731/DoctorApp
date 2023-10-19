package com.priyanka.DoctorApp.repo;


import com.priyanka.DoctorApp.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentRepo extends JpaRepository<Appointment,Integer> {
}
