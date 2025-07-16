package com.student.repoimple;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.student.model.Students;
import com.student.repositary.StudentRepo;

@Repository
public class StudentRepoImple implements StudentRepo {
	private List<Students> students = new ArrayList<>();

	@Override
	public void save(Students student) {
		students.add(student);
		System.out.println("Student Saved Successfully:");
		System.out.println(student);

	}

}
