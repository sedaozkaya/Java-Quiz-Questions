public class QuizArrays_Q13 {
    public static void main(String[] args) {
        //Write a method that randomly fills in integers
        // between 0 to 10 into a 5-by-5 matrix,
        // and write a method that prints the matrix,
        // and write a method that finds the largest number,
        // and counts its occurrences
        int[][] arr = createArr();
        printArr(arr);
        biggest(arr);
    }

    public static int[][] createArr() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = (int) (Math.random() * 11);
            }
        }
        return arr;
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%-3d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void biggest(int[][] arr) {
        int biggest = -1;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > biggest) {
                    biggest = arr[i][j];
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == biggest) {
                    counter++;
                }
            }
        }

        System.out.println("the biggest number is " + biggest);
        System.out.println("the biggest number occurs " + counter + " times");
    }
}
