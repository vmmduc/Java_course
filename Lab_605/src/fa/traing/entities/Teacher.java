package fa.traing.entities;

public abstract class Teacher implements Actionable{
	private String designation;
	private String collegeName;
	
	public Teacher() {}

	public Teacher(String designation, String collegeName) {
		this.designation = designation;
		this.collegeName = collegeName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public void teach() {}
	public void teach(String content) {}
	
	public void teach(int duration) {
		System.out.println("Teaching in " + duration + " minutes");
	}
}
