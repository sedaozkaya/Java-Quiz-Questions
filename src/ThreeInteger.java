import java.util.Scanner;

public class ThreeInteger {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1= inp.nextInt();
        System.out.println("enter number 2");
        int num2= inp.nextInt();
        System.out.println("enter number 3");
        int num3= inp.nextInt();
        double sum = num1+  num2+num3;
        double average= sum/3;

        if ( num1 >0 && num2>0 && num3>0){
            System.out.println("all of the integers are positive");
            System.out.println("sum: "+sum);
            System.out.println("average: "  + average);
        }
       else if (         num1 <0 && num2<0 && num3<0)
{
    System.out.println("All of the integers are negative");
    System.out.println("sum: "+sum);
    System.out.println("average: "  + average);
}
        else {
            System.out.println("integers are not acceptable");
        }

    }
}
