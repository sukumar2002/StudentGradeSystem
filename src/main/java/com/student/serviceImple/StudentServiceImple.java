package com.student.serviceImple;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.model.Students;
import com.student.model.StudentsMarks;
import com.student.repositary.StudentRepo;
import com.student.service.StudentService;

@Service
public class StudentServiceImple implements StudentService {
	@Autowired
	private StudentRepo studentRepo;

	private Scanner scanner = new Scanner(System.in);

	@Override
	public void saveDetails() {
		Students student = new Students();
		StudentsMarks marks = new StudentsMarks();

		System.out.print("Enter Student Name: ");
		student.setStudentName(scanner.nextLine());

		System.out.print("Enter Student ID: ");
		student.setStudentID(scanner.nextLine());

		System.out.println("Enter Marks for 6 Subjects:");
		System.out.print("Telugu: ");
		marks.setTelugu(scanner.nextInt());

		System.out.print("English: ");
		marks.setEnglish(scanner.nextInt());

		System.out.print("Hindi: ");
		marks.setHindi(scanner.nextInt());

		System.out.print("Maths: ");
		marks.setMaths(scanner.nextInt());

		System.out.print("Science: ");
		marks.setScience(scanner.nextInt());

		System.out.print("Social: ");
		marks.setSocial(scanner.nextInt());

		int total = marks.getTelugu() + marks.getEnglish() + marks.getHindi() + marks.getMaths() + marks.getScience()
				+ marks.getSocial();
		double avg = total / 6.0;

		marks.setTotal_marks(total);
		marks.setAvg(avg);

		boolean isFail = marks.getTelugu() < 35 || marks.getEnglish() < 35 || marks.getHindi() < 35
				|| marks.getMaths() < 35 || marks.getScience() < 35 || marks.getSocial() < 35;

		if (isFail) {
			marks.setResult("Fail");
			marks.setStudent_grade('F');
		} else {
			marks.setResult("Pass");

			if (avg >= 90)
				marks.setStudent_grade('A');
			else if (avg >= 75)
				marks.setStudent_grade('B');
			else if (avg >= 60)
				marks.setStudent_grade('C');
			else
				marks.setStudent_grade('D');
		}

		List<StudentsMarks> list = new ArrayList<>();
		list.add(marks);
		student.setMarks(list);

		studentRepo.save(student);

	}
}
