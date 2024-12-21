public class QuizArray_Q8 {
    public static void main(String[] args) {
        //Write a method that randomly fills in integers between -50 to +50 into a 10-by-10 matrix,
        // write a method that prints the matrix,
        // and write a method that displays the number of the negative and positive numbers in the array.
        int [][] arr = createArr();
        printArr(arr);
        negativePositive(arr);
    }

    public static int [][] createArr(){
        int [][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = (int) (-50 +Math.random() * 101);
            }
        }
        return arr;
    }

    public static void printArr(int[][] arr){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%-4d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void negativePositive(int[][] arr){
        int negative =0;
        int positive =0;
int zero =0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(arr[i][j]<0){
                    negative++;
                }
                 else if(arr[i][j]>0){
                    positive++;
                }
                else {
                    zero++;
                }
            }
        }
        System.out.println("number of negative numbers: "+negative);
        System.out.println("number of positive numbers: "+positive);
        System.out.println("number of zero numbers: "+zero);
    }




}
