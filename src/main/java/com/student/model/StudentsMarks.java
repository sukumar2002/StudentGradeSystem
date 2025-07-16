package com.student.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentsMarks {
  
	private int telugu;
	private int english;
	private int hindi;
	private int maths;
	private int science;
	private int social;
	private int total_marks;
	private double avg;
	private char student_grade;
	private String result;
}
