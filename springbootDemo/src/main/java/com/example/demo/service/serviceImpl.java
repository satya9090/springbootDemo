package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DAOinterface;
import com.example.demo.model.StudentDetails;
@Service
public class serviceImpl implements serviceInterface {

	@Autowired
	DAOinterface dao;
	
	public StudentDetails saveDetails(StudentDetails details)
	{
		return dao.save(details);
	}
}
