package fa.traing.management;

import java.awt.Desktop.Action;

import fa.traing.entities.EnglishTeacher;
import fa.traing.entities.MathTeacher;
import fa.traing.entities.Teacher;

public class TeacherManagement {
	public static void main(String[] args) {
		MathTeacher mathTeacher = new MathTeacher("Math teacher", "UTC", "Math");
		EnglishTeacher englishTeacher = new EnglishTeacher("English teacher", "ABC", "English");

		Teacher[] teacher = new Teacher[3];
		teacher[0] = mathTeacher;
		teacher[1] = englishTeacher;
		teacher[2] = new EnglishTeacher("English teacher 2", "FTU", "English");

		for (int i = 0; i < teacher.length; i++) {
			System.out.println("----------TEACHER " + (i + 1) + "-------------");
			System.out.println("College name: " + teacher[i].getCollegeName());
			System.out.println("Designation: " + teacher[i].getDesignation());
			if (teacher[i] instanceof MathTeacher) {
				// print Main subject of i th teacher if who is Math teacher
				System.out.println("Main subject: " + ((MathTeacher) teacher[i]).getMainSubject());
				// Call method toSchool from MathTeacher Class
				((MathTeacher) teacher[i]).toSchool(); // Convert Teacher to MathTeacher
			} else {
				// print Main subject of i th teacher if who is English teacher
				System.out.println("Main subject: " + ((EnglishTeacher) teacher[i]).getMainSubject());
				// Call method toSchool from EnglishTeacher Class then print result
				((EnglishTeacher) teacher[i]).toSchool(); // Convert Teacher to EnglishTeacher

				teacher[i].teach();

				// Call translate method from EnglishTeacher class then return a String
				((EnglishTeacher) teacher[i]).translate("Hello", "Xin chao");
			}
		}
		System.out.println("------------------------------------------");
		Teacher t = new EnglishTeacher("Teacher", "VNU", "English");
		t.toString(); // return a String
		t.teach(); // print result
		t.toSchool(); // print result
	}
}
