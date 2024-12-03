public class Quiz2Question9Methods {
    public static void main(String[] args) {
        //Write a method that returns the sum of the square of 10 random integer numbers which are between 1 and 10.
        // Define the numbers 1 and 10 as formal parameters of method.
        System.out.println(squareSum(1, 10));
    }

    public static int squareSum(int start, int finish) {
        int sum = 0;
        int square = 0;
        for (int i = 0; i < 10; i++) {
            int randNum = (int) (start + Math.random() * (finish - start + 1));
            square = randNum * randNum;
            sum += square;
        }
        return sum;
    }
}
