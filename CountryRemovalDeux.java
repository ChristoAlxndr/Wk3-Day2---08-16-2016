package com.project;

import java.io.*;

import java.nio.file.*;
import java.util.ArrayList;

public class CountryRemovalDeux {
	
	Path readWriteFile = Paths.get("\\Users\\admin\\workspace\\newWorkspace\\WEEK3DAY2-REVIEWDAY"
			+ "\\src\\com\\project\\lilstedCountries.txt");
	File countriesFile = readWriteFile.toFile();
	
	public ArrayList<String> loadCountriesMethod () {
		
		ArrayList <String> listedCountries = new ArrayList <>();
		
		try
		(BufferedReader reader = new BufferedReader(new FileReader(countriesFile))) {
			String aCountry;
			
			while ((aCountry = reader.readLine())!= null) {
				listedCountries.add(aCountry);
			}
		}
			catch (IOException iOException) {
				iOException.printStackTrace();
			}
		return listedCountries;
	}
	
	public void overwriteCountryListMethod(ArrayList<String>countriesListed) {
		
		try
			(PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(countriesFile)))) {
				
			for (int i = 0; i < countriesListed.size(); i++) {
				writer.println(countriesListed.get(i));
			}
		}
			catch (IOException iOException) {
				iOException.printStackTrace();
			} // Close Catch
	}
}