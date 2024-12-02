public class Quiz2Question2Methods {
    public static void main(String[] args) {
        System.out.println(totaleven(1, 10, 10));
    }

    public static int totaleven(int start, int finish, int numofnum) {
        int count = 0;
        for (int i = 0; i < numofnum; i++) {
            int randnum = (int) (start + Math.random() * (finish - start + 1));
            if (randnum % 2 == 0)
                count ++;
        }
        return count;
    }

}
