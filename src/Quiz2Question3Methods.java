import java.util.Scanner;

public class Quiz2Question3Methods {
    public static void main(String[] args) {
        //Write a method that returns the number of ‘a’ character in the following sentence. Define ‘a’ character as formal parameters of method.
        //“Programming is the process of creating a set of instructions.”
        Scanner inp = new Scanner(System.in);
        System.out.println("enter a sentence: ");
        String sentence = inp.nextLine();
        System.out.println("enter a character: ");
        char target = inp.next().charAt(0);
        System.out.println("number of character "+ target  + ": " + character(sentence, target));
    }
    public static int character(String sentence, char target){
        int length = sentence.length();
        int count = 0;
        for (int i = 0 ; i < length ; i++){
            if (sentence.charAt(i) == target)
                count++;
        }
        return count;
    }
}
