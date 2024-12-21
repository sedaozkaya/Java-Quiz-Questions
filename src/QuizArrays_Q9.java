public class QuizArrays_Q9 {
    public static void main(String[] args) {
        //Write a method that declared an array that represents 100 students.
        // Assign the exam scores between 0 and 100 randomly into this array.
        // Write a method that returns average of all student exam results.
        // Display the students who are above the average.
        int[] array = createarr();
        double avg =average(array);
        aboveAverage(array,avg);

    }
    public static int [] createarr(){
        int [] arr = new int [100];
        for(int i = 0 ; i < arr.length ; i++){
            arr [i] = (int)(Math.random()*101);
        }
        return arr;
    }
    public static double average(int [] arr){
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
        }
        return (double) sum/arr.length;
    }
    public static void aboveAverage(int [] arr, double average){
        int b = 0;
        for(int i = 0 ; i < arr.length ; i++){
            b = i+1;
            if(average < arr[i]){
                System.out.println("Student " + b + " is above average of " + average);
            }
        }
    }
}
