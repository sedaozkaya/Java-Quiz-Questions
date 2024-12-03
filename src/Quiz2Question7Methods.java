import java.util.Scanner;

public class Quiz2Question7Methods {
    public static void main(String[] args) {
        //Ask the user to enter two positive integers which are arguments of the method.
        // Write a method that returns the sum of the odd numbers between these two numbers.
        Scanner inp = new Scanner(System.in);
        System.out.println("enter first number: ");
        int num1 = inp.nextInt();
        num1 = isPositive(num1);


        System.out.println("enter second number: ");
        int num2 = inp.nextInt();
        num2 = isPositive(num2);

        System.out.println("sum: "+sumodd(num1, num2));

    }

    public static int sumodd(int num1, int num2) {
        int temp = 0;
        int temp2 = 0;
        int sum = 0;
        if (num1 > num2) {
            temp = num1;
            temp2 = num2;
            num2 = temp;
            num1 = temp2;
        }
        for (int i = num1 + 1; i < num2; i++) {
            if (i % 2 == 1)
                sum += i;
        }
        return sum;
    }

    public static int isPositive(int num) {
        Scanner inp2 = new Scanner(System.in);
        while (num <= 0) {
            System.out.println("number should be positive. enter again: ");
            num = inp2.nextInt();
        }
        return num;
    }
}
