package com.mini.Lulu02_MS1_Sports.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sports")
public class Sports {
	
	@Id
	int id;
	String name;
	float cost;
	public int getId() {
		return id;
	}
	public void setId(long id2) {
		this.id = (int) id2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public Sports() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sports(int id, String name, float cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cost, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sports other = (Sports) obj;
		return Float.floatToIntBits(cost) == Float.floatToIntBits(other.cost) && id == other.id
				&& Objects.equals(name, other.name);
	}
	
	

}
