package com.example.demo.service;

import com.example.demo.model.CandidateInformation;
import com.example.demo.model.Talent_candidate_experience;


public interface serviceInterface {

	public CandidateInformation saveCandidateInformation(CandidateInformation information);
	
	public Talent_candidate_experience saveCandidateExperience(Talent_candidate_experience experience);
}
