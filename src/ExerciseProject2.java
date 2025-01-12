import java.util.Scanner;

public class ExerciseProject2 {
    public static void main(String[] args) {
        System.out.println("Enter a message: ");
        char[] message = userİnp();
        char[] enc = encryption(message);
        char[] dec = decryption(enc);

        System.out.println("\nEncrypted message: ");
        for (char c : enc) {
            System.out.print(c);
        }

        System.out.println("\nDecrypted message: ");
        for (char c : dec) {
            System.out.print(c);
        }
    }

    public static char[] encryption(char[] message) {
        int[] encrypted = new int[message.length];
        char[] enc = new char[message.length];
        for (int i = 0; i < message.length; i++) {
            if (message[i] == ' ') {
                enc[i] = ' ';
            } else {
                encrypted[i] = message[i] - 65;
                encrypted[i] = (encrypted[i] + 3) % 26;
                enc[i] = (char) (encrypted[i] + 65);
            }
        }
        return enc;
    }

    public static char[] decryption(char[] enc) {
        int[] dec = new int[enc.length];
        char[] encc = new char[enc.length];
        for (int i = 0; i < enc.length; i++) {
            if (enc[i] == ' ') {
                encc[i] = ' ';
            } else {
                dec[i] = enc[i] - 65;
                dec[i] = (dec[i] - 3 + 26) % 26;
                encc[i] = (char) (dec[i] + 65);
            }
        }
        return encc;
    }

    public static char[] userİnp() {
        Scanner inp = new Scanner(System.in);
        boolean control = false;
        String message = "";
        char[] messageCh = null;

        while (!control) {
            message = inp.nextLine();
            message = message.toUpperCase();
            messageCh = new char[message.length()];
            int count = 0;

            for (int i = 0; i < message.length(); i++) {
                messageCh[i] = message.charAt(i);
                if ((messageCh[i] >= 'A' && messageCh[i] <= 'Z') || messageCh[i] == ' ') {
                    count++;
                }
            }

            if (count == message.length()) {
                control = true;
            } else {
                System.out.println("Invalid input. Enter again:");
            }
        }
        return messageCh;
    }
}
