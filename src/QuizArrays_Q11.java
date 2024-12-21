public class QuizArrays_Q11 {
    public static void main(String[] args) {
        //Write a method that randomly fills in integers between 0 to 100 into a 10-by-10 matrix,
        // and wirte a method that prints the matrix,
        // and write a method taht displays the prime numbers.
        int [][] arr = createArr();
        printArr(arr);
        prime(arr);
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
                System.out.printf( " %-5d" , arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void prime(int[][] arr) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                count = 0;
                for (int k = 1; k <=arr[i][j]; k++) {
                    if (arr[i][j] % k== 0) {
                        count++;
                    }
                }
                if (arr[i][j] == 0 || arr[i][j] == 1) {
                    System.out.println(arr[i][j] + " is not prime number  at index  [" + i + "][" + j + "]");
                }
                 else if (count == 2)
                    System.out.println(arr[i][j] + " is prime number at index       [" + i + "][" + j + "]");
                else {
                    System.out.println(arr[i][j] + " is not prime number at index   [" + i + "][" + j + "]");
                }


            }
        }

    }
}
