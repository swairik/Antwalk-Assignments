package com.springcore.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student_1")
public class Student {
	@Value("Bruce")
	private String studentName;

	@Value("Gotham")
	private String city;

	@Value("#{aList}")
	private List<String> addresses;

	public Student() {
		super();
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", addresses=" + addresses + "]";
	}

}
