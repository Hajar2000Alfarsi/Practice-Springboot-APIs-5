package com.example.UpdateDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UpdateDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(UpdateDemoApplication.class, args);

		UpdateDemo updateDemo = new UpdateDemo();
		updateDemo.updateStudentName();
	}


}
