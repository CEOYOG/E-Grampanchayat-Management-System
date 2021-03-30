package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	private String description;
	private LocalDate fromDate;
	private LocalDate tillDate;
	
	public Event() {
		System.out.println("In constructore of "+getClass().getName());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	

	public Event(String name, String description, LocalDate fromDate, LocalDate tillDate) {
		super();
		this.name = name;
		this.description = description;
		this.fromDate = fromDate;
		this.tillDate = tillDate;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", description=" + description + ", fromDate=" + fromDate
				+ ", tillDate=" + tillDate + "]";
	}
	
	
}
