public class HW2_230316033 {
    public static void main(String[] args) {
        //Seda Şengül Özkaya
        //230316033


        // Create customer name, surname, and gender information and display it
        String[][] customer = createCustomerArray();
        displayCustomerArray(customer);

        // Create customer job state and display it
        int[] customerState = createCustomerJobState(customer);
        String[] jobStatus = customerJobState(customerState);
        displayCustomerJobState(jobStatus);

        //  create customer balance information and display it
        long[] balance = customerBalance(customer);
        double avg = averageBalance(balance);
        displayAverageBalance(avg);

        // Calculate and display current balance
        long[] currentBalance = currentBalance(avg, balance, customerState);
        displayCurrentBalance(currentBalance);

        // Count and display the number of males and females
        numberOfGender(customer);

        // Display all customer details including balance, current balance, and job status
        totalDisplay(customer, balance, jobStatus, currentBalance);
    }

    public static String[][] createCustomerArray() {
        // Create array for customer name, surname, and gender information
        String[][] customer = {
                {"Sezen", "Emir", "F"},
                {"Arda", "Sert", "M"},
                {"Elif", "Mavi", "F"},
                {"Emre", "Kaya", "M"},
                {"Selin", "Deniz", "F"},
                {"Burak", "Yılmaz", "a"}, // Invalid gender inf
                {"Ayşe", "Koç", "F"},
                {"Mehmet", "Can", "M"},
                {"Zeynep", "Acar", "F"},
                {"Fatih", "Öz", "M"},
                {"Gamze", "Tekin", "F"},
                {"Onur", "Polat", "M"},
                {"Nur", "Demir", "F"},
                {"Hakan", "Aksoy", "M"},
                {"Sude", "Yalçın", "F"},
                {"Ali", "Eren", "M"},
                {"Elvan", "Uslu", "F"},
                {"Deniz", "Güler", "M"},
                {"Melis", "Çelik", "F"},
                {"Ela", "Şahin", "F"}
        };
        // Check if the gender information is valid
        for (int i = 0; i < customer.length; i++) {
            if (!customer[i][2].equals("F") && !customer[i][2].equals("M")) {
                System.out.println("Gender should be 'F' or 'M'. Invalid input at index " + i);
            }
        }
        System.out.println("-------------------------------");
        return customer;
    }

    public static void displayCustomerArray(String[][] customerArray) {
        // Display customer information using printf
        System.out.println("CUSTOMER INFORMATION:");
        System.out.printf("%-10s %-10s %-10s", "Name", "Lastname", "Gender");
        System.out.println();
        for (int i = 0; i < customerArray.length; i++) {
            for (int j = 0; j < customerArray[i].length - 1; j++) {

                System.out.printf("%-10s ", customerArray[i][j].substring(0, 2) + "***");

            }
            System.out.printf("%-30s", customerArray[i][2]);
            System.out.println();
        }
        System.out.println("-------------------------------");
    }

    public static int[] createCustomerJobState(String[][] customer) {
        // Declare array for customer job state information
        int[] customerState = new int[customer.length];
        // Assign random values for customer job state
        for (int i = 0; i < customerState.length; i++) {
            customerState[i] = (int) (1 + Math.random() * 4);
        }
        return customerState;
    }

    public static String[] customerJobState(int[] customerState) {
        // Declare an array for job state descriptions
        String[] jobStatus = new String[customerState.length];
        // Assign descriptions to the array based on job state
        for (int i = 0; i < customerState.length; i++) {
            switch (customerState[i]) {
                case 1:
                    jobStatus[i] = "Student";
                    break;
                case 2:
                    jobStatus[i] = "Retired";
                    break;
                case 3:
                    jobStatus[i] = "Employed";
                    break;
                case 4:
                    jobStatus[i] = "Unemployed";
            }

        }
        return jobStatus;
    }

    public static void displayCustomerJobState(String[] jobStatus) {
        // Display job state descriptions using printf
        System.out.println("JOB STATUS: ");
        for (int i = 0; i < jobStatus.length; i++) {
            System.out.printf("%-10s ", jobStatus[i]);
            System.out.println();
        }
        System.out.println("-------------------------------");
    }

    public static long[] customerBalance(String[][] customer) {
        // Declare  array for balance values
        long[] balance = new long[customer.length];
        // Assign random values for balance
        for (int i = 0; i < balance.length; i++) {
            balance[i] = (long) (10000 + Math.random() * 90001);
        }
        return balance;
    }

    public static double averageBalance(long[] balance) {
        // Calculate the average of balances
        long sum = 0;

        for (int i = 0; i < balance.length; i++) {
            sum += balance[i];

        }
        return (double) sum / balance.length;
    }

    public static void displayAverageBalance(double averageBalance) {
        // Display the average balance
        System.out.println("AVERAGE BALANCE: " + averageBalance);
        System.out.println("-------------------------------");
    }

    public static long[] currentBalance(double averageBalance, long[] balance, int[] customerState) {
        // Declare an array for new balance values after adjustments
        long[] currentBalance = new long[balance.length];

        for (int i = 0; i < balance.length; i++) {
            long state1 = 0;
            long state2 = 0;

            // If the balance is above the average, add 2% interest
            if (balance[i] > averageBalance) {
                state1 = (balance[i] * 2) / 100;
            }

            // If the customer is employed or unemployed, deduct 1%
            if (customerState[i] == 3 || customerState[i] == 4) {
                state2 = (balance[i]) / 100;
            }
            currentBalance[i] = balance[i] + state1 - state2;

        }
        return currentBalance;


    }

    public static void displayCurrentBalance(long[] currentBalance) {
        // Display current balances
        System.out.println("CURRENT BALANCE: ");
        for (int i = 0; i < currentBalance.length; i++) {
            System.out.printf("%-30s", currentBalance[i]);
            System.out.println();
        }
        System.out.println("-------------------------------");
    }

    // Count the number of males and females
    public static void numberOfGender(String customer[][]) {
        int female = 0, male = 0;
        for (int i = 0; i < customer.length; i++) {

            if (customer[i][2].equals("F")) {
                female++;
            } else if (customer[i][2].equals("M")) {
                male++;
            }

        }
        System.out.println("NUMBER OF GENDER: ");
        System.out.println("Female: " + female);
        System.out.println("Male: " + male);
        System.out.println("-------------------------------");

    }

    // Extra method:
    // Display customer details, balance, updated balance, and job status using printf
    public static void totalDisplay(String[][] customer, long[] balance, String[] customerState, long[] currentBalance) {
        System.out.println("TOTAL DISPLAY: ");
        System.out.printf("%-10s %-10s %-10s %-15s %-15s %-15s\n", "Name", "Lastname", "Gender", "Balance", "CurrentBalance", "CustomerState");
        for (int i = 0; i < customer.length; i++) {
            System.out.printf(
                    "%-10s %-10s %-10s %-15d %-15d %-15s\n",
                    customer[i][0].substring(0, 2) + "***",
                    customer[i][1].substring(0, 2) + "***",
                    customer[i][2],


                    balance[i],
                    currentBalance[i],
                    customerState[i]
            );
        }
    }

}
