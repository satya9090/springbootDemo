package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.candidateExperienceRepository;
import com.example.demo.dao.candidateInformationRepository;
import com.example.demo.model.CandidateInformation;
import com.example.demo.model.Talent_candidate_experience;
import com.example.demo.service.serviceInterface;


@Service
public class ServiceImpl implements serviceInterface{

	
	@Autowired
	candidateInformationRepository candidateInfo;
	
	@Autowired
	candidateExperienceRepository candidateExperience;
	
	public CandidateInformation saveCandidateInformation(CandidateInformation information) {
		return candidateInfo.save(information);
	}
	
	public Talent_candidate_experience saveCandidateExperience(Talent_candidate_experience experience) {
		return candidateExperience.save(experience);
	}
}
