import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double total = 0;
        int count = 0;
        double average = 0;

        while (true) {
            System.out.print("Give a test score (-1 to quit): ");
            double score = scanner.nextDouble();

            if (score == -1) {
                break;
            }

            total += score;
            count++;
            average = total / count;
            System.out.printf("Average: %.1f%n", average);
        }

        System.out.println("Summary");
        System.out.println("-------");
        System.out.println("Tests: " + count);
        System.out.printf("Average: %.1f%n", average);
        
        scanner.close();
    }
}
