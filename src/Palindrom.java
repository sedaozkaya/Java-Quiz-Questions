import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter a number 3 digit");
        int num = inp.nextInt();
        if (num<0){
            num = num * -1;}
        String numstr= Integer.toString(num);
        int length = numstr.length();


        if (length != 3){
            System.out.println("plz enter 3 digit");
            return;
        }
        else {
            if (numstr.charAt(0) == numstr.charAt(2)){
                System.out.println("palindrom");
            }
            else {
                System.out.println("not palindrom");
            }
        }

    }
}
