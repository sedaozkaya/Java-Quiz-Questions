public class QuizIOQuestion2020 {
    public static void main(String[] args) {
        int number1= 1+(int)(Math.random()*10);
        int number2= 1+(int)(Math.random()*10);
        double result=0;
        if (number1%2==0 && number2==0){
            if (number1>number2){
                result = number1/number2;
            }
            else {
                result=number2/number1;
            }
        } else if (number1%2==1 && number2%2==1) {
            int pre_result=number1*number2;
            int length= String.valueOf(pre_result).length();
            if (length==2){
                String multplyenums = String.valueOf(pre_result);
                char num3= multplyenums.charAt(0);
                char num4= multplyenums.charAt(1);
                result= (int)(num3/num4);
            }
            else {
                result= number1+number2;
            }
            System.out.println(result);
        }
    }
}
