import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
       double c,d,e,f,g;
    c=4.00;
    d=4.5;
    e=5.0;
    f=2;
    g=1.5;
    
switch (a) {
    case 1:
        System.out.println("Total: R$ "+String.format("%.2f",(c*b)));
        break;
    case 2:
        System.out.println("Total: R$ "+String.format("%.2f",(d*b)));
        break;

  case 3:
        System.out.println("Total: R$ "+String.format("%.2f",(e*b)));
        break;
    case 4:
        System.out.println("Total: R$ "+String.format("%.2f",(f*b)));
        break;
  case 5:
        System.out.println("Total: R$ "+String.format("%.2f",(g*b)));
        break;
   
}
    }
}
