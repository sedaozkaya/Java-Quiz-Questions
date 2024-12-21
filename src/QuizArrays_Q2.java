public class QuizArrays_Q2 {
    public static void main(String[] args) {

        int numberOfEmployee = 10;
        int[][] array = createArray(numberOfEmployee);

        displayArray(array);
        displayMostWorking(array);
    }

    public static int[][] createArray(int numberOfEmployee) {
        int[][] array = new int[numberOfEmployee][7];
        for (int i = 0; i < numberOfEmployee; i++) {
            for (int j = 0; j < 7; j++) {
                array[i][j] = (int) (1 + Math.random() * 9);
            }
        }
        return array;
    }

    public static void displayArray(int[][] array) {
        System.out.printf("%25s %4s %4s %4s %4s %4s %4s  ", "Su", "M", "T", "W", "Th", "F", "Sa");
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-20s", "Employee " + i);
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void displayMostWorking(int[][] array) {
        int mostSum = 0;
        int[] mostWorkingEmployees = new int[array.length];
        int a = 0;

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }

            if (sum > mostSum) {
                mostSum = sum;
                mostWorkingEmployees[0] = i;
                a = 1;
            } else if (sum == mostSum) {
                mostWorkingEmployees[a] = i;
                a++;
            }
        }

        System.out.print("Most working employee: ");
        for (int i = 0; i < a; i++) {
            System.out.print("Employee " + mostWorkingEmployees[i] + " ");
        }
        System.out.println("(Total hours: " + mostSum + ")");
    }
}
