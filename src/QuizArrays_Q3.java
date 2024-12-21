import javax.swing.*;

public class QuizArrays_Q3 {
    public static void main(String[] args) {
        //Suppose the weekly hours for all employees are stored in a two-dimensional array.
        // Each row records an employee’s seven-day work hours with seven columns.
        // For example, the following array stores the work hours for eight employees.
        // Write a method that create a two dimensional array randomly between 1 to 9.
        // Write a method that displays the wages of employees in an array.
        // The wage is 1000 ₺ for 30 hours and less.
        // If over 30 hours, 50 ₺ per hour will be added to the wage.
        int numberOfEmp = 8;
        int[][] array = createArray(numberOfEmp);
        int[][] wage = wageCalculator(array);
        displaywage(wage);

    }


    public static int[][] createArray(int numberOfEmp) {
        int[][] array = new int[numberOfEmp][7];
        for (int i = 0; i < numberOfEmp; i++) {
            for (int j = 0; j < 7; j++) {
                array[i][j] = (int) (1 + Math.random() * 9);
            }
        }
        return array;
    }

    public static int[][] wageCalculator(int[][] array) {
        int[][] wage = new int[array.length][1];
        int hour;
        for (int i = 0; i < array.length; i++) {
            hour = 0;
            for (int k = 0; k < array[0].length; k++) {
                hour += array[i][k];

            }
            if (hour <= 30) {
                wage[i][0] = 1000;

            } else {
                wage[i][0] = 1000 + (hour - 30) * 50;

            }
        }
        return wage;
    }

    public static void displaywage(int[][] wage) {
        System.out.printf("%40s", "WAGE");
        System.out.println();
        for (int i = 0, j = 0; i < wage.length; i++) {
            System.out.printf("%-20s" , "EMPLOYEE " + i);
            for (int k = 0; k < wage[0].length; k++) {
                System.out.printf("%20d", wage[i][k]);
            }
            System.out.println();
        }
    }

}
