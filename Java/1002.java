import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A=3.14159;
        double R=sc.nextDouble();
        double X=A*(R*R);
        System.out.println("A="+String.format("%.4f",X));
    }
}
