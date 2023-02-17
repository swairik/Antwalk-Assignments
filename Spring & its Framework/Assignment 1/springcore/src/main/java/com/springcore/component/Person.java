package com.springcore.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person1")
public class Person {
	@Value("1001")
	private int id;

	@Value("Bruce")
	private String name;

	@Value("CEO")
	private String designation;

	@Value("#{contactList}")
	private List<String> contactNo;

	@Value("#{projectList}")
	private List<String> projects;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<String> getContactNo() {
		return contactNo;
	}

	public void setContactNo(List<String> contactNo) {
		this.contactNo = contactNo;
	}

	public List<String> getProjects() {
		return projects;
	}

	public void setProjects(List<String> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", designation=" + designation + ", contactNo=" + contactNo
				+ ", projects=" + projects + "]";
	}

}
