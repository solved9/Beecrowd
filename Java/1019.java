import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hour=n/3600;
        int minute=n%3600/60;
        int second=n%60;
        System.out.println(hour+":"+minute+":"+second);
    }
}
