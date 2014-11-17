package com.eyepax.webportal.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "c_id", unique = true, nullable = false)
	private int c_id;
	
	@Column(name="name", length=255)
	private String name;

	@Column(name="type", length=255)
	private String type;

	@Column(name="otherDetails", length=255)
	private String otherDetails;
	
	@Column(name = "servicesSet", columnDefinition="LONGBLOB")
	private HashSet<Service> servicesSet = new HashSet<Service>();
	
	//constructors
	public Category() {
	}
 
	public Category(String name, String type, String otherDetails) {
		
		this.name = name;
		this.type = type;
		this.otherDetails = otherDetails;
	}
 
	public Category(String name, String type, String otherDetails, HashSet<Service> servicesList) {
		
		this.name = name;
		this.type = type;
		this.otherDetails = otherDetails;
		this.servicesSet = servicesList;
	}
	
	
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getOtherDetails() {
		return otherDetails;
	}
	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	public HashSet<Service> getServices() {
		return this.servicesSet;
	}
	
	
	public void setServices(HashSet<Service> services) {
		this.servicesSet = services;
	}
	
}
