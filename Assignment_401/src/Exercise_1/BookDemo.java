package Exercise_1;

public class BookDemo {

	public static void main(String[] args) {
		Book[] b = new Book[30];
		
		b[0] = new Book("Book 1", 10, "Edward", "USA");
		b[1] = new Book("Book 2", 20, "Edward", "USA");
		b[2] = new Book("Book 3", 30, "Edward", "USA");
		b[3] = new Book("Book 4", 40, "Edward", "USA");
		b[4] = new Book("Book 5", 50, "Edward", "USA");
		b[5] = new Book("Book 6", 60, "Edward", "USA");
		b[6] = new Book("Book 7", 70, "Edward", "USA");
		
		System.out.println("Book information of index 3: \n" + b[3].getBookInfor());;
	}

}
