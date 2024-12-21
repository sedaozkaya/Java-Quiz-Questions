public class QuizArrays_Q7 {
    public static void main(String[] args) {
        //Write a method that randomly fills in integers between 1 to 100 into a 10-by-10 matrix,
        // and write a method that prints the matrix,
        // and write a method that displays the number of the even and odd numbers in the array.
        int [][] array = createArr();
        printArr(array);
        oddAndEven(array);
    }
    public static int [][] createArr(){
        int [][] arr = new int[10][10];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                arr[i][j] = (int)(1+Math.random()*100);
            }
        }
        return arr;
    }

    public static void printArr(int[][] arr){
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.printf("%-3d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void oddAndEven(int[][] arr){
        int odd = 0;
        int even = 0;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(arr[i][j] % 2 == 0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        System.out.println("odd: " + odd);
        System.out.println("even: " + even);



    }
}
