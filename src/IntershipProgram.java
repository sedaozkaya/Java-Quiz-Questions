import java.util.Scanner;
public class IntershipProgram {
    public static void main(String[] args) {
//        System.out.println("enter the YDS score: ");
//        Scanner input = new Scanner(System.in);
//        int yds = input.nextInt();
//        if (yds >= 0 && yds <= 100 && yds>80){
//            System.out.println("enter the GANO: ");
//            double gano = input.nextDouble();
//            if (gano>= 2.00 && gano <= 4.00 && gano>2.50){
//                System.out.println("enter the age: ");
//                int age = input.nextInt();
//                if (age>20 && age <35){
//                    System.out.println("is it true that you have bachelors degree? " + "\n" + " a) true" + "\n" + "b)false");
//                    boolean degree = inp.hasNextBoolean();
//                    if (degree == true){
//                        System.out.println("acceptable");
//                    }
//                    else {
//                        System.out.println("reject");
//                    }
//
//                }
//                else {
//                    System.out.println("reject");
//                }
//            }
//            else {
//                System.out.println("reject");
//            }
//        }
//        else {
//            System.out.println("reject");
//        }


        Scanner inp = new Scanner(System.in);
        System.out.println("enter the yds score:");
        int yds = inp.nextInt();
        System.out.println("enter the GANO:");
        double gano = inp.nextDouble();
        System.out.println("enter the age:");
        int age = inp.nextInt();
        System.out.println("is it true that you have bachelaors degree? " + "\n" + " a) true" + "\n" + "b)false");
        boolean degree = inp.hasNextBoolean();
        if (yds >= 0 && yds <= 100 && yds>80 && gano>= 2.00 && gano <= 4.00 && gano>2.50 && age>20 && age <35 && degree == true){
            System.out.println("accepted");
        }
        else {
            System.out.println("rejected");
        }


//import java.util.Scanner;
//
//public class IntershipProgram {
//    public static void main(String[] args) {
//        Scanner inp = new Scanner(System.in);
//
//        // YDS Puanı
//        System.out.println("Enter the YDS score (0-100):");
//        int yds = inp.nextInt();
//
//        // GANO Puanı
//        System.out.println("Enter the GANO (2.00 - 4.00):");
//        double gano = inp.nextDouble();
//
//        // Yaş
//        System.out.println("Enter your age:");
//        int age = inp.nextInt();
//
//        // Lisans Diploması Kontrolü
//        System.out.println("Do you have a bachelor's degree? (true/false):");
//        boolean hasDegree = inp.nextBoolean();
//
//        // Koşulların Kontrolü
//        if (yds >= 80 && yds <= 100) {
//            if (gano > 2.50 && gano <= 4.00) {
//                if (age > 20 && age < 35) {
//                    if (hasDegree) {
//                        System.out.println("Acceptable");
//                    } else {
//                        System.out.println("Rejected: Bachelor's degree required");
//                    }
//                } else {
//                    System.out.println("Rejected: Age must be between 21 and 34");
//                }
//            } else {
//                System.out.println("Rejected: GANO must be greater than 2.50");
//            }
//        } else {
//            System.out.println("Rejected: YDS score must be 80 or higher");
//        }
//    }
//}


    }
}
