package fa.training.services;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import fa.training.models.Student;
import fa.training.utils.InvalidIdException;
import fa.training.utils.PhoneFormatException;
import fa.training.utils.Validator;

public class StudentService {

	public Set<Student> createStudent(Scanner scanner, int maxSize) {
		String loop = "";
		String id, name, phone, gender, gpa;
		Student student;
		boolean addStatus = false;

		Set<Student> students = new HashSet<Student>();
		do {
			student = new Student();

			do {
				System.out.println("Enter student id:");
				id = scanner.nextLine();
				try {
					student.setId(id);
				} catch (InvalidIdException e) {
					continue;
				}
				break;
			} while (true);

			System.out.println("Enter student name:");
			name = scanner.nextLine();
			student.setName(name);

			System.out.println("Enter gender:");
			gender = scanner.nextLine();
			student.setGender(gender);

			System.out.println("Enter gpa:");
			gpa = scanner.nextLine();
			student.setGpa(Double.parseDouble(gpa));

			do {
				System.out.println("Enter phone:");
				phone = scanner.nextLine();
				try {
					student.setPhone(phone);
				} catch (PhoneFormatException e) {
					continue;
				}
				break;
			} while (true);

			addStatus = students.add(student);
			if (!addStatus) {
				System.out.println("<<Student existed in Enroll!>>");
			}

			if (students.size() < maxSize) {
				System.out.println("Do you want continue to input student for this course (Y/N)?: ");
				loop = scanner.nextLine();
			} else {
				loop = "N";
			}

			if (loop.charAt(0) != 'Y' && loop.charAt(0) != 'y') {
				Validator.getIds().clear();
			}
		} while (loop.charAt(0) == 'Y' || loop.charAt(0) == 'y');

		return students;
	}
}
