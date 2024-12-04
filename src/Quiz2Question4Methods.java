public class Quiz2Question4Methods {
    public static void main(String[] args) {
evennegative(-10 ,10);
    }

    public static void evennegative(int start, int finish) {
        int negativecounter = 0;
//Write a void method that displays the negative even numbers of the generated 10 random numbers between -10 and +10. If there is no negative even number, print "negative even number not found". Define the numbers -10 and +10 as formal parameters of method.
        for (int i = 0; i < 10; i++) {

            int randNum = (int) (start + Math.random() * (finish - start + 1));
            if ( randNum < 0 && randNum % 2 == 0) {
                negativecounter++;
                System.out.println(randNum);
            }
        }
        if (negativecounter == 0)
            System.out.println("negative even number not found");

    }
}
