import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
       double D = sc.nextDouble();
double sum1=b*D;

        int c = sc.nextInt();
        int e = sc.nextInt();
        double F = sc.nextDouble();
        double sum2=e*F;
        double sum3=sum1+sum2;

       System.out.println("VALOR A PAGAR: R$ "+String.format("%.2f",sum3));
    }
}

