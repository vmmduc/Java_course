package exercise2;

import java.util.Scanner;

public class ArrayContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String stringArray[] = {"FPT","Fresher", "Acedemy", "2018"};
		  String sValue;
		  
		  Scanner s = new Scanner(System.in);
		  sValue = s.nextLine();
		  
		  boolean isContrain = false;
		  for(int i = 0; i < stringArray.length; i++) {
			  if(stringArray[i].equals(sValue)) {
				  isContrain = true;
			  }
		  }
		  System.out.println("Check '" + sValue + "' in Array: " + 
				  (isContrain == true ? "Contained!":"Not Contrained!"));
	}

}
