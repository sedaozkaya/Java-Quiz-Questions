import java.util.Scanner;

public class QuizArrays_Q6 {
    public static void main(String[] args) {
        //Write a method that randomly fills in integers between 1 to 100 into a 10-by-10 matrix,
        // and write a method that prints the matrix, and ask the user two positive integer between 0 to 9.
        // The first integer represents the row index, the second integer represents the column index.
        // Write a method that displays the element given the row and column index.
       int row = user();
       int column = user();
       printArr(createArr(), row, column);

    }
    public static int [][] createArr(){
        int [][] arr = new int[10][10];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(1+Math.random()*100);
            }
        }
        return arr;
    }
    public static int user(){
        Scanner sc = new Scanner(System.in);
        int n;
        while(true){
            System.out.println("Enter a number(0-9) : ");
            n = sc.nextInt();
            if(n >= 0 && n <= 9){
                break;
            }
            else{
                System.out.println("Invalid input");
            }

        }
        return n;
    }
    public static void printArr(int[][] arr, int row, int col){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.printf("%-5d" ,arr[i][j] );
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("element is "+arr[row][col]);
    }
}
