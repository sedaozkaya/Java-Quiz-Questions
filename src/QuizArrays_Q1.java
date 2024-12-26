import java.util.Arrays;
import java.util.Scanner;

public class QuizArrays_Q1 {
    public static void main(String[] args) {
        //Write a method that randomly fills in integers between 1 to 100 into a 10-by-10 matrix,
        // and write an other method that displays this matrix.
        // Ask the user two positive integer between 0 to 9.
        // The first integer represents the row index, the second integer represents the column index.
        // Write a method that sums the user’s row elements and user’s column elements,
        // and displays the user array
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the row number (0-9):");
        int row = isValid(scanner);

        System.out.println("Enter the column number (0-9):");
        int column = isValid(scanner);

        int[][] matrix = createArray();
        printArray(matrix);


        printArrayUser(row, column, matrix);
    }

    public static int[][] createArray() {
        int[][] arr = new int[10][10];


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = (int) (1 + Math.random() * 100);
            }
        }
        return arr;
    }

    public static void printArray(int[][] arr) {
        System.out.println("Matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void printArrayUser(int row, int col, int[][] arr) {
        int[] newArr = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[row][i] + arr[i][col];
        }


        System.out.println("New Array:");
        System.out.println(Arrays.toString(newArr));
    }

    public static int isValid(Scanner scanner) {
        int num = scanner.nextInt();

        while (num < 0 || num > 9) {
            System.out.print("Invalid input. Enter a number between 0 and 9: ");
            num = scanner.nextInt();
        }

        return num;
    }
}
