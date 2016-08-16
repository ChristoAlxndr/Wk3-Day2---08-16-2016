package com.project;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class CountriesReadWriteDeux {
	
	Scanner scan = new Scanner(System.in);
	
	Path readWriteFile = Paths.get("\\Users\\admin\\workspace\\newWorkspace\\WEEK3DAY2-REVIEWDAY"
			+ "\\src\\com\\project\\lilstedCountries.txt");
	File countriesFile = readWriteFile.toFile();

	
	public void addCountryMethod(String userCountryInput) {
		
		try
			(PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(countriesFile, true)))) {
				writer.println(userCountryInput);
			} //Close PrintWriter
			catch (IOException iOException) {
				iOException.printStackTrace();
			} // Close Catch
			System.out.println(userCountryInput + " has been added to the list. \n\n");
		} //Close Method
	
	
	public void listCountriesMethod () {
		
		System.out.println("List of Countries: \n");
		
		try
		(BufferedReader reader = new BufferedReader(new FileReader(countriesFile))) {
			String listedCountries;
			
			while ((listedCountries = reader.readLine())!= null) {
				System.out.println(listedCountries + "\n");
			}
		}
			catch (IOException iOException) {
				iOException.printStackTrace();
			}
		
	}  //Close Method
	
} // Close Class
