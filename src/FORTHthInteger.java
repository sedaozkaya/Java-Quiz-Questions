import java.util.Scanner;

public class FORTHthInteger {
    public static void main(String[] args) {
        //Write a program in Java to input 3 integers from keyboard and find their sum and average.
        // If the average is less than 0, then ask the user to enter a positive integer to increase the average.
        // This number must be the 4th integer entered by the user. Calculate the new average that includes 4th integer.
        // If new average is less than 0, then display “Unsuccessful”.
        // If the average is greater than or equal to 0, then display “Average is acceptable”.
        Scanner inp = new Scanner(System.in);
        System.out.println("enter number 1: ");
        int number1= inp.nextInt();
        System.out.println("enter number 2: ");
        int number2 = inp.nextInt();
        System.out.println("enter number 3: ");
        int number3 = inp.nextInt();
        double average = (number1+number2+number3)/3;
        if (average>=0){
            System.out.println("Average is acceptablecd ");
        }
        else {
            System.out.println("enter a positive integer to increase the average");
            int number4 = inp.nextInt();
            double average2= (number1+number2+number3+number4)/4;
            if (average2>=0){
                System.out.println("Average is acceptable");
            }
            else {
                System.out.println("unsuccesful");
            }
        }
    }
}
