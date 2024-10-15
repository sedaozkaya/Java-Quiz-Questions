import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("x: ");
        double x= inp.nextDouble();
        System.out.println("y: ");
        double y = inp.nextDouble();
        double result = 2*Math.pow(x,3) - 3* Math.pow(y,2) + 5*x -25;
        System.out.println(result);
    }
}
