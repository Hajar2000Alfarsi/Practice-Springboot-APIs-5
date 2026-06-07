package com.example.UpdateDemo;

public class UpdateDemo {

    public void updateStudentName() {
        String currentStudentName = "Ahmed";
        String newStudentName = "ALi";
        boolean updateSuccessful = false;

        System.out.println("Original Student Name: " + currentStudentName);

        if (!currentStudentName.equalsIgnoreCase(newStudentName)){
            currentStudentName = newStudentName;
            updateSuccessful = true;

            System.out.println("Student name updated successfully.");
        } else {
            updateSuccessful =  false;
            System.out.println("No update required. The names are already the same.");
        }

        System.out.println("Student Name: " + currentStudentName);
        System.out.println("update Status: " + (updateSuccessful ? "Successful" : "No Change Required"));
    }

}
