package com.example.UpdateDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UpdateDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(UpdateDemoApplication.class, args);

		//task 26
		UpdateDemo updateDemo = new UpdateDemo();
		updateDemo.updateStudentName();

		//task 27
		Student student = new Student("Ahmed","A",101);

		System.out.println("---Original Student Data---");
		System.out.println(student);

		student.setStudentName("Ali");

		System.out.println("---After Update---");
		System.out.println(student);
	}


}
