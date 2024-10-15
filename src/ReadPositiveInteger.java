import java.util.Scanner;

public class ReadPositiveInteger {
    public static void main(String[] args) {
        //Write a Java program that reads an positive integer and count the number of digits the number (less than ten million) has.
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int num = inp.nextInt();
        if (num < 0 || num >= 10000000) {
            System.out.println("Invalid number");
            return;
        }
        String numstr = Integer.toString(num);
        int length = numstr.length();
        System.out.println("The number has " + length + " digits.");


    }
}
