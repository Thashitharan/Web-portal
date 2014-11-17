package com.eyepax.webportal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "service")
public class Service implements java.io.Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "s_id", unique = true, nullable = false)
	private int sid;
	
	@Column(name = "name", length=255)
	private String name;
	
	@Column(name = "description", length=255)
	private String description;
	
	@Column(name = "accessURL", length=255)
	private String accessURL;
	
	@Column(name = "port")
	private int port;
	
	@Column(name = "lastUpdatedTime")
	private String lastUpdatedTime;
	
	@Column(name = "isEnabled")
	private boolean isEnabled;
	
	@Column(name = "isDeleted")
	private boolean isDeleted;
	
	@Column(name = "accessCount")
	private int accessCount;
	
	@Column(name = "category", columnDefinition="LONGBLOB")
	private Category category;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
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
	public String getAccessURL() {
		return accessURL;
	}
	public void setAccessURL(String accessURL) {
		this.accessURL = accessURL;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getLastUpdatedTime() {
		return lastUpdatedTime;
	}
	public void setLastUpdatedTime(String lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}
	public boolean isEnabled() {
		return isEnabled;
	}
	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public int getAccessCount() {
		return accessCount;
	}
	public void setAccessCount(int accessCount) {
		this.accessCount = accessCount;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "c_id", nullable = false)
	public Category getCategory() {
		return this.category;
	}
 
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
	
}
