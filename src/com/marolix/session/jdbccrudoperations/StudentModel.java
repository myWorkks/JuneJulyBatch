package com.marolix.session.jdbccrudoperations;

public class StudentModel {
	private Long sno;
	private String fatherName;
	private String name;
	private String grade;
	private String mobileNumber;

	public StudentModel(String fatherName, String name, String grade, String mobileNumber) {
		super();
		this.fatherName = fatherName;
		this.name = name;
		this.grade = grade;
		this.mobileNumber = mobileNumber;
	}

	public StudentModel() {
		super();

	}

	public Long getSno() {
		return sno;
	}

	public void setSno(Long sno) {
		this.sno = sno;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
