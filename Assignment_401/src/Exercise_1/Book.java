package Exercise_1;

public class Book {
	String Name;
	int Number;
	String Author;
	String Publisher;
	
	// Constructor
	public Book() {}
	
	public Book(String name, int number, String author, String publisher) {
		super();
		Name = name;
		Number = number;
		Author = author;
		Publisher = publisher;
	}

	// getter/setter
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	
	// Get Book Information
	public String getBookInfor() {
		return (this.Name + " " +  this.Number + " " + 
					this.Author + " " + this.Publisher).toString();
	}
	
}
