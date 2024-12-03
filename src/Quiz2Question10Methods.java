public class Quiz2Question10Methods {
    public static void main(String[] args) {
        //Write a method that returns the average of positive integer numbers among 10 random numbers generated between -20 and +20.
        // Define the numbers -20 and 20 as formal parameters of method.
        System.out.println("average: "+average(-20,20));
    }

    public static double average(int start, int finish) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < 10; i++) {
            int randNum = (int) (start + Math.random() * (finish - start + 1));
            if (randNum > 0) {
                sum += randNum;
                count++;

            }

        }
        if (count == 0){
            System.out.println("there is no positive integer");
            return 0;

        }
        return (double) sum / count;
    }
}
