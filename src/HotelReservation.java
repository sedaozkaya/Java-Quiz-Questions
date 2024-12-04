import java.util.Scanner;
public class HotelReservation {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println( "select the days: ");
        int day= input.nextInt();
        if (day == 3){
            System.out.println("enter the number of person: ");
            int person= input.nextInt();
            if (person == 1){
                System.out.println("room type: 3 days " + "\n" + "payment: 900tl");
            } else if (person == 2){
                System.out.println("room type: 3 days " + "\n" + "payment: 750tl");
            } else if (person==3) {
                System.out.println("room type: 3 days " + "\n" + "payment: 800tl");
            }
                else if (person <6) {
                System.out.println("room type: 3 days " + "\n" + "payment: 2000tl");
            }
        } else if (day == 7) {
            System.out.println("enter the number of person: ");
            int person= input.nextInt();
            if (person == 1){
                System.out.println("room type: 7 days " + "\n" + "payment: 2500tl");
            } else if (person == 2){
                System.out.println("room type: 7 days " + "\n" + "payment: 2100tl");
            } else if (person==3) {
                System.out.println("room type: 7 days " + "\n" + "payment: 3200tl");
            }
            else if (person <6) {
                System.out.println("NONE");
            }
        }
        else {
            System.out.println("No suitable room found");
        }
    }
}
