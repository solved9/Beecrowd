import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Read two integer values
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Check if one number is a multiple of the other
        if (b % a == 0 || a % b == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        
        // Close the Scanner
        sc.close();
    }
}
