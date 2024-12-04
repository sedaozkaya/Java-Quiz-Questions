import java.util.Scanner;

public class Quiz2Question5Methods {
    public static void main(String[] args) {
        //Ask the user to enter two positive integers. If she/he enters a negative integer, warn the user and ask her/him to enter two positive integers again. These positive integers are arguments of the method. Write a method that returns the “negative” or “positive” result, if the difference between these two numbers is negative or positive.
        Scanner inp = new Scanner(System.in);


        System.out.println("Enter a positive integer: ");
        int num1 = isPositive(inp.nextInt());
        System.out.println("Enter another positive integer: ");
        int num2 = isPositive(inp.nextInt());


        System.out.println("The difference is " + difference(num1, num2));
    }

    public static int isPositive(int num) {
        Scanner inp2 = new Scanner(System.in);
        while (num <= 0) {
            System.out.println("Number should be positive. Enter again:");
            num = inp2.nextInt();
        }
        return num;
    }

    public static String difference(int num1, int num2) {
        int diff = num1 - num2;
        if (diff < 0) {
            return "negative";
        } else if (diff > 0) {
            return "positive";
        } else {
            return "difference is 0";
        }
    }
}
