import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();


        // Check if N is within the valid range
        if (N <= 1 && N >= 1000) {
            return;
        }
        // Print N * 2 lines of output
        for (int i = 1; i <= N; i = i + 1) {
            for (int j = 1; j <= i; j = j + N) {
                System.out.println(i + " " + i * i + " " + i * i * i);
                int k=((i * i) + 1 );
                int l =((i * i * i) + 1);
                System.out.println(i + " " + k+ " " + l);

        }}
    }}
