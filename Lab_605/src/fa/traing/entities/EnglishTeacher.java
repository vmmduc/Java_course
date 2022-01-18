package fa.traing.entities;

public class EnglishTeacher 
	extends Teacher implements Actionable{
	private String mainSubject;
	
	public EnglishTeacher() {
		super();
	}

	public EnglishTeacher(String designation, String collegename ,String mainSubject) {
		super(designation, collegename);
		this.mainSubject = mainSubject;
	}

	public String getMainSubject() {
		return mainSubject;
	}

	public void setMainSubject(String mainSubject) {
		this.mainSubject = mainSubject;
	}

	public String translate(String en, String vi) {
		return en + " in Vietnamese " + vi;
	}
	public void teach(int duration){
		System.out.println("English teacher is teaching in " + duration + " minutes");
	}

	public void teach() {
		System.out.println("Teaching English subject");
	}
	@Override
	public void toSchool() {
		System.out.println("English teacher go to school by motorbike");
	}
	
	public String toString() {
		return "EnglishTeacher [mainSubject=" + mainSubject + ", Designation=" + getDesignation() + ", Collegename=" + getCollegeName() + "]" ;
	}
}
