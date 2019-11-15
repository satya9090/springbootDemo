package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.CandidateInformation;
import com.example.demo.model.Talent_candidate_experience;
import com.example.demo.service.serviceInterface;



@Controller
public class MyController {

	@Autowired
	serviceInterface service;

	

	@RequestMapping("/Registration")
	public String registration(Map<String, Object> model) {

		return "Registration";
	}
	// this method use to store candidateInformation in talent_candidate_information

		@RequestMapping(value = "/candidateInformation", method = RequestMethod.POST)
		public @ResponseBody CandidateInformation saveCandidateInformation(@ModelAttribute CandidateInformation information,
				HttpSession session) {
			
			//create random unique id using randomUUID() method..
			UUID uniqueKey = UUID.randomUUID();
			String uniqueId = uniqueKey.toString();
			session.setAttribute("uniqueId", uniqueId);
			
			
			information.setCandidate_uniqeId(uniqueId);
			
			
			return service.saveCandidateInformation(information);
		}
		
		// this method use to store candidateExperience in talent_candidate_experience

		@RequestMapping(value = "/candidateExperience", method = RequestMethod.POST)
		public @ResponseBody Talent_candidate_experience saveCandidateExperience(
				 HttpSession session, HttpServletRequest request) {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			Talent_candidate_experience experience=new Talent_candidate_experience();
			
			try
			{ 
				
				experience.setCandidate_uniqueId(session.getAttribute("uniqueId").toString());
				experience.setProject_name(request.getParameter("project_name"));
				experience.setStart_date(df.parse(request.getParameter("start_date")));
				experience.setEnd_date(df.parse(request.getParameter("end_date")));
				experience.setTechnology_used(request.getParameter("Technology_used"));
				experience.setDescription(request.getParameter("description"));
				
			}catch (Exception e) {
				e.getMessage();
			}
			
			return service.saveCandidateExperience(experience);

		}
}