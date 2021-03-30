package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;




@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Application {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
		
	
	@OneToOne
	@JoinColumn(name = "document_id")
	private Document document;
	
	
	@ManyToOne(cascade = {CascadeType.MERGE},fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToOne
	@JoinColumn(name = "bill_id")
	private Bill bill;
	
	private String firstName;
	private String middleName;
	private String lastName;
	private LocalDate dateOfBithorDeath;
	private String relationWithApplicant;
	private LocalDate dateOfIssue;
	private String isValidUser;
	private String status;
	
	public void addUser(User u)
	{
		
		u.getApplication().add(this);
	}
	public void removeUser(User u)
	{
		
		u.getApplication().add(null);
	}
//	public void addDocument(Document d)
//	{
//		
//		d.getApplication().add(this);
//	}
//	public void removeDocument(Document d)
//	{
//		
//		d.getApplication().add(null);
//	}
	public Application() {
		System.out.println("In constructore of "+getClass().getName());
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
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
	public LocalDate getDateOfBithorDeath() {
		return dateOfBithorDeath;
	}
	public void setDateOfBithorDeath(LocalDate dateOfBithorDeath) {
		this.dateOfBithorDeath = dateOfBithorDeath;
	}
	public String getRelationWithApplicant() {
		return relationWithApplicant;
	}
	public void setRelationWithApplicant(String relationWithApplicant) {
		this.relationWithApplicant = relationWithApplicant;
	}
	public LocalDate getDateOfIssue() {
		return dateOfIssue;
	}
	public void setDateOfIssue(LocalDate dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	public String getIsValidUser() {
		return isValidUser;
	}
	public void setIsValidUser(String isValidUser) {
		this.isValidUser = isValidUser;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
	@Override
	public String toString() {
		return "Application [id=" + id + ", document=" + document + ", user=" + user + ", bill=" + bill + ", firstName="
				+ firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", dateOfBithorDeath="
				+ dateOfBithorDeath + ", relationWithApplicant=" + relationWithApplicant + ", dateOfIssue="
				+ dateOfIssue + ", isValidUser=" + isValidUser + ", status=" + status + "]";
	}
	
	
	
}
