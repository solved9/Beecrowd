import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input values
        int a = sc.nextInt(); // Start hour
        int c = sc.nextInt(); // Start minute
        int b = sc.nextInt(); // End hour
        int d = sc.nextInt(); // End minute

        // If the start and end times are the same
        if (a == b && c == d) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
            return; // Exit after printing the result for this special case
        }

        // Calculate the total minutes of the start and end times
        int startMinutes = a * 60 + c;
        int endMinutes = b * 60 + d;

        int durationMinutes;

        // Case 1: End time is after start time on the same day
        if (endMinutes >= startMinutes) {
            durationMinutes = endMinutes - startMinutes;
        }
        // Case 2: End time is before start time, indicating crossing midnight
        else {
            durationMinutes = (24 * 60 - startMinutes) + endMinutes;
        }

        // Calculate hours and minutes from total duration minutes
        int durationHours = durationMinutes / 60;
        int durationMinutesRemaining = durationMinutes % 60;

        // Output the result
        System.out.println("O JOGO DUROU " + durationHours + " HORA(S) E " + durationMinutesRemaining + " MINUTO(S)");
    }
}
