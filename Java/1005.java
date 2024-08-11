import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A=sc.nextDouble();
       double B=sc.nextDouble();
       double X=((A*3.5)+(B*7.5))/(3.5+7.5);
        System.out.println("MEDIA = "+String.format("%.5f",X));
    }
}
