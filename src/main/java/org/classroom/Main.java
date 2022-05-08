package org.classroom;

import static org.classroom.Triangle.numOfSides;

public class Main {
    public static void main(String[] args) {
                Triangle triangleA = new Triangle(15,8,15,8 ,7);
           Triangle triangleB =new Triangle(3,2.598, 3,3, 3);
           double triangleAArea = triangleA.findArea();
           System.out.println(triangleAArea);
        System.out.println(numOfSides);

        StudentProfile studentA = new StudentProfile(4.5, "Lorenah", "Mbogo", 2020, "Android");
        StudentProfile studentB= new StudentProfile(4.5, "James", "Musembi",2022, "Fullstack");
        int studentAProfile= studentA.incrementExpectedGraduationYear();

        System.out.println(studentAProfile);






    }}