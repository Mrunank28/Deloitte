package com.deloitte.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.deloitte.bean.Appointment;
import com.deloitte.service.IDoctorService;


@Transactional
@Repository
public class DoctorDao implements IDoctorDao{
	@Autowired
	IDoctorService doctorService;

	List<String> catList = null;
	List<Appointment> alist;

	@PersistenceContext
	EntityManager entityManager;
	Logger logger = Logger.getLogger(DoctorDao.class);
	
	@Override
	public List<String> getCategory() {
		TypedQuery<String> query=null;
		String sql = "SELECT cat.category from Category cat";
		query = entityManager.createQuery(sql, String.class);
		   logger.info("Fetching categories " );
			return query.getResultList();
	}

	@Override
	public int addAppointment(Appointment appointment) {
		System.out.println("DAO : "+appointment);
		try{
		   entityManager.persist(appointment);
		   logger.info("Saved appointment : " + appointment.getName());
		}
		catch(Exception e){
			e.printStackTrace();
			logger.error("Error in inserting data "+e);
		}
		return 1;
	}

}
