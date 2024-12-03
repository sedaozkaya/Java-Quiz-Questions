public class Quiz2Question8Methods {
    public static void main(String[] args) {
        //Generate the 10 random integer numbers between 1 and 20.
        // Write a void method that displays the maximum number among these random numbers.
        // Define the numbers 1 and 20 as formal parameters of method.
        max(1 ,20);
    }
    public static void max(int start , int finish){

        int[] numbers = new int[10];
        for (int i = 0 ; i < 10; i++){
            int randNum = (int)(start + Math.random()*(finish-start+1));
            numbers[i]=randNum;
        }
        int max = numbers[0];
        for (int j  = 1 ;j < 10 ; j++){

            max  = Math.max(max, numbers[j]);
        }
        System.out.println("maximum number: "+max);
    }
}
