import java.util.Scanner;

public class Quiz3Q1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter a row(1-9): ");
        int row = inp.nextInt();
        System.out.println("enter a column(1-9)");
        int column = inp.nextInt();
        arr(row,column);
    }
    public static int[][] arr (int row , int column){
        int [][] arr = new int[10][10];
        for (int i = 0 ; i < arr.length; i++){
            for (int j = 0 ; j < arr.length ; j++){
                arr[i][j] = (int)(1+Math.random()*100);
            }
        }


        return arr;
    }

}
