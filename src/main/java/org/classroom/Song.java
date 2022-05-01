package org.classroom;

import java.util.Scanner;

public class Song {
    public static void main(String[] args) {
//        Create a while loop to replay the current song if the user puts it on repeat
//        And play the next song if the while loop is false and the user does not put it on repeat.

        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while (isOnRepeat){
            System.out.println("Playing current song.");
            System.out.println("Would you like to take this song off of repeat? If so, answer yes.");
            String userInput = input.next();
            if(userInput.equals("yes")){
                isOnRepeat= true;
                System.out.println("Playing same song again!");
            }else if (userInput.equals("no")){
                isOnRepeat= true;
                System.out.println("Playing same song again!");
            }else{
                isOnRepeat= false;
                System.out.println("Playing next song!");
            }
        }
    }
}
