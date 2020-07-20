package com.cognixia;

public class Country {
	
	private int countryId;
	private String countryName;
	private String capital;
	private String population;
	private String primaryLanguage;
	
	public Country(int countryId, String countryName, String capital, String population, String primaryLanguage) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.capital = capital;
		this.population = population;
		this.primaryLanguage = primaryLanguage;
	}

	public int getCountryId() {
		return countryId;
	}

	public String getCapital() {
		return capital;
	}
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getPopulation() {
		return population;
	}

	public String getPrimaryLanguage() {
		return primaryLanguage;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public void setPrimaryLanguage(String primaryLanguage) {
		this.primaryLanguage = primaryLanguage;
	}

	@Override
	public String toString() {
		return "<tr><td>" + countryId + "</td><td>" + countryName + "</td><td>" + capital
				+ "</td><td>" + population + "</td><td>" + primaryLanguage + "</td></tr>";

	}


	
	
	
	
}
