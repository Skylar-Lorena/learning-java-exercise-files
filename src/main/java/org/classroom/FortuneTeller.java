package org.classroom;

import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();
//        if-else statements test the condition. It executes the if block if condition is true otherwise else block is executed.
       if (inputtedNum <5){
           System.out.println("Enjoy the good luck a friend brings you.");
       }else {
           System.out.println("Your shoe selection will make you happy today.");
       }

    }
}
//Only the if block or else block was executed. This is because of scope.
// Scope of a variable is the part of the program where a piece of code is accessible or in which it can be used.
