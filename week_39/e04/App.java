import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number (0 to quit): ");
            number = scanner.nextInt();

            if (number == 0) {
                break; 
            } else if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println("Even number");
                } else {
                    System.out.println("Odd number");
                }
            } else {
                System.out.println("Please enter a positive number or 0 to quit.");
            }
        } while (true);

        scanner.close();
    }
}
