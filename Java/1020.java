import java.util.Scanner;


public class Main {

 public static void main(String[] args) {
  int n;

  Scanner sc = new Scanner(System.in);
  n = sc.nextInt();

  int a = n / 365;
  int rA = n % 365;
  int rM = rA % 30;
  int m = rA / 30;
  int d = rM % 30;

  System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", a, m, d);

 }

}
