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
        System.out.println("------------------------------------");
                 //Q2

        System.out.println("Enter your name : ");

        String name = inp.nextLine();
        System.out.println("Enter your surname: ");
        String  surname = inp.nextLine();
        System.out.println("Enter your student ID: ");
        int studentID = inp.nextInt();
        String id_final = String.valueOf(studentID);
        String password = name.substring(0,2) + surname.substring(surname.length()-3) + id_final.substring(id_final.length()-3);
        System.out.println("Your password is: " + password);

        }


    }


