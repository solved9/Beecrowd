import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();

        if (b > a) {
            int res = b - a;
            System.out.println("O JOGO DUROU " + res + " HORA(S)");
        } else if (b < a) {
            int res = (24 - a) + b; // Calculates the duration when crossing midnight
            System.out.println("O JOGO DUROU " + res + " HORA(S)");
        } else if (b == a) {
            System.out.println("O JOGO DUROU 24 HORA(S)"); // Handles the case where game duration is exactly 24 hours
        }

    }}
