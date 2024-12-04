public class Exercise2024 {
    public static void main(String[] args) {
        //1. Reverse (3456) displays 6543. Write a test program that prompts the user to enter an integer and displays its reversal.
        System.out.println("Reverse (3456) displays 6543. Write a test program that prompts the user to enter an integer and displays its reversal.");
        System.out.println("Enter an integer: ");
        int num = 3456;
        System.out.println("Reversed number: " + reverse(num));

        main2(args);

    }
    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;

        }
        return reversed;
    }

    public static void main2(String[] args) {
        //2. Write a test program that prompts the user to enter three numbers
        // and invokes the method to display them in increasing order
        System.out.println("Write a test program that prompts the user to enter three numbers and invokes the method to display them in increasing order");
        System.out.println("Enter three numbers: ");
        int num1 = 5;

        int num2 = 3;

        int num3 = 7;
        System.out.println("Numbers in increasing order: ");
        displaySortedNumbers(num1, num2, num3);

    }
    public static void displaySortedNumbers(int num1, int num2, int num3) {
        int temp = 0;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
