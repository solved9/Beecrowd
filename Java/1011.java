import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p=3.14159;
        double R=sc.nextDouble();
        double R3=R*R*R;
        double volume=(4*p*R3)/3;
       System.out.println("VOLUME = "+String.format("%.3f",volume));
    }
}

