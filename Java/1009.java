import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
       double D = sc.nextDouble();
       double C = sc.nextDouble();

       double X= (C*15)/100;
       double salary=D+X;

       System.out.println("TOTAL = R$ "+String.format("%.2f",salary));
    }
}

