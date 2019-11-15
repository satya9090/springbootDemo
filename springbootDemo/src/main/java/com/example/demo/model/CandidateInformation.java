package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name="talent_candidate_personal_details" )
public class CandidateInformation {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int candidate_id;
	private String candidate_reference_id;
	private String first_name;
	private String middle_name;
	private String last_name;
	private String location_id;
	private Long contact_number;
	private String email_id;
	private String alternate_email_id;
	private String institute_name;
	private String passing_year;
	private String grade;
	private String gender;
	
	
	public int getCandidate_id() {
		return candidate_id;
	}
	public void setCandidate_id(int candidate_id) {
		this.candidate_id = candidate_id;
	}
	public String getcandidate_reference_id() {
		return candidate_reference_id;
	}
	public void setCandidate_uniqeId(String candidate_reference_id) {
		this.candidate_reference_id = candidate_reference_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getlocation_id() {
		return location_id;
	}
	public void setlocation_id(String location_id) {
		this.location_id = location_id;
	}
	public Long getContact_number() {
		return contact_number;
	}
	public void setContact_number(Long contact_number) {
		this.contact_number = contact_number;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getAlternate_email_id() {
		return alternate_email_id;
	}
	public void setAlternate_email_id(String alternate_email_id) {
		this.alternate_email_id = alternate_email_id;
	}
	public String getInstitute_name() {
		return institute_name;
	}
	public void setInstitute_name(String institute_name) {
		this.institute_name = institute_name;
	}
	public String getPassing_year() {
		return passing_year;
	}
	public void setPassing_year(String passing_year) {
		this.passing_year = passing_year;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
	

}
