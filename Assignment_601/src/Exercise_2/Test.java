package Exercise_2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws Exception {
		run();
	}
	
	// Menu handle
	public static int menu() {
		System.out.println("\t\t\tMENU\t\t\t");
		System.out.println("================================================================");
		System.out.println("1. Input the information of 11 countries in East Asia");
		System.out.println("2. Display the information of country you've just input");
		System.out.println("3. Search the information of country by user-entered name");
		System.out.println("4. Display thi information of countries sorted name in ascending order");
		System.out.println("5. Exit");
		System.out.println("================================================================");
		
		int option;
		Scanner scan = new Scanner(System.in);
		option = scan.nextInt();
		return option;
	}
	public static void run() throws Exception {
		ManageEastAsiaCountries EastAsia = new ManageEastAsiaCountries();
		int option;
		do {
			option = menu();
			switch (option) {
			case 1: {
				EastAsiaCountries country = new EastAsiaCountries();
				EastAsia.addCountryInformation(country);
				break;
			}
			case 2: {
				System.out.println("ID\t\tName\t\tTotal Area\t\tTerrain");
				EastAsia.getRecentlyEnteredInformation().display();
				break;
				
			}
			case 3: {
				System.out.println("Search");
				Scanner scan = new Scanner(System.in);
				EastAsiaCountries[] searchResult = EastAsia.searchInformationByName(scan.nextLine());
				boolean isEmptyArray = true;;
				for(int i = 0; i< searchResult.length;i++) {
					if(searchResult[i] != null) {
						searchResult[i].display();
						isEmptyArray = false;
					}
				}
				if(isEmptyArray == true) System.out.println("Can't Find!");
				break;
			}
			
			case 4: {
				System.out.println("Sort");
				EastAsiaCountries[] sortResult = EastAsia.sortInformationByAscendingOrder();
				for(int i = 0; i < sortResult.length; i++) {
					sortResult[i].display();
				}
				break;
			}
			
			case 5: {
				System.exit(0);
				break;
				
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + option);
			}
		}while(option != 5);
	}
}
