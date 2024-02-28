import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No numbers provided.");
            return;
        }

        int largest = Integer.MIN_VALUE;

        for (String arg : args) {
            Scanner scanner = new Scanner(arg);
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num > largest) {
                    largest = num;
                }
            }
        }

        System.out.println("The largest number is: " + largest);
    }
}


