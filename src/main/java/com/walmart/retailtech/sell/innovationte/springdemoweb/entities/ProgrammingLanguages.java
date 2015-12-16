package com.walmart.retailtech.sell.innovationte.springdemoweb.entities;

import java.util.ArrayList;
import java.util.List;

public class ProgrammingLanguages
{
	private List<String> languages = new ArrayList<>();

	public String getLanguages() {
		return languages.toString();
	}

	public void setLanguages( String languages ) {
		this.languages.add( languages );
	}

	@Override
	public String toString() {
		return "ProgrammingLanguages [languages=" + languages + ", getLanguages()=" + getLanguages() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
