package org.classroom;

import java.util.Scanner;

public class TeaTime {
//    we define our function outside the main function
    public static void announceDeveloperTeaTime(){
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type in a random word and press Enter to start developer tea time.");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time!");

    }

    public static void main(String[] args) {
//We call our function in the main function
        announceDeveloperTeaTime();
    }
}
