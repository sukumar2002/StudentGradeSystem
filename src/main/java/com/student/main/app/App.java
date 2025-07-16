package com.student.main.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.student.appconfig.AppConfig;
import com.student.service.StudentService;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentService service = context.getBean(StudentService.class);
		service.saveDetails();
	}
}
