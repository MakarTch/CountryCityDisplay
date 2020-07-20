package com.cognixia;

public class City {
	
	private int cityId;
	private String cityName;
	private String countryName;
	
	public City(int cityId, String cityName, String countryName) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.countryName = countryName;
	}

	public int getCityId() {
		return cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "<tr><td>" + cityId + "</td><td>" + cityName + "</td><td>" +  countryName+ "</td></tr>";
	}
	
	
}
