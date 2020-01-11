package com.deloitte.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.bean.Appointment;
import com.deloitte.dao.IDoctorDao;


@Transactional
@Service
public class DoctorService implements IDoctorService{
	@Autowired
	IDoctorDao doctorDao;

	@Override
	public List<String> getCategory() {
		// TODO Auto-generated method stub
		return doctorDao.getCategory();
	}

	@Override
	public int addAppointment(Appointment appointment) {
		return doctorDao.addAppointment(appointment);
	}

}
