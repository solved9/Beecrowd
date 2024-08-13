import java.util.*;
public class Main {
 
    public static void main(String[] args) {
 
      Scanner sc = new Scanner(System.in);
      int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
      int sum1=c+d;
      int sum2=a+b;
      if (sum1>sum2 && b>c && d>a && a%2==0){
          System.out.println("Valores aceitos");
      }
      else{
          System.out.println("Valores nao aceitos");
      }
 
    }
 
}
