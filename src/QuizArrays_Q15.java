public class QuizArrays_Q15 {
    public static void main(String[] args) {
        //10 users roll a dice three times.
        // Dice is a small cube with each side having a different number of spots on it,
        // ranging from one to six. Write a method that assigned dice values for each user,
        // and write a method that displays the dice value.
        // Write a method that displays the user with the highest value at the end of 3 rolls of the dice.
        int [][] arr = createArr();
        printArr(arr);
        max(arr);
    }

    public static int[][] createArr() {
        int[][] arr = new int[10][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (1 + Math.random() * 6);
            }
        }
        return arr;
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i+1) + ". user :  ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(" %-3d",arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void max(int[][] arr) {
        int max = 0;
        int[] sums = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            sums[i] = sum;

        }

        for (int i = 0; i < sums.length; i++) {
            if (sums[i] > max) {
                max = sums[i];
            }
        }

        System.out.print("The max sum is " + max + " and the users with the max sum are: ");
        for (int i = 0; i < sums.length; i++) {
            if (sums[i] == max) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
    }


}
