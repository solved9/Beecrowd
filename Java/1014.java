import java.io.IOException;
import java.util.Scanner;

public class Main{
public static void main(String[] args) throws IOException{
  Scanner sc = new Scanner(System.in);
int distance=sc.nextInt();
double fuel=sc.nextDouble();
double total=distance/fuel;
System.out.println(String.format("%.3f",total)+" km/l");

    }
}
