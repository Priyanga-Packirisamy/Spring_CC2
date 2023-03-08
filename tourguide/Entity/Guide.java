package com.priyanga.tourguide.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "guide_details")
public class Guide {
	
	@Id
	@Column(name="guideno")
	private int guideno;
	
	@Column(name="guidename")
	private String guidename;
	
	@Column(name="locality")
	private String locality;
	
	@Column(name="language")
	private String language;
	
	@Column(name="driver")
	private String driver;

	public Guide(int guideno, String guidename, String locality, String language, String driver) {
		super();
		this.guideno = guideno;
		this.guidename = guidename;
		this.locality = locality;
		this.language = language;
		this.driver = driver;
	}
	
	public Guide() {
		
	}

	public int getGuideno() {
		return guideno;
	}

	public void setGuideno(int guideno) {
		this.guideno = guideno;
	}

	public String getGuidename() {
		return guidename;
	}

	public void setGuidename(String guidename) {
		this.guidename = guidename;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

}
