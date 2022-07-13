package com.example.demo.entitities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicle")
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int vid;
	@Column
	String vname;
	@Column
	int price;
	@Column
	String description;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int vid, String vname, int price, String description) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.price = price;
		this.description = description;
	}
	public Vehicle(String vname, int price, String description) {
		super();
		this.vname = vname;
		this.price = price;
		this.description = description;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
