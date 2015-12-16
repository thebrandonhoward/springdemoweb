package com.walmart.retailtech.sell.innovationte.springdemoweb.entities;

public class Associate
{
	private String firstname;
	private String lastname;
	private char middleinit;
	private ProgrammingLanguages languages;
	
	public Associate(){};
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public char getMiddleinit() {
		return middleinit;
	}
	public void setMiddleinit(char middleinit) {
		this.middleinit = middleinit;
	}
	public ProgrammingLanguages getLanguages() {
		return languages;
	}

	public void setLanguages(ProgrammingLanguages languages) {
		this.languages = languages;
	}

	@Override
	public String toString() {
		return "Associate [firstname=" + firstname + ", lastname=" + lastname + ", middleinit=" + middleinit
				+ ", languages=" + languages + "]";
	}
	
	
}
