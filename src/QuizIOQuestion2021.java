import java.util.Scanner;

public class QuizIOQuestion2021 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter your age:");
        int age = inp.nextInt();
        System.out.println("enter your gender:");
        String gender = inp.next();

     char firstletter = gender.toUpperCase().charAt(0);


                if (firstletter == 'F' && age > 20 && age <= 25) {
                    System.out.println("A");
                }

                 else if ((firstletter == 'F' || firstletter == 'M') && age > 25 && age <= 35) {
                    System.out.println("B");
                }

                 else if (firstletter == 'M' && age > 35
                ) {
                    System.out.println("C");

                }
                 else {
                    System.out.println("not matched");
                }


        }


    }


