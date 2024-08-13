import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
 if  (a>5 && a<2000){
for(int i=2;i<=a;i=i+2){
    int n=i*i;
    System.out.println(i+"^"+"2"+ " = "+n);
}
    }

    }
}
