import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(11);
        Scanner scanner = new Scanner(System.in);
        int guess;

        do {
            System.out.print("Guess a number: ");
            guess = scanner.nextInt();

            if (guess > randomNumber) {
                System.out.println("Guess was too high");
            } else if (guess < randomNumber) {
                System.out.println("Guess was too low");
            } else {
                System.out.println("SUCCESS!");
            }
        } while (guess != randomNumber);
        
        scanner.close();
    }
}
