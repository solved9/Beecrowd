import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        double g=((a*2)+(b*3)+(c*4)+(d*1))/10;
        double ave = Math.floor(g * 10) / 10;

        if(ave>=7){
            System.out.println("Media: "+String.format("%.1f",ave));
            System.out.println("Aluno aprovado.");
        }

        else if (ave<5){
            System.out.println("Media: "+String.format("%.1f",ave));
            System.out.println("Aluno reprovado.");
        }

        else if (ave>=5 && ave<=6.9){
            System.out.println("Media: "+String.format("%.1f",ave));
            System.out.println("Aluno em exame.");
            double e=sc.nextDouble();
            double f=(ave+e)/2;
            System.out.println("Nota do exame: "+String.format("%.1f",e));
            if(f>=5){
                System.out.println("Aluno aprovado.");}
            else{
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: "+String.format("%.1f",f));
        }

    }
}
