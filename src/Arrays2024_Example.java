public class Arrays2024_Example {
    public static void main(String[] args) {
        double[][] arr = createArray();
        display(arr);
        double[] arr2 = average(arr);
        displayAverage(arr2);
    }


    public static double[][] createArray() {
        double[][] arr = new double[6][7];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = -10 + Math.random() * 61;
            }
        }
        return arr;
    }


    public static void display(double[][] arr) {
        String[] city = {"Ankara", "İstanbul", "İzmir", "Adana", "Bursa", "Çanakkale"};

        System.out.printf("%-15s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "Region/City", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-15s ", city[i]);

            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%-10.1f ", arr[i][j]);
            }
            System.out.println();
        }
    }


    public static double[] average(double[][] arr) {
        double[] average = new double[arr[0].length];
        for (int j = 0; j < arr[0].length; j++) {
            double sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][j];
            }
            average[j] = sum / arr.length;
        }
        return average;
    }


    public static void displayAverage(double[] arr) {
        System.out.printf("%-15s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "Day", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
        System.out.print("                 ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-10.1f ", arr[i]);
        }
    }
}
