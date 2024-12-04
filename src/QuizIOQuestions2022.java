import java.util.Scanner;

public class QuizIOQuestions2022 {
    public static void main(String[] args) {
Scanner inp = new Scanner(System.in);
int trueanswer = 0;
        System.out.println("student answer : " + "\t"+ "answer key: ");

for (int i =1; i<21;i++){
    char key = (char)(65+(int)(Math.random()*5));
    char answer = (char)(65+(int)(Math.random()*5));
    System.out.println(answer + "\t"+"\t"+"\t"+"\t" +"\t"+ key);
    if (answer==key){
        trueanswer=trueanswer+1;
    }


}
        int score = trueanswer*5;
        System.out.println("Your score is: "+score);
        System.out.println("number of true: "+trueanswer);
        if (score>=60){
            System.out.println("You passed");
        }
        else {
            System.out.println("You failed");
        }


        System.out.println("------------------------------------");
        //1th education question
                for (int i = 0; i < 100; i++) {
                    System.out.println("Enter your name: ");
                    String name = inp.nextLine();
                    System.out.println("Enter your surname: ");
                    String surname = inp.nextLine();
                    System.out.println("Enter your student ID: ");
                    int studentID = inp.nextInt();
                    inp.nextLine();  // Scanner ile satır atlaması önlemek için boş bir satır okuma

                    // Şifreyi oluşturan karakterler
                    char first_ch = (char) ('a' + (int) (Math.random() * 26)); // 'a' ve 'z' arası rastgele harf

                    // İkinci ve üçüncü karakter iki basamaklı bir sayı
                    int ch2and3 = (int) (10 + (Math.random() * 90));

                    // Son karakter belirleme
                    char last_ch;
                    if (studentID % 2 == 0) {
                        last_ch = name.charAt(0);  // Öğrenci numarası çiftse, isimden ilk harf
                    } else {
                        last_ch = surname.charAt(surname.length() - 1);  // Tekse, soyadın son harfi
                    }

                    // Şifreyi oluşturma
                    String password = String.valueOf(first_ch) + ch2and3 + last_ch;
                    System.out.println((i + 1) + "th password: " + password);
                }

                inp.close();  // Scanner kaynağını kapatma
            }
        }


