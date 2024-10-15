import java.util.Scanner;

import static java.lang.System.exit;

public class FlipOfcoin {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter 0 for head and 1 for tail: ");
        int guess = inp.nextInt();


        if (guess !=1 && guess!=0){
            System.out.println("invalid number");
            exit(0);
        }


        int coin = (int)(Math.random()*2);

        if (guess==coin){
            System.out.println("correct");
        }
else {
            System.out.println("wrong");
        }

    }
}
