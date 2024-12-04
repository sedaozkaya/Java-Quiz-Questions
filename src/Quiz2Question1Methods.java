public class Quiz2Question1Methods {
    public static void main(String[] args) {
        //Write a method that returns the average of the 10 random integer numbers which are between 1 and 10. Define the numbers 1 and 10 as formal parameters of method.
        System.out.println(average(1,10,10));
    }
    public static  double average(int startnum, int finishnum, int numofnum  ){
        int sum = 0;
        for (int i =0 ; i<numofnum;i++){
            int randnum = (int)(startnum + Math.random() * (finishnum - startnum + 1));
            sum +=randnum;
        }
return (double) sum / numofnum;
    }
}
