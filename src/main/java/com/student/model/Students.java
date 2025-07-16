package com.student.model;

import java.util.*;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class Students {
	private String studentName;
	private String studentID;

	private List<StudentsMarks> marks;
	
}
