package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer 	id;
	private String 		applicationName;
	private double		 amount;
	private String 		transactionId;
	private LocalDate 	date;
	
	
	
	
	public Bill() {
		System.out.println("In constructore of "+getClass().getName());
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getApplicationName() {
		return applicationName;
	}


	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public String getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}




	


	@Override
	public String toString() {
		return "Bill [id=" + id + ", applicationName=" + applicationName + ", amount=" + amount + ", transactionId="
				+ transactionId + ", date=" + date  + "]";
	}
	
	
}
