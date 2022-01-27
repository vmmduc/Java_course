package Exercise_2;

import java.util.Scanner;

public class ManageEastAsiaCountries {
	private static EastAsiaCountries[] AsiaContries;
	private static int numOfArray;

	public ManageEastAsiaCountries() {
		AsiaContries = new EastAsiaCountries[11];
	}

	public int getNumOfArray() {
		return numOfArray;
	}

	// input the information countries in East Asia
	public void addCountryInformation(EastAsiaCountries country) throws Exception {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter country code: ");
			country.setCountryCode(scan.nextLine());
			System.out.println("Enter country name: ");
			country.setCountryName(scan.nextLine());
			System.out.println("Enter total area: ");
			country.setTotalArea(Float.parseFloat(scan.nextLine()));
			System.out.println("Enter country terrain: ");
			country.setCountryTerrain(scan.nextLine());

			AsiaContries[numOfArray] = country;
			numOfArray++;
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	// Display the information of recently entered country
	public EastAsiaCountries getRecentlyEnteredInformation() throws Exception {
		return AsiaContries[numOfArray - 1];
	}

	// Search
	public EastAsiaCountries[] searchInformationByName(String name) throws Exception {

		EastAsiaCountries[] res = new EastAsiaCountries[numOfArray];
		try {
			int n = 0;
			for (int i = 0; i < numOfArray; i++)
				if (AsiaContries[i].getCountryName().equals(name)) {
					res[n] = AsiaContries[i];
					n++;
				}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		return res;
	}

	public EastAsiaCountries[] sortInformationByAscendingOrder() throws Exception {
		EastAsiaCountries[] res = new EastAsiaCountries[numOfArray];
		try {
			EastAsiaCountries temp;
			for (int i = 0; i < numOfArray; i++) {
				for (int j = i + 1; j < numOfArray; j++) {
					if ((AsiaContries[i].getCountryName()).compareTo(AsiaContries[j].getCountryName()) > 0) {
						temp = AsiaContries[i];
						AsiaContries[i] = AsiaContries[j];
						AsiaContries[j] = temp;
					}
				}
			}
			for (int i = 0; i < numOfArray; i++)
				res[i] = AsiaContries[i];
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		return res;
	}
}
