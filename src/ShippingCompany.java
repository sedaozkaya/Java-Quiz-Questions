import java.util.Scanner;

public class ShippingCompany {
    public static void main(String[] args) {
        //A shipping company uses the following function to calculate the cost of shipping based on the weight of the package.
        //
        //Write a program that prompts the user to enter the weight of the package and display the shipping cost.
        // If the weight is greater than 20, display a message “the package cannot be shipped.”
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the weight of package");
        double cost = 0;
        double w = inp.nextInt();
        if (0<w && w <= 2){
            cost= 2.5;
        } else if (2<w && w <= 4) {
            cost=4.5;
        }
        else if (4<w && w <= 10) {
            cost=7.5;
        }else if (10<w && w <= 20) {
            cost=10.5;
        } else if (w>20) {
            System.out.println("the package cannot be shipped");

        }
        System.out.println("cost of package: " + cost);


    }
}
