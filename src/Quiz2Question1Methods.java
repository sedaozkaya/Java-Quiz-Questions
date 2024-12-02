public class Quiz2Question1Methods {
    public static void main(String[] args) {
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
