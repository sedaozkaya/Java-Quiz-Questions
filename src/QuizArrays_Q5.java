public class QuizArrays_Q5 {
    public static void main(String[] args) {
        int[][] arr = createArr();
        printArr(arr);
        smallest(arr);
    }


    public static int[][] createArr() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = 1 + (int) (Math.random() * 20); // 1 ile 20 arasında rastgele sayılar
            }
        }
        return arr;
    }


    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%-5d", arr[i][j]);
            }
            System.out.println();
        }
    }


    public static void smallest(int[][] arr) {
        int smallest = 21;
        int smallestRow = -1;
        int smallestCol = -1;


        String[] locations = new String[25];
        int a = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < smallest) {
                    smallest = arr[i][j];
                    a = 0;
                    locations[a] = i + "," + j;
                } else if (arr[i][j] == smallest) {

                    a++;
                    locations[a] = i + "," + j;
                }
            }
        }


        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i <= a; i++) {
            System.out.println("Location: " + locations[i]);
        }
    }
}
