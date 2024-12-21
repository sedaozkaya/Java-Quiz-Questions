public class QuizArrays_Q10 {
    public static void main(String[] args) {
        int array[][] = createArr();
        printArr(array);
        control(array);
    }

    public static int[][] createArr() {
        int[][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = (int) (Math.random() * 101);
            }
        }
        return arr;
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%-5d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void control(int[][] arr) {
        for (int i = 0; i < 10; i++) {
            boolean flag = true;
            int oneDigitCount = 0;
            int twoDigitCount = 0;

            for (int j = 0; j < 10; j++) {
                if (arr[i][j] > 9) {
                    flag = false;
                    twoDigitCount++;
                } else {
                    oneDigitCount++;
                }
            }

            if (flag) {
                System.out.println(i + ". row contains only one-digit numbers. (" + oneDigitCount + " one-digit and " + twoDigitCount + " two-digit numbers)");
            } else {
                System.out.println(i + ". row does not contain only one-digit numbers. (" + oneDigitCount + " one-digit and " + twoDigitCount + " two-digit numbers)");
            }
        }

        for (int i = 0; i < 10; i++) {
            boolean flag = true;
            int oneDigitCount = 0;
            int twoDigitCount = 0;

            for (int j = 0; j < 10; j++) {
                if (arr[j][i] > 9) {
                    flag = false;
                    twoDigitCount++;
                } else {
                    oneDigitCount++;
                }
            }

            if (flag) {
                System.out.println(i + ". column contains only one-digit numbers. (" + oneDigitCount + " one-digit and " + twoDigitCount + " two-digit numbers)");
            } else {
                System.out.println(i + ". column does not contain only one-digit numbers. (" + oneDigitCount + " one-digit and " + twoDigitCount + " two-digit numbers)");
            }
        }
    }
}
