import java.util.Scanner;

public class App {
    
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of the week (e.g., MONDAY): ");
        String dayInput = scanner.next().toUpperCase();

        try {
            Day day = Day.valueOf(dayInput);

            switch (day) {
                case MONDAY:
                    System.out.println("Start of the work week!");
                    break;
                case TUESDAY:
                    System.out.println("Second day of the work week!");
                    break;
                case WEDNESDAY:
                    System.out.println("Midweek day!");
                    break;
                case THURSDAY:
                    System.out.println("Almost the weekend!");
                    break;
                case FRIDAY:
                    System.out.println("Last day of the work week! Weekend is near!");
                    break;
                case SATURDAY:
                case SUNDAY:
                    System.out.println("Enjoy the weekend!");
                    break;
                default:
                    System.out.println("Invalid day.");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input. Please enter a valid day (e.g., MONDAY).");
        }

        scanner.close();
    }
}
