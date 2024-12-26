public class s2024Quiz3 {

        public static void main(String[] args) {

            //question 35
            int array [][] = createArr();
            double [] avg = average(array);
            display(array);
            display(avg);

        }
        public static int[][] createArr(){
            int [][] arr = new int[100][2];
            for (int i = 0 ; i < arr.length ; i++){
                for (int j = 0 ; j < arr[i].length ; j++){
                    arr[i][j] = (int)(Math.random()*101);
                }
            }
            return arr;
        }
        public static double[] average(int [][] array){
            double [] avg = new double[array.length];
            for (int i = 0 ; i < array.length ; i++){
                avg[i] = ((double) (array[i][0] * 4) /10 + (double) (array[i][1] * 6) /10); ;
            }
            return avg;
        }
        public static void display(int[][] arr){
            System.out.printf("%10s %5s", "midterm", "final");
            System.out.println();
            for (int i  = 0 ; i < arr.length ; i++){
                System.out.printf("%-5s" ,"S" + (i+1));
                for (int j = 0 ; j < arr[i].length ; j++ ){
                    System.out.printf(" %-5d",arr[i][j]);
                }
                System.out.println();
            }
        }

        public static void display(double [] avg){
            System.out.println("average:");
            for (int i = 1 ; i < 101 ; i++){
                System.out.printf("%-11s" , "S"+i);

            }
            System.out.println();
            for (int i = 0 ; i < avg.length; i++){

                System.out.printf( "%-10.1f " , avg[i]);
            }
        }
    }


