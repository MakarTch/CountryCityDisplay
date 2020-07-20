package com.cognixia;

import java.util.ArrayList;
import java.util.List;

public class CountryService {
	
	public static List<Country> getCountries(){
		List<Country> countries = new ArrayList<>();
		countries.add(new Country(1, "USA", "Washington D.C", "328,000,000", "English"));
		countries.add(new Country(2, "Canada", "Ottawa", "37,000,000", "French/English"));
		countries.add(new Country(3, "Mexico", "Mexico City", "126,000,000", "Spanish"));
		countries.add(new Country(4, "Russia", "Moscow", "144,000,000", "Russian"));
		return countries;
	}
	
	public static String displayCountries() {
		List<Country> countries = getCountries();
		String displayString = "";
		displayString += "<table border=\"1\" style= \"border-collapse:collapse\"><tr><th> Country Id </th><th> Country Name "
				+ "</th><th>Capital</th><th> Population</th><th> Primary Language </th></tr>";
		for (Country c : countries) {
			displayString += c.toString();
		}
		displayString +="</table>";
		return displayString;
	}
}
