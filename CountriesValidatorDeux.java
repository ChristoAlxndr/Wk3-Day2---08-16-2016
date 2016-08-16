package com.project;

import java.util.ArrayList;
import java.util.Scanner;

public class CountriesValidatorDeux {

	public void entryValidationMethod () {
		
		Scanner scan = new Scanner(System.in); 
		CountriesReadWriteDeux cRWD = new CountriesReadWriteDeux();
		CountryRemovalDeux cRD = new CountryRemovalDeux();
		
		
		boolean continueListing = true;
		
		do {String userInput = scan.nextLine();
			switch (userInput.toLowerCase()) {
				case "1":
					System.out.println("Please enter a new country to add to the list.");
					String userCountryInput = scan.nextLine();
					cRWD.addCountryMethod(userCountryInput);
					break;
					
				case "2":
					cRWD.listCountriesMethod();
					break;
					
				case "3":
					System.out.println("Please enter a country to delete from the list.");
					String userCountryDelete = scan.nextLine();
					ArrayList <String> listedCountries = cRD.loadCountriesMethod();
					for (int i = 0; i < listedCountries.size(); i++) {
						if(listedCountries.get(i).equals(userCountryDelete)){
							listedCountries.remove(i);
							break;
						}
					}
					cRD.overwriteCountryListMethod(listedCountries);
					break;
					
				case "4":
					CountriesValidatorDeux.continueListing(userInput);
					break;
					
				default:
					System.out.println("You have made an invalid choice.  Please enter '1', '2', '3' or 'x' to exit.");
					break;	
			}
			System.out.println("What would you like to do next? \n (1) Add a country to the list \n (2) Display the list \n "
					+ "(3) Delete a country from the list \n (4) Exit the list");
		}
		while (continueListing = true);
	}
	
	public static boolean continueListing (String userInput) {
		System.out.println("Thank you for exploring.");
		System.exit(0);
		return false;
	}
}
