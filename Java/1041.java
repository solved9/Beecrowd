import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem"); // Origin
        } else if (x == 0) {
            System.out.println("Eixo Y"); // Y-axis
        } else if (y == 0) {
            System.out.println("Eixo X"); // X-axis
        } else if (x > 0 && y > 0) {
            System.out.println("Q1"); // First Quadrant
        } else if (x < 0 && y > 0) {
            System.out.println("Q2"); // Second Quadrant
        } else if (x < 0 && y < 0) {
            System.out.println("Q3"); // Third Quadrant
        } else if (x > 0 && y < 0) {
            System.out.println("Q4"); // Fourth Quadrant
        }
    }
}
