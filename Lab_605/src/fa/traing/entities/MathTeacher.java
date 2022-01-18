package fa.traing.entities;

public class MathTeacher extends Teacher implements Actionable{
	private String mainSubject;

	public MathTeacher() {
		super();
	}

	public MathTeacher(String designation, String collegeName, String mainSubject) {
		super(designation, collegeName);
		this.mainSubject = mainSubject;
	}

	public String getMainSubject() {
		return mainSubject;
	}

	public void setMainSubject(String mainSubject) {
		this.mainSubject = mainSubject;
	}
	
	public void teach(String content) {}
	
	@Override
	public String toString() {
		return "MathTeacher [mainSubject=" + mainSubject + ", Designation=" + getDesignation() + ", Collegename=" + getCollegeName() + "]" ;
	}
	
	@Override
	public void toSchool() {
		System.out.println("Math teacher go to school by car!");
	}
}
