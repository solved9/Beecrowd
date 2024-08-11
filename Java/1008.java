import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int A = sc.nextInt();
       int B = sc.nextInt();
       double C = sc.nextDouble();
       double X=B*C;
       System.out.println("NUMBER = "+A);
        System.out.println("SALARY = U$ "+String.format("%.2f",X));
    }
}

