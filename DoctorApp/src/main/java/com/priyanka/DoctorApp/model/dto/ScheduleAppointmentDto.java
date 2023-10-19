package com.priyanka.DoctorApp.model.dto;

import com.priyanka.DoctorApp.model.Appointment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleAppointmentDto {

    AuthenticationInputDto authInfo;
    Appointment appointment;
}
