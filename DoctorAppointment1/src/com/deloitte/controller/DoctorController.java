package com.deloitte.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.deloitte.bean.Appointment;
import com.deloitte.service.IDoctorService;

@Controller
public class DoctorController {
	@Autowired
	IDoctorService doctorService;

	List<String> catList = null;
	
	@RequestMapping("/BookAppointment.obj")
	public String getMsg(Model model) {
		Appointment appt = new Appointment();
		model.addAttribute("appointment", appt);
		catList = doctorService.getCategory();
		model.addAttribute("clist",catList);
		return "appointmentForm";

	}
	
	@RequestMapping(value = "/submitappointment.obj")
	public String addappointment(
			@ModelAttribute(value = "appointment") @Valid Appointment appointment,
			BindingResult bindingResult, Model model) {
		//System.out.println(appointment);
		if (bindingResult.hasErrors()) {
			catList = doctorService.getCategory();
			model.addAttribute("clist", catList);
			return "appointmentForm";
		} else {
			int output = doctorService.addAppointment(appointment);
			model.addAttribute("appointmentId", appointment.getId());
			if (output == 1) {
				return "successAdd";
			} else {
				return "appointmentAdded";
			}
		}
	}

}
