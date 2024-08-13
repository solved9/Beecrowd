import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the coefficients
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // Calculate the discriminant
        double discriminant = (b * b) - (4 * a * c);

        // Check if the discriminant is positive or zero
        if (discriminant >= 0 && a != 0) {
            double sqrtDiscriminant = Math.sqrt(discriminant);
            double R1 = (-b + sqrtDiscriminant) / (2 * a);
            double R2 = (-b - sqrtDiscriminant) / (2 * a);
            
            System.out.println("R1 = " + String.format("%.5f", R1));
            System.out.println("R2 = " + String.format("%.5f", R2));
        } else {
            System.out.println("Impossivel calcular");
        }

        sc.close();  // Close the scanner
    }
}
