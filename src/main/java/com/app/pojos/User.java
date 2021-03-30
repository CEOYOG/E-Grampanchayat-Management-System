package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	private String email;
	private String password;
	private long adharNo;
	private boolean isActive;

	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JsonIgnore
	@Fetch(FetchMode.JOIN)
	@Basic(optional = true)
	private List<Application> applications=new ArrayList<>();
	
	//helper method
	public void addApplication(Application a)
	{
		applications.add(a);
		a.setUser(this);
	}
	public void removeApplication(Application a)
	{
		applications.remove(a);
		a.setUser(null);
	}

	public User() {
		System.out.println("In constructore of " + getClass().getName());
	}

	public Integer getId() {
		return userId;
	}

	public void setId(Integer id) {
		this.userId = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	public List<Application> getApplication() {
		return applications;
	}

	public void setApplication(List<Application> application) {
		this.applications = application;
	}

	@Override
	public String toString() {
		return "User [id=" + userId + ", email=" + email + ", password=" + password + ", adharNo=" + adharNo
				+ ", isActive=" + isActive + ", application=" + applications + "]";
	}

	public User(String email, String password, long adharNo, boolean isActive) {
		super();
		this.email = email;
		this.password = password;
		this.adharNo = adharNo;
		this.isActive = isActive;
	}

}
