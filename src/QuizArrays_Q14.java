public class QuizArrays_Q14 {
    public static void main(String[] args) {
        //Write a method that randomly fills in chars ‘a’ to ‘z’ into a 10-by-10 matrix,
        // and write a method that prints the matrix,
        // and write a method that displays the number of vowel and consonant.
        char [][] arr= createArr();
        printArr(arr);
        vowelConsonant(arr);
    }

    public static char[][] createArr(){
        char[][] arr = new char[10][10];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = (char)(97 +Math.random() * 26);
            }
        }
        return arr;
    }

    public static void printArr(char[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.printf("%-3c", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void vowelConsonant(char[][] arr){
        char [] vowel = {'a', 'e', 'i', 'o', 'u'};
        int vowelCount = 0;
        int consonantCount ;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                for(int k = 0; k < vowel.length; k++){
                    if(arr[i][j] == vowel[k]){
                        vowelCount++;
                    }

                }

            }
        }
        consonantCount = (arr[0].length * arr.length) - vowelCount;

        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Consonant count: " + consonantCount);
    }
}
