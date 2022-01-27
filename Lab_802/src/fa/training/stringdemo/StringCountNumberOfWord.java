package fa.training.stringdemo;

public class StringCountNumberOfWord {
	public void demonstrateCountWord() {
		System.out.println("demonstrateCountWord() !!!");
		
		countNumberOfWord("My name is Admin");
		countNumberOfWord("I love Java Programming");
		countNumberOfWord("This is not properly formatted data");
		
	}
	
	private static void countNumberOfWord(String str) {
		String trimmedLine = str.trim();
		int count = trimmedLine.isEmpty() ? 0 : 
			trimmedLine.split("\\s+").length;
		
		System.out.println(count);
	}
}
