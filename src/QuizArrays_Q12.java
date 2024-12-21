public class QuizArrays_Q12 {
    public static void main(String[] args) {
        //Write a method that randomly fills in integers between 0 to 10 into a 5-by-5 matrix,
        // and write a method that prints the matrix,
        // and write a method that swapped the rows and columns of the array.
        int [][] arr = createArr();
        printArr(arr);
        System.out.println("swap array:");
        printArr(swapArr(arr));
    }
    public static int[][] createArr(){
        int[][] arr = new int[5][5];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*11);
            }
        }
        return arr;
    }

    public static void printArr(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.printf("%-3d ", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println();
    }

    public static int [][] swapArr(int[][] arr){
        int [][] newArr = new int[arr.length][arr[0].length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                newArr[i][j] = arr[j][i];
            }
        }
        return newArr;
    }
}
