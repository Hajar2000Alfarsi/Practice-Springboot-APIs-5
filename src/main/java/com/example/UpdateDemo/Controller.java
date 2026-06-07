package com.example.UpdateDemo;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    Student student = new Student("Ahmed","A",101);

    @PutMapping("/updateStudent")
    public String updateStudent(@RequestParam String name) {
        String previousName = student.getStudentName();

        student.setStudentName(name);

        return "Student name updated successfully.\n" +
                "Previous Name: " + previousName + "\n" +
                "New Name: " + student.getStudentName();
    }
}
