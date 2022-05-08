package org.classroom;

public class StudentProfile {
    //create a class StudentProfile with attributes, GPA, First name, Last name, Expected graduation year and declared major.
    // Have a behaviour that increments the expected graduation year by 1
    double GPA;
    String firstName;
    String lastName;
    int gradYear;
    String decMajor;

    public StudentProfile(double GPA, String firstName, String lastName, int gradYear, String decMajor) {
        this.GPA = GPA;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        this.decMajor = decMajor;
    }

    public int incrementExpectedGraduationYear(){
        return (this.gradYear + 1);
}}
