package com.app.pojos;

import java.time.LocalDate;


import javax.persistence.*;

@Entity
public class GramPanchayatBody {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String postName;
	private LocalDate fromDate;
	private LocalDate tillDate;
	private String email;
	private String password;
	private boolean isActive;
	
	@OneToOne
	@JoinColumn(name="villager_id")
	private VillagersMaster villager;
	
	public GramPanchayatBody() {
		System.out.println("In constructore of "+getClass().getName());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getTillDate() {
		return tillDate;
	}

	public void setTillDate(LocalDate tillDate) {
		this.tillDate = tillDate;
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

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public VillagersMaster getVillager() {
		return villager;
	}

	public void setVillager(VillagersMaster villager) {
		this.villager = villager;
	}

	public GramPanchayatBody(String postName, LocalDate fromDate, LocalDate tillDate, String email, String password) {
		super();
		this.postName = postName;
		this.fromDate = fromDate;
		this.tillDate = tillDate;
		this.email =    email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "GramPanchayatBody [id=" + id + ", postName=" + postName + ", fromDate=" + fromDate + ", tillDate="
				+ tillDate + ", email=" + email + ", isActive=" + isActive + ", villager=" + villager + "]";
	}
	
	

	
}
