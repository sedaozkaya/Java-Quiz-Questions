import java.util.Scanner;

import static java.lang.System.exit;

public class GuessDiceResult {
    public static void main(String[] args) {
        //Write a program that lets the user guess the dice result.
        // The program randomly generates an integer between 1 and 6 (Use the random method: (1 + (int)(Math.random()*6)).
        // The program prompts the user to enter a guess, and reports whether the guess is correct or incorrect.
        // If the user guess is correct, the dice value is added to the user’s score.
        // If it is wrong, the user's score is reduced by the guess value. The user’s initial score is 20.0 points. Finally print the user’s score.
        Scanner inp = new Scanner(System.in);
        int num = (1 + (int)(Math.random()*6));
        System.out.println("enter a number: ");
        int numUser= inp.nextInt();
        if (numUser<1 || numUser>6){
            System.out.println("invalid number");
            exit(0);
        }
        int score = 20;
        if (numUser== num){
            System.out.println("correct");
            score = score+numUser;
            System.out.println("score :" + score);
        }
    else {
            System.out.println("wrong");
            score = score-numUser;
            System.out.println("score :" + score);

        }


    }
}
