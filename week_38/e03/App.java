import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Is it a weekend? (true/false): ");
        boolean isWeekend = scanner.nextBoolean();

        if ((age < 18 || age > 65) && !isWeekend) {
            System.out.println("You are eligible for a discount");
        } else {
            System.out.println("You are not eligible for a discount");
        }

        scanner.close();
    }
}
