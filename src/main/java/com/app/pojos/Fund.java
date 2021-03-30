package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class Fund {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String serviceName;
	private double spentAmount;
	private double releasedAmount;
	private LocalDate fromDate;
	private LocalDate tillDate;
	
	public Fund() {
		System.out.println("In constructore of "+getClass().getName());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public double getSpentAmount() {
		return spentAmount;
	}

	public void setSpentAmount(double spentAmount) {
		this.spentAmount = spentAmount;
	}

	public double getReleasedAmount() {
		return releasedAmount;
	}

	public void setReleasedAmount(double releasedAmount) {
		this.releasedAmount = releasedAmount;
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

	public Fund(String serviceName, double spentAmount, double releasedAmount, LocalDate fromDate, LocalDate tillDate) {
		super();
		this.serviceName = serviceName;
		this.spentAmount = spentAmount;
		this.releasedAmount = releasedAmount;
		this.fromDate = fromDate;
		this.tillDate = tillDate;
	}

	@Override
	public String toString() {
		return "Fund [id=" + id + ", serviceName=" + serviceName + ", spentAmount=" + spentAmount + ", releasedAmount="
				+ releasedAmount + ", fromDate=" + fromDate + ", tillDate=" + tillDate + "]";
	}
	
	
}
