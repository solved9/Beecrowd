import java.util.*;
public class Main{
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
double c=(double)a;
double d=(double)b;
double result=(c*d)/12;
System.out.println(String.format("%.3f",result));

}
}
