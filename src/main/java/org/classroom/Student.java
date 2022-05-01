package org.classroom;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int studentAge = 15; //        int represents numbers
        double studentGPA = 3.45; //    double represents decimals
        String studentFirstName = "Lorenah"; //   Reference type: String represents a sequence of characters
        String studentLastName = "Mbogo";
        char studentFirstInitial = studentFirstName.charAt(0); //    char represents single characters
        char studentLastInitial = studentLastName.charAt(0); //    charAt() allows you to access a character at a certain index
        boolean hasPerfectAttendance = true; //    boolean represents true or false values

//        System.out.println(studentAge);
//        System.out.println(studentGPA);
//        System.out.println(studentFirstName);
//        System.out.println(studentLastName);
//        System.out.println(studentFirstInitial);
//        System.out.println(studentLastInitial);
//        System.out.println(hasPerfectAttendance);

//        concatenation
        System.out.println(studentFirstName + " " + studentLastName +  " " + "has a GPA of " + studentGPA);
        System.out.println("What do you want to change it to?");
        Scanner input = new Scanner(System.in); //    scanner is used to gather user input
        studentGPA = input.nextDouble(); //     assign user's newly inputted value to the variable studentGPA
        System.out.println(studentFirstName + " " + studentLastName + " "+ "now has a GPA of " + studentGPA);


    }
}
