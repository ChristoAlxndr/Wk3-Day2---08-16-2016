package com.project;

import java.util.Scanner;
import com.project.CountriesReadWriteDeux;
import com.project.CountriesValidatorDeux;

public class CountriesDeux {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		CountriesReadWriteDeux cRWD = new CountriesReadWriteDeux();
		CountriesValidatorDeux cVD = new CountriesValidatorDeux();
		
		cRWD.listCountriesMethod();
		
		System.out.println("What would you like to do next? \n (1) Add a country to the list \n (2) Display the list \n "
				+ "(3) Delete a country from the list \n (4) Exit the list");
		
		cVD.entryValidationMethod();
		
		
	}

}
