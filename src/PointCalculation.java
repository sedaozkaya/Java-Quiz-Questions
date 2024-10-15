import java.util.Scanner;

public class PointCalculation {
    public static void main(String[] args) {
        //Write a Java program based on the following situations.
        //An exam consists of 80 questions. 4 wrong answers eliminate 1 correct answer. Write a program that will determine the level of the student according to the net score.
        //
        //•	The program expects the student to enter the number of correct and incorrect answers, respectively.
        //(the number of correct and incorrect answers cannot be greater than 80, a warning message should be given when the student enters a number greater than 80.)
        //•	The program calculates the net score.
        //•	Shows the student's level according to the table.
        //
        //
        //Level	Net Score
        //A	>70
        //B	>60
        //C	>50
        //D	>=40
        //Unsuccessful	<40
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the number of correct");
        int correct = inp.nextInt();
        if (correct>80){
            System.out.println("invalid number");
        }
        else {
            System.out.println("enter the number of wrong");
            int wrong = inp.nextInt();
            if (wrong>80){
                System.out.println("invalid number");
            }
            else {
                if (wrong+correct>80){
                    System.out.println("invalid number");
                    return ;
                }
                double eliminated_number = wrong/4;
                double net_score = correct - eliminated_number;
                System.out.println(net_score);
                if(net_score>70){
                    System.out.println("A");
                } else if (net_score>60) {
                    System.out.println("B");
                } else if (net_score>50) {
                    System.out.println("C");
                }
                else if (net_score>40){
                    System.out.println("D");
                }
                else {
                    System.out.println("unsuccesful");
                }
            }
        }

    }
}
