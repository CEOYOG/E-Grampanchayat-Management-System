package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class VillagersMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String firstName;
	private String middleName;
	private String lastName;
	private long 	contact;
	private String gender;
	private LocalDate dateOfBirth;
	private long adharNo;
	
	
	
	
	public VillagersMaster() {
		System.out.println("In constructore of "+getClass().getName());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}



	public VillagersMaster(String firstName, String middleName, String lastName, long contact,
			String gender, LocalDate dateOfBirth, long adharNo) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.contact = contact;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.adharNo = adharNo;
	}

	@Override
	public String toString() {
		return "VillagersMaster [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", contact=" + contact  + ", gender=" + gender + ", dateOfBirth="
				+ dateOfBirth + ", adharNo=" + adharNo + "]";
	}

	
	
	

}
