package org.classroom;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
//        Implement a multiple choice question where :
//        1. Ask One question: three answer choices(one is correct)
//        2. Output the answer choices to user
//        3.Collect user input and print the appropriate message depending on answer given.

//Have user input an answer and retrieve the user input
        Scanner input = new Scanner(System.in);
        boolean isCorrect = true;

        while (isCorrect) {
//            Print statement to ask the question
            System.out.println("Who is the current president of Kenya?");
//Print statement to list answer choices
            System.out.println("A:Raila Odinga");
            System.out.println("B:Peter Kenneth");
            System.out.println("C:Uhuru Kenyatta");
            String userInput = input.next();
//If user input is correct congratulate the user
            if (userInput.equals("C")) {
                isCorrect= false;
                System.out.println("Congratulations! You got that right!");//If user input is correct congratulate the user
//If user input is incorrect show right answer
            }  else{
                isCorrect= true;
                System.out.println("Your answer is incorrect. The current president of Kenya is Uhuru Kenyatta");


            }

        }
    }
}

