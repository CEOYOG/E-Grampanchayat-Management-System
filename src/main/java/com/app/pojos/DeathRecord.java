package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class DeathRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private LocalDate deathDate;
	
	@OneToOne
	@JoinColumn(name="villager_id")
	private VillagersMaster villager ;
	
	public DeathRecord() {
		System.out.println("In constructore of "+getClass().getName());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDeathDate() {
		return deathDate;
	}

	public void setDeathDate(LocalDate deathDate) {
		this.deathDate = deathDate;
	}

	public VillagersMaster getVillager() {
		return villager;
	}

	public void setVillager(VillagersMaster villager) {
		this.villager = villager;
	}

	@Override
	public String toString() {
		return "DeathRecord [id=" + id + ", deathDate=" + deathDate + ", villager=" + villager + "]";
	}
	
	
	
}
