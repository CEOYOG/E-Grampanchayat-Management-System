package com.app.pojos;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
public class Document {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer docId;
	private String name;
	private String description;

//	@OneToMany(mappedBy = "document", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//	@JsonIgnore
//	@Fetch(FetchMode.JOIN)
//	@Basic(optional = true)
//	private List<Application> applications = new ArrayList<>();
//
//	// helper method
//	public void addApplication(Application a) {
//		applications.add(a);
//		a.setDocument(this);
//	}
//
//	public void removeApplication(Application a) {
//		applications.remove(a);
//		a.setDocument(null);
//	}

	public Document() {
		System.out.println("In constructore of " + getClass().getName());
	}

	public Integer getId() {
		return docId;
	}

	public void setId(Integer id) {
		this.docId = id;
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

//	
//	public List<Application> getApplication() {
//		return applications;
//	}
//
//	public void setApplication(List<Application> application) {
//		this.applications = application;
//	}

	public Document(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Document [id=" + docId + ", name=" + name + ", description=" + description + "]";
	}

}
