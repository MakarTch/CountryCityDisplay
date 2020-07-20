package com.cognixia;

import java.util.ArrayList;
import java.util.List;

public class CityService {

	public static List<City> getCities(){
		List<City> cities = new ArrayList<>();
		cities.add(new City(1, "New York City", "USA"));
		cities.add(new City(2, "Seattle", "USA"));
		cities.add(new City(3, "Miami", "USA"));
		cities.add(new City(4, "Las Vegas", "USA"));
		cities.add(new City(5, "Washington D.C", "USA"));
		cities.add(new City(6, "Ottawa", "Canada"));
		cities.add(new City(7, "Toronto", "Canada"));
		cities.add(new City(8, "Vancouver", "Canada"));
		cities.add(new City(9, "Calgary", "Canada"));
		cities.add(new City(10, "Charlottetown", "Canada"));
		cities.add(new City(11, "Mexico City", "Mexico"));
		cities.add(new City(12, "Tijuana", "Mexico"));
		cities.add(new City(13, "Monterrey", "Mexico"));
		cities.add(new City(14, "Moscow", "Russia"));
		cities.add(new City(15, "Kazan", "Russia"));
		cities.add(new City(16, "Samara", "Russia"));
		return cities;
	}
	
	public static String displayCities() {
		List<City> cities = getCities();
		String displayString = "";
		displayString += "<table border=\"1\" style= \"border-collapse:collapse\"><tr><th> City Id </th><th> City Name </th><th>Country Name </th></tr>";
		for (City c : cities) {
			displayString += c.toString();
		}
		displayString +="</table>";
		return displayString;
	}

	public static String displayCitiesInCountry(String country) {
		List<City> cities = getCities();
		String displayString = "";
		displayString += "<table border=\"1\" style= \"border-collapse:collapse\"><tr><th> City Id </th><th> City Name </th><th>Country Name </th></tr>";
		for (City c : cities) {
			if (c.getCountryName().equals(country)) {
				displayString += c.toString();
			}
		}
		displayString +="</table>";
		return displayString;
	}
}
