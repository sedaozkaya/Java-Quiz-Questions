public class Water {
    public static void main(String[] args) {
        final int TOTAL_CAPACITY = 50;
        int currentWater = TOTAL_CAPACITY / 2;
        int time = 0;

        while (currentWater < TOTAL_CAPACITY) {
            currentWater += 3; // Faucet adds 3 liters per minute
            currentWater -= 2; // Hole causes a loss of 2 liters per minute
            time++;
        }

        System.out.println("Time to fill the container to 50 liters: " + time + " minutes");
    }
}