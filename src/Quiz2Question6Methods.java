public class Quiz2Question6Methods {
    public static void main(String[] args) {
        System.out.println("average : "+average(0, 100));
    }

    public static double average(int start, int finish) {
        int sum = 0;
        int randNum =0;
        double average=0;
         int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            randNum = (int) (start + Math.random() * (finish - start + 1));
            sum += randNum;
            numbers[i]=randNum;
            average = sum / 10.0;
        }
        System.out.println("numbers greater than average : " );
        for (int j = 0 ; j < 10 ; j++){
            if (numbers[j] > average)

            System.out.println(+numbers[j]);;
        }

        return average;
    }
}
