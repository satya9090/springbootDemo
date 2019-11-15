package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table( name="talent_candidate_experience_details" )
public class Talent_candidate_experience {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String candidate_unique_id;
	private String project_name;
	private Date start_date;
	private Date end_date;
	private String technology_used;
	private String description;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getcandidate_unique_id() {
		return candidate_unique_id;
	}
	public void setCandidate_uniqueId(String candidate_unique_id) {
		this.candidate_unique_id = candidate_unique_id;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String gettechnology_used() {
		return technology_used;
	}
	public void setTechnology_used(String technology_used) {
		technology_used = technology_used;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
