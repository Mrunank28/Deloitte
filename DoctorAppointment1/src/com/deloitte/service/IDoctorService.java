package com.deloitte.service;

import java.util.List;

import com.deloitte.bean.Appointment;

public interface IDoctorService {

	List<String> getCategory();

	int addAppointment(Appointment appointment);

}
