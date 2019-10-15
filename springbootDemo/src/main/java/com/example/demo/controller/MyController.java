package com.example.demo.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.StudentDetails;
import com.example.demo.service.serviceInterface;

@Controller
public class MyController {

	@Autowired
	serviceInterface service;

	@RequestMapping("/login")
	public String welcome(Map<String, Object> model) {

		return "welcome";
	}

	@RequestMapping(value = "/studentRegistration", method = RequestMethod.POST)
	public @ResponseBody StudentDetails addEmployee(@ModelAttribute StudentDetails details, HttpSession session,
			HttpServletRequest request, ModelMap map) {
		System.out.println(details.getFullName());
		StudentDetails detail=service.saveDetails(details);
		

		return details;
	}
}