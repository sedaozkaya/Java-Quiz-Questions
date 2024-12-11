import java.util.Scanner;

public class Exercise2_2024 {
    public static void main(String[] args) {
        //n the main method, ask the user to enter an integer between 0 and 99.
        // This number entered by the user is a parameter of your method.
        // Write a method that returns "not maximum number" or "maximum number".
        // Generate 10 integer numbers between 0 and 100 in your method. And,
        // find the maximum number among these numbers and compare it with the user's number.
        // If the user's number is greater than this number, return "maximum number",
        // otherwise, return "not maximum number".
        // (Ana metodta, kullanıcıdan 0 ile 99 arasında bir tam sayı girmesini isteyin.
        // Kullanıcının girdiği bu sayı, metodunuzun bir parametresi olsun.
        // "Maksimum sayı değil" veya "maksimum sayı" döndüren bir metod yazı
        // Metodunuzda 0 ile 100 arasında 10 tam sayı üretin.
        // Bu sayılar içinde en büyük sayıyı bulun ve kullanıcının sayısı ile karşılaştırın.
        // Eğer kullanıcının sayısı bu sayıdan büyükse "maksimum sayı" ,
        // değilse "Maksimum sayı değil" ifadelerini metodunuzdan ana metoda döndürün.)
        System.out.println("Enter an integer between 0 and 99: ");

        System.out.println(maxNumber(isValid()));
    }

    public static String maxNumber(int user) {
        int max = 0;
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 100);
            if (num > max)
                max = num;
        }
        if (user > max)
            return "max number";
        else {
            return "not max number";
        }
    }

    public static int isValid() {
        int num = -1;
        Scanner inp = new Scanner(System.in);
        while (num < 0 || num > 99) {
            System.out.println("enter a number: ");
            num = inp.nextInt();
            if (num < 0 || num > 99)
                System.out.println("invalid number");

        }
        return num;
    }
}
