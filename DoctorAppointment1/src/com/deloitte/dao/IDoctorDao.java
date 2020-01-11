package com.deloitte.dao;

import java.util.List;

import com.deloitte.bean.Appointment;

public interface IDoctorDao {

	List<String> getCategory();

	int addAppointment(Appointment appointment);

}
