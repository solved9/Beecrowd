import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read three integers
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        // Create an array with the three integers
        int[] num = {a, b, c};

        // Sort the array
        Arrays.sort(num);

       // This prints the sorted array in a readable format
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        // Optionally print the original values (although they are now sorted in `num`)
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
